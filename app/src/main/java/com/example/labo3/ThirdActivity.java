package com.example.labo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import org.json.JSONObject;
import org.json.JSONException;

public class ThirdActivity extends AppCompatActivity {

    private TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        mText=findViewById(R.id.tv_message_name);


        Intent mIntent = getIntent();
        JSONObject json = null;
        try {
            json = new JSONObject(mIntent.getStringExtra("JSON"));
            if (mIntent != null){
                mText.setText(mText.getText() +" "+ json.getString("name") +"\n"+mText.getText()+" "+json.getString("lastname")+"\n"+ mText.getText()+" "+json.getString("email")+"\n"+mText.getText()+" "+json.getString("gender"));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}

