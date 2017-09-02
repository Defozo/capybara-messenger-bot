package eu.kapibary.capybaramessengerbot.apiai.handler;

import com.mashape.unirest.http.exceptions.UnirestException;
import eu.kapibary.capybaramessengerbot.apiai.model.ApiAIRequest;
import eu.kapibary.capybaramessengerbot.apiai.model.ApiAIResponse;
import eu.kapibary.capybaramessengerbot.dao.model.SurveyOverall;

import java.util.List;

import static eu.kapibary.capybaramessengerbot.dao.SurveyDao.getAvailableSurveyList;

public class SurveyListHandler implements IntentHandler {
    @Override
    public ApiAIResponse handle(ApiAIRequest apiAIRequest) throws UnirestException {
        ApiAIResponse apiAIResponse = new ApiAIResponse();
        String userId = apiAIRequest.getOriginalRequest().getData().getSender().getId();
        List<SurveyOverall> availableSurveyList = getAvailableSurveyList(userId);
        StringBuilder answerBuilder = new StringBuilder();
        answerBuilder.append("Here are some available surveys for you:\n");
        for (int i = 0; i < availableSurveyList.size(); i++) {
            answerBuilder.append(i+1);
            answerBuilder.append(". ");
            answerBuilder.append(availableSurveyList.get(i).getSurveyName());
            answerBuilder.append("\n");
        }
        answerBuilder.append("Which one do you want to answer?");
        apiAIResponse.setDisplayText(answerBuilder.toString());
        apiAIResponse.setSpeech(answerBuilder.toString());
        apiAIResponse.setSource("CapybaraBot");
        return apiAIResponse;
    }




}
