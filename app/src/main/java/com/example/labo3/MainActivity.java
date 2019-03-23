package com.example.labo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.labo3.utils.AppConstant;

public class MainActivity extends AppCompatActivity {

    private EditText mEditname,mEditlastname, mEditemail;
    private Button mButton;
    private RadioButton mRadioButton;
    private RadioGroup mRadioGroupGender;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditname=findViewById(R.id.et_name);
        mEditlastname=findViewById(R.id.et_lastname);
        mEditemail=findViewById(R.id.et_email);
        mButton=findViewById(R.id.btn_send);
        mRadioGroupGender=findViewById(R.id.rg_group);

        mButton.setOnClickListener(v ->{
            String textname=mEditname.getText().toString();
            String textlastname=mEditlastname.getText().toString();
            String textemail=mEditemail.getText().toString();

            int idRadio = mRadioGroupGender.getCheckedRadioButtonId();
            mRadioButton = findViewById(idRadio);
            String textgender=mRadioButton.getText().toString();

            Intent mIntent= new Intent(MainActivity.this, SecondActivity.class);
            mIntent.putExtra(AppConstant.TEXT_NAME,textname);
            mIntent.putExtra(AppConstant.TEXT_LASTNAME,textlastname);
            mIntent.putExtra(AppConstant.TEXT_EMAIL,textemail);
            mIntent.putExtra(AppConstant.TEXT_GENDER,textgender);

            startActivity(mIntent);
        });

    }

}
