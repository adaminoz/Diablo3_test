package www.theclaimapp.com.diablo3_test.Api;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;
import www.theclaimapp.com.diablo3_test.Models.Profile;

public interface BlizzardAPI {

    @GET("/d3/profile/{battleTag}/?locale=en_US&apikey=2hfv7x7j4wyxaay9cf82myabz69ur92b")// + MainActivity.APIKEY)
    void getUserProfile(@Path("battleTag") String battleTag, Callback<Profile> cb);

}





