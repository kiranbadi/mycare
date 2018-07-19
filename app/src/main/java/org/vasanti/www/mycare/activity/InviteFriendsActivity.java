package org.vasanti.www.mycare.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.vasanti.www.mycare.R;

public class InviteFriendsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toolbar toolbar = findViewById(R.id.toolbar);
        if(toolbar != null){
            setSupportActionBar(toolbar);
        }
        setContentView(R.layout.activity_invite_friends);
        final EditText nameField = findViewById(R.id.EditTextName);
        String name = nameField.getText().toString();

        final EditText emailField = findViewById(R.id.EditTextEmail);
        String email = emailField.getText().toString();

        final EditText phoneField = findViewById(R.id.EditTextPhone);
        String phone = emailField.getText().toString();

        final EditText feedbackField = findViewById(R.id.EditTextMessage);
        String feedback = feedbackField.getText().toString();

        // TODO : Make the service on button click and pass parameter to service

        // Redirect to the login view
        Button signInButton = findViewById(R.id.Button_Invite_Friend);
        signInButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
//                Intent loginIntent = new Intent(view.getContext(),LoginActivity.class);
//                startActivity(loginIntent);
            }
        });

    }
}
