
package eu.kapibary.capybaramessengerbot.dao.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Publish {

    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("entries")
    @Expose
    private Object entries;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Object getEntries() {
        return entries;
    }

    public void setEntries(Object entries) {
        this.entries = entries;
    }

}
