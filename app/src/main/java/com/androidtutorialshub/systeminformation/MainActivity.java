package com.androidtutorialshub.systeminformation;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // text view to display information
    private TextView textViewSetInformation;

    // button to get information
    private Button buttonGetInformation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //initializing the views
        initViews();

        // initializing the listeners
        initListeners();
    }

    /**
     * method to initialize the views
     */
    private void initViews() {

        textViewSetInformation = (TextView) findViewById(R.id.textViewSetInformation);
        buttonGetInformation = (Button) findViewById(R.id.buttonGetInformation);

    }

    /**
     * method to initialize the listeners
     */
    private void initListeners() {

        buttonGetInformation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get hardware and software information
                String information = getHardwareAndSoftwareInfo();

                // set information to text view
                textViewSetInformation.setText(information);

            }
        });

    }

    private String getHardwareAndSoftwareInfo() {

        return getString(R.string.serial) + " " +Build.SERIAL + "\n" +
                getString(R.string.model) + " " + Build.MODEL + "\n" +
                getString(R.string.id) + " " + Build.ID + "\n" +
                getString(R.string.manufacturer) + " " + Build.MANUFACTURER + "\n" +
                getString(R.string.brand) + " " + Build.BRAND + "\n" +
                getString(R.string.type) + " " + Build.TYPE + "\n" +
                getString(R.string.user) + " " + Build.USER + "\n" +
                getString(R.string.base) + " " + Build.VERSION_CODES.BASE + "\n" +
                getString(R.string.incremental) + " " + Build.VERSION.INCREMENTAL + "\n" +
                getString(R.string.sdk) + " " + Build.VERSION.SDK + "\n" +
                getString(R.string.board) + " " + Build.BOARD + "\n" +
                getString(R.string.host) + " " + Build.HOST + "\n" +
                getString(R.string.fingerprint) + " " + Build.FINGERPRINT + "\n" +
                getString(R.string.versioncode) + " " + Build.VERSION.RELEASE;
    }
}
