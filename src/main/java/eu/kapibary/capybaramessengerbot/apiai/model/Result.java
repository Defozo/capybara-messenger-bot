
package eu.kapibary.capybaramessengerbot.apiai.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Result {

    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("resolvedQuery")
    @Expose
    private String resolvedQuery;
    @SerializedName("speech")
    @Expose
    private String speech;
    @SerializedName("action")
    @Expose
    private String action;
    @SerializedName("actionIncomplete")
    @Expose
    private Boolean actionIncomplete;
    @SerializedName("parameters")
    @Expose
    private Parameters parameters;
    @SerializedName("contexts")
    @Expose
    private List<Context> contexts = null;
    @SerializedName("metadata")
    @Expose
    private Metadata metadata;
    @SerializedName("fulfillment")
    @Expose
    private Fulfillment fulfillment;
    @SerializedName("score")
    @Expose
    private Double score;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getResolvedQuery() {
        return resolvedQuery;
    }

    public void setResolvedQuery(String resolvedQuery) {
        this.resolvedQuery = resolvedQuery;
    }

    public String getSpeech() {
        return speech;
    }

    public void setSpeech(String speech) {
        this.speech = speech;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Boolean getActionIncomplete() {
        return actionIncomplete;
    }

    public void setActionIncomplete(Boolean actionIncomplete) {
        this.actionIncomplete = actionIncomplete;
    }

    public Parameters getParameters() {
        return parameters;
    }

    public void setParameters(Parameters parameters) {
        this.parameters = parameters;
    }

    public List<Context> getContexts() {
        return contexts;
    }

    public void setContexts(List<Context> contexts) {
        this.contexts = contexts;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public Fulfillment getFulfillment() {
        return fulfillment;
    }

    public void setFulfillment(Fulfillment fulfillment) {
        this.fulfillment = fulfillment;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

}
