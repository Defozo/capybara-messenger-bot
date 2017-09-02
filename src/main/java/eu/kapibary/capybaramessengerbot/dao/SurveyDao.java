package eu.kapibary.capybaramessengerbot.dao;

import com.google.gson.Gson;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import eu.kapibary.capybaramessengerbot.dao.model.*;
import eu.kapibary.capybaramessengerbot.repositories.SurveyProgress;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SurveyDao {

    private final static String BASE_URL = "https://bb92f869.ngrok.io";

    public static List<SurveyOverall> getAvailableSurveyList(String userId) throws UnirestException {
        String response = Unirest
                .get(BASE_URL + "/companies/0/users/" + userId)
                .asString().getBody();
        SurveyOverall[] surveyOverallArray = new Gson().fromJson(response, SurveyOverall[].class);

        /*List<SurveyOverall> surveyOverallList = new ArrayList<>();
        surveyOverallList.add(new SurveyOverall(1L, "Our customers feedback"));*/
        return new ArrayList<>(Arrays.asList(surveyOverallArray));
    }

    public static Survey getSurvey(Integer surveyId) throws UnirestException {
       String response = Unirest
                .get(BASE_URL + "/companies/0/surveys/" + surveyId)
                .asString().getBody();
       Gson gson = new Gson();
       Survey survey = gson.fromJson(response, Survey.class);
//       survey.getQuestions().get().setQuestionId();
        /*List<Question> questions = new ArrayList<>();
        questions.add(new Question(0, "How do you rate us?"));
        if (surveyId.equals(1)) {
            questions.add(new Question(1, "Is your pig big?"));
        }
        questions.add(new Question(2, "Do you like coming to us?"));
        Survey survey = new Survey(1, questions);*/
        return survey;
    }

    public static VoucherJson getVoucher(String userId, SurveyProgress surveyProgress) throws UnirestException {
        AnswerJson answerJson = new AnswerJson(surveyProgress.getSurveyId(), surveyProgress.getAnswers());
        String json = new Gson().toJson(answerJson);
        String response = Unirest
                .post(BASE_URL + "/companies/0/users/" + userId)
                .header("content-type", "application/json;charset=UTF-8")
                .body(json)
                .asString()
                .getBody();
        VoucherJson voucherJson = new Gson().fromJson(response, VoucherJson.class);
        return voucherJson;
    }
}
