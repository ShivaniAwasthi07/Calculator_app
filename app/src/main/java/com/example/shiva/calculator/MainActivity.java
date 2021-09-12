package com.example.shiva.calculator;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    Button b1, b2, b3, b4;
    EditText e1, e2;
    TextView t1;
    TextToSpeech ts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.button);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        e1 = (EditText) findViewById(R.id.editText);
        e2 = (EditText) findViewById(R.id.editText2);
        t1 = (TextView) findViewById(R.id.textView);
        ts = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                ts.setLanguage(Locale.ENGLISH);
                ts.setSpeechRate(1.0f);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                Float f1 = Float.parseFloat(s1);
                Float f2 = Float.parseFloat(s2);
                Float f3 = f1+f2;
                String s3=Float.toString(f3);
                ts.speak(s3,TextToSpeech.QUEUE_FLUSH,null );
                t1.setText(s3);
                Toast.makeText(MainActivity.this, "THE result is " + s3, Toast.LENGTH_SHORT).show();
            }

        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                Float f1 = Float.parseFloat(s1);
                Float f2 = Float.parseFloat(s2);
                Float f3 = f1-f2;
                String s3=Float.toString(f3);
                ts.speak(s3,TextToSpeech.QUEUE_FLUSH,null );
                t1.setText(s3);
                Toast.makeText(MainActivity.this, "THE result is " + s3, Toast.LENGTH_SHORT).show();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                Float f1 = Float.parseFloat(s1);
                Float f2 = Float.parseFloat(s2);
                Float f3 = f1*f2;
                String s3=Float.toString(f3);
                ts.speak(s3,TextToSpeech.QUEUE_FLUSH,null );
                t1.setText(s3);
                Toast.makeText(MainActivity.this, "THE result is " + s3, Toast.LENGTH_SHORT).show();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                Float f1 = Float.parseFloat(s1);
                Float f2 = Float.parseFloat(s2);
                Float f3 = f1/f2;
                String s3=Float.toString(f3);
                ts.speak(s3,TextToSpeech.QUEUE_FLUSH,null );
                t1.setText(s3);
                Toast.makeText(MainActivity.this, "THE result is " + s3, Toast.LENGTH_SHORT).show();
            }
        });
    }
}


