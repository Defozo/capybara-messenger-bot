package eu.kapibary.capybaramessengerbot.dao.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Survey {

    private Integer surveyId;
    @SerializedName("question")
    @Expose
    private List<Question> questions;
    private List<Answer> answers;

    public Survey(Integer surveyId, List<Question> questions) {
        this.surveyId = surveyId;
        this.questions = questions;
    }

    public Integer getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(Integer surveyId) {
        this.surveyId = surveyId;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
