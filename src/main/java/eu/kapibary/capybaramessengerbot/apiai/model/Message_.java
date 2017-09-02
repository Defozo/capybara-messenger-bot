
package eu.kapibary.capybaramessengerbot.apiai.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Message_ {

    @SerializedName("mid")
    @Expose
    private String mid;
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("seq")
    @Expose
    private Integer seq;

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

}
