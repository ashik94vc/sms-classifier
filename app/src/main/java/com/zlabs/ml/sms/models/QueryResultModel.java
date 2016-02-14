package com.zlabs.ml.sms.models;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class QueryResultModel {

    @SerializedName("result")
    @Expose
    private List<Integer> result = new ArrayList<Integer>();
    @SerializedName("query")
    @Expose
    private List<String> query = new ArrayList<String>();

    /**
     *
     * @return
     * The result
     */
    public List<Integer> getResult() {
        return result;
    }

    /**
     *
     * @param result
     * The result
     */
    public void setResult(List<Integer> result) {
        this.result = result;
    }

    /**
     *
     * @return
     * The query
     */
    public List<String> getQuery() {
        return query;
    }

    /**
     *
     * @param query
     * The query
     */
    public void setQuery(List<String> query) {
        this.query = query;
    }

}