package org.vasanti.www.mycare;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import org.vasanti.www.mycare.activity.LoginActivity;

public class MainActivity extends AppCompatActivity {

    private EditText textinputEmail;
    private EditText textinputPhone;
    private EditText textinputPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        if(toolbar != null){
            setSupportActionBar(toolbar);
        }

        // Redirect to the login view
        Button signInButton = findViewById(R.id.idSignInButton);
        signInButton.setOnClickListener(new View.OnClickListener() {
              public void onClick(View view) {
                  Intent loginIntent = new Intent(view.getContext(),LoginActivity.class);
                  startActivity(loginIntent);
            }
        });

        Button registerButton = findViewById(R.id.registerButton);


        registerButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                // Add registration data to the database here
                // Get values from the fields
                textinputEmail = findViewById(R.id.inputEmail);
                String inputEmail = textinputEmail.getText().toString();
                if(!isEmailValid(inputEmail) && inputEmail == null) {
                    textinputEmail.setError("Invalid Email Address !!");
                }
                textinputPhone = findViewById(R.id.inputPhone);
                String inputPhone = textinputPhone.getText().toString();
                if(!isValidPhoneNumber(inputPhone) && inputPhone == null){
                    textinputPhone.setError("Invalid Phone Number");
                }
                textinputPassword = findViewById(R.id.inputPassword);
                String inputPassword = textinputPassword.getText().toString();

                // Make a call to save the data in the database


                // After saving to database redirect to Accounts Page



            }
        });




    }

    //Check if given phone number is valid
    public boolean isValidPhoneNumber(String phoneNumber) {
        if (!TextUtils.isEmpty(phoneNumber)) {
            return Patterns.PHONE.matcher(phoneNumber).matches();
        }
        return false;
    }

    // Check if the given email address is valid
    public static boolean isEmailValid(String email) {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }


    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        layoutTheView();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        layoutTheView();
    }

    private void layoutTheView() {
        ActionBar actionBar = this.getSupportActionBar();
        Button view = findViewById(R.id.idSignInButton);
        ViewGroup.MarginLayoutParams params = (ViewGroup.MarginLayoutParams)view.getLayoutParams();
        int actionBarHeight = actionBar.getHeight();
        params.setMargins(0, actionBarHeight, 0, 0);
        view.setLayoutParams(params);
        view.requestLayout();
    }
}
