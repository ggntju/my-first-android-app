package ggntju.my_first_android_app;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.parse.Parse;

public class parseApplication extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("APP_ID")
                .clientKey(null)
                .server("http://localhost:1337/parse/")
                .build());
    }
}
