
package eu.kapibary.capybaramessengerbot.apiai.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Fulfillment {

    @SerializedName("speech")
    @Expose
    private String speech;
    @SerializedName("messages")
    @Expose
    private List<Message> messages = null;

    public String getSpeech() {
        return speech;
    }

    public void setSpeech(String speech) {
        this.speech = speech;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

}
