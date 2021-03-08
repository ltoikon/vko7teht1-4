package com.example.vko7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.io.BufferedReader;

public class MainActivity extends AppCompatActivity {

    TextView text;
    TextView inputText;
    String inputTextString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView) findViewById(R.id.textView);
        inputText = (EditText) findViewById(R.id.editInputField);
        text.setText("Press the button!");

       inputText.addTextChangedListener(new TextWatcher() {
           @Override
           public void beforeTextChanged(CharSequence s, int start, int count, int after) {

           }

           @Override
           public void onTextChanged(CharSequence s, int start, int before, int count) {
               inputTextString = inputText.getText().toString();
               text.setText(inputTextString);

           }

           @Override
           public void afterTextChanged(Editable s) {

           }
       });

    }


    public void testFunction (View v){
        System.out.println("Hello World!");
        text.setText(inputText.getText());
    }

}