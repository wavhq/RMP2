package com.example.myapplication;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.databinding.ConstraintLayoutBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ConstraintLayoutBinding binding = ConstraintLayoutBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Button", "Button was clicked");
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("from_edit_text", "I'm from 1st Activity");
                //startActivity(intent);
                launcher.launch(intent);
            }

            ActivityResultLauncher<Intent> launcher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    Bundle text = result.getData().getExtras();
                    binding.textView2.setText(text.getString("text"));
                }
            });
        });
        binding.button2.setText(R.string.for_edit_text);
        binding.imageView4.setImageResource(R.drawable.soundcloud);

    }

    @Override
    protected void onStart() {
        super.onStart();
        /*TextView textView = (TextView)findViewById(R.id.textView2);
        textView.setText(R.string.for_edit_text);
        ImageView imageView = (ImageView)findViewById(R.id.imageView4);
        imageView.setImageResource(R.drawable.soundcloud);*/

    }



    /*public void Clicked(View view) {

        Log.i("Button", "Button was clicked");
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("from_edit_text", "I'm from 1st Activity");
        startActivity(intent);

        ActivityResultLauncher<Intent> launcher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
            @Override
            public void onActivityResult(ActivityResult result) {
                Bundle text = result.getData().getExtras();
                TextView textView = findViewById(R.id.textView);
                textView.setText(text.getInt("text"));
            }
        });
    }*/
}