package www.theclaimapp.com.diablo3_test;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;
import www.theclaimapp.com.diablo3_test.Api.BlizzardClient;
import www.theclaimapp.com.diablo3_test.Models.Profile;


public class MainActivity extends ActionBarActivity {

    private TextView tvBattleTag;
    public static final String APIKEY = "/d3/profile/{battleTag}/?locale=en_US&apikey=2hfv7x7j4wyxaay9cf82myabz69ur92b";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvBattleTag = (TextView) findViewById(R.id.tvBattleTag);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    private boolean isOnline() {
        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = cm.getActiveNetworkInfo();
        if (netInfo != null && netInfo.isConnectedOrConnecting()) {
            return true;
        } else {
            return false;
        }

    }

    public void onClickLogin(View view) {
        BlizzardClient.getBlizzardApiClient().getUserProfile(tvBattleTag.getText().toString(), new Callback<Profile>() {

            @Override
            public void success(Profile profile, Response response) {
                Toast.makeText(getApplicationContext(), profile.getBattleTag() + " Loaded! Status Code:" + response.getStatus(), Toast.LENGTH_LONG).show();

            }

            @Override
            public void failure(RetrofitError error) {

            }
        });

    }
}
