package org.vasanti.www.mycare.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.vasanti.www.mycare.R;

import butterknife.BindView;

public class LoginActivity extends AppCompatActivity {
    private static final String TAG = "LoginActivity";


    @BindView(R.id.email) EditText _emailText;
    @BindView(R.id.password) EditText _passwordText;
  //  @BindView(R.id.email_sign_in_button) Button _loginButton;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Toolbar toolbar = findViewById(R.id.toolbar);
        if(toolbar != null){
            setSupportActionBar(toolbar);
        }
   //     ButterKnife.bind(this);
        Button EmailsignInButton = (Button) findViewById(R.id.email_sign_in_button);
        EmailsignInButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Log.d(TAG, "Clicked login button");

          //      Intent intent = new Intent(view.getContext(),DashBoard.class);
                Intent intent = new Intent(view.getContext(),HomeActivity.class);
                Log.i("onLoginSuccess","Redirect to view - Home Page Activity");
                startActivity(intent);
                finish();
              //  login();
            }
        });

    }

 /*   public void login() {
        Log.d(TAG, "Login");

        if (!validate()) {
            onLoginFailed();
            return;
        }

        _loginButton.setEnabled(false);

        final ProgressDialog progressDialog = new ProgressDialog(LoginActivity.this,
                R.style.AppTheme_Dark_Dialog);
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage("Authenticating...");
        progressDialog.show();

        String email = _emailText.getText().toString();
        String password = _passwordText.getText().toString();

        // TODO: Implement your own authentication logic here.

        new android.os.Handler().postDelayed(
                new Runnable() {
                    public void run() {
                        // On complete call either onLoginSuccess or onLoginFailed
                        onLoginSuccess();
                        // onLoginFailed();
                        progressDialog.dismiss();
                    }
                }, 3000);
    }*/




  /*  @Override
    public void onBackPressed() {
        // Disable going back to the MainActivity
        moveTaskToBack(true);
    }

    public void onLoginSuccess() {
        _loginButton.setEnabled(true);
        Intent intent = new Intent(getApplicationContext(),HomePageActivity.class);
        Log.i("onLoginSuccess","Redirect to view");
        startActivity(intent);
        finish();
    }

    public void onLoginFailed() {
        Toast.makeText(getBaseContext(), "Login failed", Toast.LENGTH_LONG).show();
        _loginButton.setEnabled(true);
    }

    public boolean validate() {
        boolean valid = true;

        String email = _emailText.getText().toString();
        String password = _passwordText.getText().toString();

        if (email.isEmpty() || !android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            _emailText.setError("enter a valid email address");
            valid = false;
        } else {
            _emailText.setError(null);
        }

        if (password.isEmpty() || password.length() < 4 || password.length() > 10) {
            _passwordText.setError("between 4 and 10 alphanumeric characters");
            valid = false;
        } else {
            _passwordText.setError(null);
        }

        Log.d("tag", "Value: " + valid);
        return valid;

    }*/
}