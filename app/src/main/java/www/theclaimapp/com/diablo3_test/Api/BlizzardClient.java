package www.theclaimapp.com.diablo3_test.Api;

import retrofit.RestAdapter;

/**
 * Created by aschickert on 2/12/2014.
 */
public class BlizzardClient {
    private static BlizzardAPI sBlizzardService;

    public static BlizzardAPI getBlizzardApiClient() {
        if (sBlizzardService == null) {
            RestAdapter restAdapter = new RestAdapter.Builder()
                    .setEndpoint("https://us.api.battle.net/")
                    .setLogLevel(RestAdapter.LogLevel.FULL)
                    .build();

            sBlizzardService = restAdapter.create(BlizzardAPI.class);
        }
        return sBlizzardService;
    }


}
