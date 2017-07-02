package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ask_me_butt = (Button) findViewById(R.id.ask_button);
        final ImageView response_img = (ImageView) findViewById(R.id.magic8Ball_img);

        final int[] imgArray = {R.drawable.ball1, R.drawable.ball2, R.drawable.ball3, R.drawable.ball4,
                                R.drawable.ball5};

        ask_me_butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Magic8", "Button clicked!");

                Random randImg = new Random();
                int imgChoice = randImg.nextInt(4);

                response_img.setImageResource(imgArray[imgChoice]);

            }
        });
    }
}
