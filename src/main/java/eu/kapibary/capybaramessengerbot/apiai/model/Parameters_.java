
package eu.kapibary.capybaramessengerbot.apiai.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Parameters_ {

    @SerializedName("facebook_sender_id")
    @Expose
    private String facebookSenderId;

    public String getFacebookSenderId() {
        return facebookSenderId;
    }

    public void setFacebookSenderId(String facebookSenderId) {
        this.facebookSenderId = facebookSenderId;
    }

}
