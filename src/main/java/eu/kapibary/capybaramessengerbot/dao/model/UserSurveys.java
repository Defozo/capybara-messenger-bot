package eu.kapibary.capybaramessengerbot.dao.model;

import java.util.List;

public class UserSurveys {

    private List<SurveyOverall> availableSurveys;
    private List<SurveyOverall> completedSurveys;

    public UserSurveys(List<SurveyOverall> availableSurveys, List<SurveyOverall> completedSurveys) {
        this.availableSurveys = availableSurveys;
        this.completedSurveys = completedSurveys;
    }

    public List<SurveyOverall> getAvailableSurveys() {
        return availableSurveys;
    }

    public void setAvailableSurveys(List<SurveyOverall> availableSurveys) {
        this.availableSurveys = availableSurveys;
    }

    public List<SurveyOverall> getCompletedSurveys() {
        return completedSurveys;
    }

    public void setCompletedSurveys(List<SurveyOverall> completedSurveys) {
        this.completedSurveys = completedSurveys;
    }
}
