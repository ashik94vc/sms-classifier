package com.zlabs.ml.sms.api;

import com.zlabs.ml.sms.models.QueryModel;
import com.zlabs.ml.sms.models.QueryResultModel;

import retrofit2.Retrofit;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by ashik-pt923 on 13/2/16.
 */
public class MLAPI {
    protected static String base_url = "http://bala-pt787.csez.zohocorpin.com/hack_aa/api/1.1";
    protected static RFCAPI rfcAPIService = null;
    public static RFCAPI getAPIService() {
        if(rfcAPIService == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(base_url)
                    .build();
            rfcAPIService = retrofit.create(RFCAPI.class);
        }
        return rfcAPIService;
    }
    public interface RFCAPI {
        @Headers("Content-Type:application/json")

        @POST("/query/rfc")
        QueryResultModel rfcQuery(@Body QueryModel queryModel);
    }
}