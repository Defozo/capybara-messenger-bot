package eu.kapibary.capybaramessengerbot.apiai.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ApiAIResponse {

    @SerializedName("speech")
    @Expose
    private String speech;
    @SerializedName("displayText")
    @Expose
    private String displayText;
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("contextOut")
    @Expose
    private List<ContextOut> contextOut = null;

    public List<ContextOut> getContextOut() {
        return contextOut;
    }

    public void setContextOut(List<ContextOut> contextOut) {
        this.contextOut = contextOut;
    }

    public String getSpeech() {
        return speech;
    }

    public void setSpeech(String speech) {
        this.speech = speech;
    }

    public String getDisplayText() {
        return displayText;
    }

    public void setDisplayText(String displayText) {
        this.displayText = displayText;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

}