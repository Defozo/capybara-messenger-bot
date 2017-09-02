package eu.kapibary.capybaramessengerbot.apiai.handler;

import com.mashape.unirest.http.exceptions.UnirestException;
import eu.kapibary.capybaramessengerbot.apiai.model.ApiAIRequest;
import eu.kapibary.capybaramessengerbot.apiai.model.ApiAIResponse;
import eu.kapibary.capybaramessengerbot.apiai.model.ContextOut;
import eu.kapibary.capybaramessengerbot.dao.SurveyDao;
import eu.kapibary.capybaramessengerbot.dao.model.AnswerJson;
import eu.kapibary.capybaramessengerbot.dao.model.Survey;
import eu.kapibary.capybaramessengerbot.dao.model.VoucherJson;
import eu.kapibary.capybaramessengerbot.repositories.UserRepository;

import java.util.ArrayList;
import java.util.List;

import static eu.kapibary.capybaramessengerbot.repositories.UserRepository.abc;
import static eu.kapibary.capybaramessengerbot.repositories.UserRepository.userIdsWithProgress;

public class AnswerQuestionHandler implements IntentHandler {
    @Override
    public ApiAIResponse handle(ApiAIRequest apiAIRequest) throws UnirestException {
        ApiAIResponse apiAIResponse = new ApiAIResponse();
        String userId = apiAIRequest.getOriginalRequest().getData().getSender().getId();
        Integer surveyId = userIdsWithProgress.get(userId).getSurveyId();
        Integer questionId = userIdsWithProgress.get(userId).getQuestionId();
        Survey survey = SurveyDao.getSurvey(surveyId);
        String answer = apiAIRequest.getOriginalRequest().getData().getMessage().getText();
        userIdsWithProgress.get(userId).getAnswers().add(answer);
        String response;
        if (questionId < survey.getQuestions().size()) {
            userIdsWithProgress.get(userId).setQuestionId(questionId+1);
            response = survey.getQuestions().get(questionId).getQuestion();
        } else {
            List<ContextOut> contextOuts = new ArrayList<>();
            apiAIResponse.setContextOut(contextOuts);
            VoucherJson voucher = SurveyDao.getVoucher(userId, userIdsWithProgress.get(userId));
            if (voucher.getDiscount().getType().equals("AMOUNT")) {
                response = "Thank you for you answers! Here is your promo code worth " + voucher.getDiscount().getAmountOff() + " PLN in our store: " + voucher.getCode();
            } else {
                response = "Thank you for you answers! Here is your promo code which gives you " + voucher.getDiscount().getPercentOff() + "% off in our store: " + voucher.getCode();
            }
        }
        apiAIResponse.setDisplayText(response);
        apiAIResponse.setSpeech(response);
        apiAIResponse.setSource("CapybaraBot");
        return apiAIResponse;
    }
}
