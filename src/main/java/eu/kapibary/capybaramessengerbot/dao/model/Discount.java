
package eu.kapibary.capybaramessengerbot.dao.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Discount {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("amount_off")
    @Expose
    private Object amountOff;
    @SerializedName("percent_off")
    @Expose
    private Integer percentOff;
    @SerializedName("unit_off")
    @Expose
    private Object unitOff;
    @SerializedName("unit_type")
    @Expose
    private Object unitType;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object getAmountOff() {
        return amountOff;
    }

    public void setAmountOff(Object amountOff) {
        this.amountOff = amountOff;
    }

    public Integer getPercentOff() {
        return percentOff;
    }

    public void setPercentOff(Integer percentOff) {
        this.percentOff = percentOff;
    }

    public Object getUnitOff() {
        return unitOff;
    }

    public void setUnitOff(Object unitOff) {
        this.unitOff = unitOff;
    }

    public Object getUnitType() {
        return unitType;
    }

    public void setUnitType(Object unitType) {
        this.unitType = unitType;
    }

}
