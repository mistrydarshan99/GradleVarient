package darshan.gradledemo1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView viewById = (TextView) findViewById(R.id.tvTest);
//        viewById.setText(BuildConfig.HOST);

        viewById.setText(AppUrls.BASEURL);

    }
}
