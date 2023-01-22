package com.example.kidex;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void isTermsChecked(View view) {
        CheckBox terms = findViewById(R.id.termsConditions);
        Button logIn = findViewById(R.id.logIn);

        if (terms.isChecked() == true) {
            logIn.setEnabled(true);
        } else {
            logIn.setEnabled(false);
        }
    }

    public void goToSignUp(View view) {
        Intent intent = new Intent(MainActivity.this, SignUp.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView ballon1 = findViewById(R.id.balloon);
        ImageView ballon2 = findViewById(R.id.balloon2);
        ImageView ballon3 = findViewById(R.id.balloon3);
        ImageView ballon4 = findViewById(R.id.balloon4);
        ImageView blob = findViewById(R.id.imageView6);

        blob.setScaleY(3f);
        blob.setScaleX(3f);
        blob.animate().translationX(0);
        blob.animate().translationY(0);
        blob.animate().scaleX(0).setDuration(800);
        blob.animate().scaleY(0).setDuration(800);

        ObjectAnimator ballonFly = ObjectAnimator.ofFloat(ballon1, "translationY", -3000);
        ballonFly.setDuration(2000);
        ballonFly.start();

        ObjectAnimator ballonFly1 = ObjectAnimator.ofFloat(ballon2, "translationY", -3000);
        ballonFly1.setDuration(2200);
        ballonFly1.start();

        ObjectAnimator ballonFly2 = ObjectAnimator.ofFloat(ballon3, "translationY", -3000);
        ballonFly2.setDuration(2500);
        ballonFly2.start();

        ObjectAnimator ballonFly3 = ObjectAnimator.ofFloat(ballon4, "translationY", -3000);
        ballonFly3.setDuration(2600);
        ballonFly3.start();
    }
}