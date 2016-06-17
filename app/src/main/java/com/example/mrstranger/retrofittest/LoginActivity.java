package com.example.mrstranger.retrofittest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.api.Api;
import com.example.api.ApiImpl;

public class LoginActivity extends AppCompatActivity {
    EditText nameString;
    EditText passwordString;
    Button loginButton;
    Api api;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        this.api=new ApiImpl();
        nameString=(EditText)findViewById(R.id.nameEditText);
        passwordString=(EditText)findViewById(R.id.passwordEditText);
        loginButton=(Button)findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Test:","登录");
                api.loginByApp(nameString.getText().toString(),passwordString.getText().toString());
            }
        });
    }
}
