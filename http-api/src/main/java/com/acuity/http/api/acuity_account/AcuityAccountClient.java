package com.acuity.http.api.acuity_account;

import com.acuity.http.api.AcuityHttpClient;
import com.acuity.http.api.util.JsonUtil;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.ResponseBody;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Optional;

/**
 * Created by Zachary Herridge on 6/1/2017.
 */
public class AcuityAccountClient {

    public static Optional<AcuityAccount> findCurrentAccount(){
        HttpUrl account = AcuityHttpClient.API_BASE.newBuilder()
                .addPathSegment("account")
                .build();
        return AcuityHttpClient.makeCall(account, AcuityAccount.class);
    }
}
