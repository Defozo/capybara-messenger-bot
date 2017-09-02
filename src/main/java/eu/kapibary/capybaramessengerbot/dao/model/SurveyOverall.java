package eu.kapibary.capybaramessengerbot.dao.model;

public class SurveyOverall {

    private Long surveyId;
    private String surveyName;

    public SurveyOverall(Long surveyId, String surveyName) {
        this.surveyId = surveyId;
        this.surveyName = surveyName;
    }

    public Long getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(Long surveyId) {
        this.surveyId = surveyId;
    }

    public String getSurveyName() {
        return surveyName;
    }

    public void setSurveyName(String surveyName) {
        this.surveyName = surveyName;
    }
}
