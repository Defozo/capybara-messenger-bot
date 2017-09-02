
package eu.kapibary.capybaramessengerbot.dao.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Redemption {

    @SerializedName("quantity")
    @Expose
    private Object quantity;
    @SerializedName("redeemed_quantity")
    @Expose
    private Integer redeemedQuantity;
    @SerializedName("redeemed_amount")
    @Expose
    private Object redeemedAmount;
    @SerializedName("redemption_entries")
    @Expose
    private Object redemptionEntries;

    public Object getQuantity() {
        return quantity;
    }

    public void setQuantity(Object quantity) {
        this.quantity = quantity;
    }

    public Integer getRedeemedQuantity() {
        return redeemedQuantity;
    }

    public void setRedeemedQuantity(Integer redeemedQuantity) {
        this.redeemedQuantity = redeemedQuantity;
    }

    public Object getRedeemedAmount() {
        return redeemedAmount;
    }

    public void setRedeemedAmount(Object redeemedAmount) {
        this.redeemedAmount = redeemedAmount;
    }

    public Object getRedemptionEntries() {
        return redemptionEntries;
    }

    public void setRedemptionEntries(Object redemptionEntries) {
        this.redemptionEntries = redemptionEntries;
    }

}
