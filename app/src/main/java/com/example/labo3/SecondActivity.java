package com.example.labo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.labo3.utils.AppConstant;

public class SecondActivity extends AppCompatActivity {

    private TextView mTextname, mTextLastname, mTextemail, mTextgender;
    private Button mButtonShare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mTextname=findViewById(R.id.tv_message_name);
        mTextLastname=findViewById(R.id.tv_message_lastname);
        mTextemail=findViewById(R.id.tv_message_email);
        mTextgender=findViewById(R.id.tv_message_gender);
        mButtonShare=findViewById(R.id.btn_share);

        Intent mIntent = getIntent();
        if(mIntent != null){
            mTextname.setText(mIntent.getStringExtra(AppConstant.TEXT_NAME));
            mTextLastname.setText(mIntent.getStringExtra(AppConstant.TEXT_LASTNAME));
            mTextemail.setText(mIntent.getStringExtra(AppConstant.TEXT_EMAIL));
            mTextgender.setText(mIntent.getStringExtra(AppConstant.TEXT_GENDER));
        }

        mButtonShare.setOnClickListener(v ->{
            String name =mTextname.getText().toString();
            String lastname =mTextLastname.getText().toString();
            String email =mTextemail.getText().toString();
            String gender =mTextgender.getText().toString();
            Intent mIntents = new Intent();
            mIntents.setType("text/plain");
            mIntents.setAction(Intent.ACTION_SEND);
            mIntents.putExtra(AppConstant.TEXT_NAME, name);
            mIntents.putExtra(AppConstant.TEXT_LASTNAME, lastname);
            mIntents.putExtra(AppConstant.TEXT_EMAIL, email);
            mIntents.putExtra(AppConstant.TEXT_GENDER, gender);
            startActivity(mIntents);
        });
    }
}
