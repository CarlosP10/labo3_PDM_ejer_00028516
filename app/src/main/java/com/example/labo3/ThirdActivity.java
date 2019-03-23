package com.example.labo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.labo3.utils.AppConstant;

public class ThirdActivity extends AppCompatActivity {

    private TextView mTextname, mTextLastname, mTextemail, mTextgender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        mTextname=findViewById(R.id.tv_message_name);
        mTextLastname=findViewById(R.id.tv_message_lastname);
        mTextemail=findViewById(R.id.tv_message_email);
        mTextgender=findViewById(R.id.tv_message_gender);

        Intent mIntent = getIntent();
        if(mIntent != null){
            mTextname.setText(mIntent.getStringExtra(AppConstant.TEXT_NAME));
            mTextLastname.setText(mIntent.getStringExtra(AppConstant.TEXT_LASTNAME));
            mTextemail.setText(mIntent.getStringExtra(AppConstant.TEXT_EMAIL));
            mTextgender.setText(mIntent.getStringExtra(AppConstant.TEXT_GENDER));
        }

    }
}

