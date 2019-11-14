package com.example.kockadobas;



import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public static final Random RANDOM = new Random();
    private Button dobas;
    private ImageView imageView, imageView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dobas = (Button) findViewById(R.id.dobas);
        imageView = (ImageView) findViewById(R.id.imageView);
        imageView1 = (ImageView) findViewById(R.id.imageView1);


        dobas.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                int value1 = randomDiceValue();
                int value2 = randomDiceValue();

                int res1 = getResources().getIdentifier("dice_" + value1, "drawable", "com.ssaurel.dicer");
                int res2 = getResources().getIdentifier("dice_" + value2, "drawable", "com.ssaurel.dicer");

                imageView.setImageResource(res1);
                imageView1.setImageResource(res2);
            }
        });
    }


    public static int randomDiceValue() {
        return RANDOM.nextInt(6) + 1;
    }
}

























