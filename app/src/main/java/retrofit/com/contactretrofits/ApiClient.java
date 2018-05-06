package retrofit.com.contactretrofits;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by narak.hok on 05-May-2018.
 */

public class ApiClient {
    public static final String BASE_URL = "http://fd6fe512.ngrok.io/api/";
    public static Retrofit retrofit = null;

    public static Retrofit getApiClient(){
        if(retrofit ==null){
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }

}
