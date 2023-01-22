package com.example.kidex;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.firebase.auth.FirebaseAuth;

public class SignUp extends AppCompatActivity {

    ImageView Google = findViewById(R.id.google);

    public void isTermsChecked(View view) {
        CheckBox terms = findViewById(R.id.termsConditionsSignUp);
        Button signUpBtn = findViewById(R.id.signUpBtn);

        if (terms.isChecked() == true) {
            signUpBtn.setEnabled(true);
        } else {
            signUpBtn.setEnabled(false);
        }
    }

    public void goToLogin(View view) {
        Intent intent = new Intent(SignUp.this, MainActivity.class);
        startActivity(intent);
    }

    public void registerUserWithGoogle(View view) {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        ImageView blob = findViewById(R.id.imageView4);
        ImageView aeroplane = findViewById(R.id.aeroplane);
        ImageView aeroplane2 = findViewById(R.id.aeroplane2);
        ImageView aeroplane3 = findViewById(R.id.aeroplane4);

        ObjectAnimator aeroplaneAnimationY = ObjectAnimator.ofFloat(aeroplane, "translationY", -3000);
        ObjectAnimator aeroplaneAnimationX = ObjectAnimator.ofFloat(aeroplane, "translationX", 3000);
        aeroplaneAnimationY.setDuration(1500);
        aeroplaneAnimationY.start();
        aeroplaneAnimationX.setDuration(1500);
        aeroplaneAnimationX.start();

        ObjectAnimator aeroplaneAnimationY3 = ObjectAnimator.ofFloat(aeroplane3, "translationY", -3000);
        ObjectAnimator aeroplaneAnimationX3 = ObjectAnimator.ofFloat(aeroplane3, "translationX", 3000);
        aeroplaneAnimationY3.setDuration(1800);
        aeroplaneAnimationY3.start();
        aeroplaneAnimationX3.setDuration(1800);
        aeroplaneAnimationX3.start();

        ObjectAnimator aeroplaneAnimationY2 = ObjectAnimator.ofFloat(aeroplane2, "translationY", -3000);
        ObjectAnimator aeroplaneAnimationX2 = ObjectAnimator.ofFloat(aeroplane2, "translationX", 3000);
        aeroplaneAnimationY2.setDuration(1800);
        aeroplaneAnimationY2.start();
        aeroplaneAnimationX2.setDuration(1800);
        aeroplaneAnimationX2.start();

        blob.setScaleY(3f);
        blob.setScaleX(3f);
        blob.animate().scaleX(0).setDuration(1800);
        blob.animate().scaleY(0).setDuration(1800);
    }
}