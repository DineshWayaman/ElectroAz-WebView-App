package com.app.electroaz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity {

    private ImageView imgLogo,imgName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        final Intent i = new Intent(this,MainActivity.class);
        Thread timer = new Thread()
        {
            public void run()
            {
                try {
                    sleep(4000);
                }catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                finally {

                    startActivity(i);
                    finish();

                }
            }
        };
        timer.start();

    }
}
