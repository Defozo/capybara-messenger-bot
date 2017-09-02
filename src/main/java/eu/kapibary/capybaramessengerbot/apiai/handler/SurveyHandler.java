package eu.kapibary.capybaramessengerbot.apiai.handler;

import com.mashape.unirest.http.exceptions.UnirestException;
import eu.kapibary.capybaramessengerbot.apiai.model.ApiAIRequest;
import eu.kapibary.capybaramessengerbot.apiai.model.ApiAIResponse;
import eu.kapibary.capybaramessengerbot.dao.SurveyDao;
import eu.kapibary.capybaramessengerbot.dao.model.SurveyOverall;
import eu.kapibary.capybaramessengerbot.repositories.SurveyProgress;

import java.util.List;

import static eu.kapibary.capybaramessengerbot.repositories.UserRepository.abc;
import static eu.kapibary.capybaramessengerbot.repositories.UserRepository.userIdsWithProgress;

public class SurveyHandler implements IntentHandler {

    @Override
    public ApiAIResponse handle(ApiAIRequest apiAIRequest) throws UnirestException {
        ApiAIResponse apiAIResponse = new ApiAIResponse();
        Integer selectedSurveyId = Integer.valueOf(apiAIRequest.getResult().getParameters().getSurveyId());
        String userId = apiAIRequest.getOriginalRequest().getData().getSender().getId();
        userIdsWithProgress.put(userId,
                new SurveyProgress(1, selectedSurveyId));
        String firstQuestion = SurveyDao.getSurvey(selectedSurveyId).getQuestions().get(0).getQuestion();
        apiAIResponse.setDisplayText(firstQuestion);
        apiAIResponse.setSpeech(firstQuestion);
        apiAIResponse.setSource("CapybaraBot");
        return apiAIResponse;
    }
}
