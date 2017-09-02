
package eu.kapibary.capybaramessengerbot.apiai.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("sender")
    @Expose
    private Sender sender;
    @SerializedName("recipient")
    @Expose
    private Recipient recipient;
    @SerializedName("message")
    @Expose
    private Message_ message;
    @SerializedName("timestamp")
    @Expose
    private Double timestamp;

    public Sender getSender() {
        return sender;
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }

    public Recipient getRecipient() {
        return recipient;
    }

    public void setRecipient(Recipient recipient) {
        this.recipient = recipient;
    }

    public Message_ getMessage() {
        return message;
    }

    public void setMessage(Message_ message) {
        this.message = message;
    }

    public Double getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Double timestamp) {
        this.timestamp = timestamp;
    }

}
