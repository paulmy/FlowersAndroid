package ru.myitschool.retrofit;

import android.app.Application;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import ru.myitschool.retrofit.api.FlowerApi;

public class App extends Application {

    private static FlowerApi flowerApi;
    private Retrofit retrofit;

    @Override
    public void onCreate() {
        super.onCreate();
        retrofit = new Retrofit.Builder()
                .baseUrl("http://lyceum.nstu.ru/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        flowerApi = retrofit.create(FlowerApi.class);
    }
    public static FlowerApi getApi() {
        return flowerApi;
    }
}
