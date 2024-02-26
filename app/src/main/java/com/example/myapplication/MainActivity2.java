package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_layout);
        Bundle arguments = getIntent().getExtras();
        String forTextView = arguments.get("from_edit_text").toString();
        TextView textView = findViewById(R.id.textView);
        textView.setText(forTextView);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("text", "I'm from the 2nd one");
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}