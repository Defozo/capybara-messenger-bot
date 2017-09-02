
package eu.kapibary.capybaramessengerbot.dao.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VoucherJson {

    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("campaign")
    @Expose
    private String campaign;
    @SerializedName("category")
    @Expose
    private Object category;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("discount")
    @Expose
    private Discount discount;
    @SerializedName("gift")
    @Expose
    private Object gift;
    @SerializedName("publish")
    @Expose
    private Publish publish;
    @SerializedName("redemption")
    @Expose
    private Redemption redemption;
    @SerializedName("active")
    @Expose
    private Boolean active;
    @SerializedName("metadata")
    @Expose
    private Object metadata;
    @SerializedName("assets")
    @Expose
    private Object assets;
    @SerializedName("start_date")
    @Expose
    private String startDate;
    @SerializedName("expiration_date")
    @Expose
    private String expirationDate;
    @SerializedName("additional_info")
    @Expose
    private Object additionalInfo;
    @SerializedName("is_referral_code")
    @Expose
    private Boolean isReferralCode;
    @SerializedName("referrer_id")
    @Expose
    private Object referrerId;
    @SerializedName("updated_at")
    @Expose
    private Integer updatedAt;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCampaign() {
        return campaign;
    }

    public void setCampaign(String campaign) {
        this.campaign = campaign;
    }

    public Object getCategory() {
        return category;
    }

    public void setCategory(Object category) {
        this.category = category;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public Object getGift() {
        return gift;
    }

    public void setGift(Object gift) {
        this.gift = gift;
    }

    public Publish getPublish() {
        return publish;
    }

    public void setPublish(Publish publish) {
        this.publish = publish;
    }

    public Redemption getRedemption() {
        return redemption;
    }

    public void setRedemption(Redemption redemption) {
        this.redemption = redemption;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Object getMetadata() {
        return metadata;
    }

    public void setMetadata(Object metadata) {
        this.metadata = metadata;
    }

    public Object getAssets() {
        return assets;
    }

    public void setAssets(Object assets) {
        this.assets = assets;
    }

    public Object getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(Object additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public Boolean getIsReferralCode() {
        return isReferralCode;
    }

    public void setIsReferralCode(Boolean isReferralCode) {
        this.isReferralCode = isReferralCode;
    }

    public Object getReferrerId() {
        return referrerId;
    }

    public void setReferrerId(Object referrerId) {
        this.referrerId = referrerId;
    }

    public Integer getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Integer updatedAt) {
        this.updatedAt = updatedAt;
    }

}
