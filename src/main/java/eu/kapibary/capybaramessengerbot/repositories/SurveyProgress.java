package eu.kapibary.capybaramessengerbot.repositories;

import javafx.collections.transformation.SortedList;

import java.util.ArrayList;
import java.util.List;

public class SurveyProgress {

    Integer questionId;
    Integer surveyId;

    public SurveyProgress(Integer questionId, Integer surveyId, List<String> answers) {
        this.questionId = questionId;
        this.surveyId = surveyId;
        this.answers = answers;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }

    List<String> answers = new ArrayList<>();

    public SurveyProgress(Integer questionId, Integer surveyId) {
        this.questionId = questionId;
        this.surveyId = surveyId;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public Integer getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(Integer surveyId) {
        this.surveyId = surveyId;
    }
}
