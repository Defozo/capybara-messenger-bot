package eu.kapibary.capybaramessengerbot.dao.model;

import java.util.List;

public class SurveyOverallListJson {

    List<SurveyOverall> surveyOverallList;

    public SurveyOverallListJson(List<SurveyOverall> surveyOverallList) {
        this.surveyOverallList = surveyOverallList;
    }

    public List<SurveyOverall> getSurveyOverallList() {
        return surveyOverallList;
    }

    public void setSurveyOverallList(List<SurveyOverall> surveyOverallList) {
        this.surveyOverallList = surveyOverallList;
    }
}
