package com.example.api;

import retrofit.Call;
import retrofit.Response;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

/**
 * Created by mrstranger on 16/6/15.
 */
public interface ServerConfAPI {
    @POST("Home/Index/login")
    @FormUrlEncoded
    Call<ApiResponse<User>> login(@Field("username") String username, @Field("password") String password);
}
