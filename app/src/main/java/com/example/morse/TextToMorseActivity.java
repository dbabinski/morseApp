package com.example.morse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;


public class TextToMorseActivity extends AppCompatActivity {


    private Object TextWatcher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_to_morse);

        // animation of background
        ConstraintLayout layout = findViewById(R.id.text_to_morse_layout);
        AnimationDrawable animation = (AnimationDrawable) layout.getBackground();
        animation.setExitFadeDuration(2000);
        animation.setExitFadeDuration(4000);
        animation.start();

        //
        final EditText text = findViewById(R.id.editText);
        final TextView morseCode = findViewById(R.id.morse_code_text);
        //

        text.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                translateMorse translateMorse = new translateMorse();
                String textConvert = text.getText().toString().toUpperCase();
                String translatedText = translateMorse.translate(textConvert);
                morseCode.setText(translatedText);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}
