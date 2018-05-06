package retrofit.com.contactretrofits;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by narak.hok on 05-May-2018.
 */

public interface ApiInterface {
    @GET("contact")
    Call<List<Contact>> getContacts();
}
