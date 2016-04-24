package appewtc.masterung.mytraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //Explicit ประกาศตัวแปร
    private ListView trafficListView;
    private Button aboutButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind Widget
        trafficListView = (ListView) findViewById(R.id.listView);
        aboutButton = (Button) findViewById(R.id.button);

        //Button Controller
        buttonController();

        //ListView Controller
        listViewController();


    }   // Main Method

    private void listViewController() {

        //Type1
        int[] iconInts = {R.drawable.traffic_01, R.drawable.traffic_02,
                R.drawable.traffic_03, R.drawable.traffic_04, R.drawable.traffic_05,
                R.drawable.traffic_06, R.drawable.traffic_06, R.drawable.traffic_08,
                R.drawable.traffic_09, R.drawable.traffic_10, R.drawable.traffic_11,
                R.drawable.traffic_12, R.drawable.traffic_13, R.drawable.traffic_14,
                R.drawable.traffic_15, R.drawable.traffic_16, R.drawable.traffic_17,
                R.drawable.traffic_18, R.drawable.traffic_19, R.drawable.traffic_20};




    }   // listViewController

    private void buttonController() {

        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Sound Effect
                MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.cow);
                mediaPlayer.start();

                //Intent to WebView
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://youtu.be/AFmWqLIqDZA"));
                startActivity(intent);

                //Intent to Call
//                Intent intent = new Intent(Intent.ACTION_CALL);
//                intent.setData(Uri.parse("tel:0818595309"));
//                startActivity(intent);


            }   // onClick
        });

    }   // buttonController Method


}   // Main Class นี่คือคลาสหลัก
