
package com.zlabs.ml.sms.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class QueryModel {

    @SerializedName("model")
    @Expose
    private String model;
    @SerializedName("strQuery")
    @Expose
    private String strQuery;

    /**
     *
     * @return
     * The model
     */
    public String getModel() {
        return model;
    }

    /**
     *
     * @param model
     * The model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     *
     * @return
     * The strQuery
     */
    public String getStrQuery() {
        return strQuery;
    }

    /**
     *
     * @param strQuery
     * The strQuery
     */
    public void setStrQuery(String strQuery) {
        this.strQuery = strQuery;
    }

}
