package sample.map.google.com.videochat;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Utils {
    static Utils instance;
    public static final String API_ENDPOINT = "https://service.xirsys.com";

    public static Utils getInstance() {
        if (instance == null) {
            instance = new Utils();
        }
        return instance;
    }

    private Retrofit retrofitInstance;

    TurnServer getRetrofitInstance() {
        if (retrofitInstance == null) {
            retrofitInstance = new Retrofit.Builder()
                    .baseUrl(API_ENDPOINT)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofitInstance.create(TurnServer.class);
    }
}
