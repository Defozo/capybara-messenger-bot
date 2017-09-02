package eu.kapibary.capybaramessengerbot.dao.model;

import java.util.List;

public class AnswerJson {

    Integer surveyId;
    List<String> answers;

    public AnswerJson(Integer surveyId, List<String> answers) {
        this.surveyId = surveyId;
        this.answers = answers;
    }

    public Integer getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(Integer surveyId) {
        this.surveyId = surveyId;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }
}
