package com.example.api;
import android.util.Log;

import java.io.IOException;

import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;
/**
 * Created by mrstranger on 16/6/15.
 */
public class ApiImpl implements Api {
        String string="";
        Retrofit retrofit=new Retrofit.Builder().baseUrl("http://192.168.199.108:8888/index.php/").addConverterFactory(GsonConverterFactory.create()).build();
        @Override
        //调用网络插件完成和服务器端的消息通信
        public void loginByApp(String loginName, String password) {
            ServerConfAPI serverConfAPI=retrofit.create(ServerConfAPI.class);
            Call<ApiResponse<User>> call=serverConfAPI.login(loginName,password);

            call.enqueue(new Callback<ApiResponse<User>>(){


                @Override
                public void onResponse(Response<ApiResponse<User>> response, Retrofit retrofit) {
                    Log.i("TAG:","登录成功"+response.body().getUser().getUserName());
                }

                @Override
                public void onFailure(Throwable throwable) {
                    Log.e("TAG:","登录失败"+throwable.getMessage());
                }
            });
        }
}
