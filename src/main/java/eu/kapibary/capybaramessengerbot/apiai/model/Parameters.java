
package eu.kapibary.capybaramessengerbot.apiai.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Parameters {

    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("subject")
    @Expose
    private String subject;
    @SerializedName("level")
    @Expose
    private String level;
    @SerializedName("answer")
    @Expose
    private String answer;

    public String getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(String surveyId) {
        this.surveyId = surveyId;
    }

    @SerializedName("surveyId")
    @Expose
    private String surveyId;

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
