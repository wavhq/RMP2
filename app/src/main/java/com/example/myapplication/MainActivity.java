package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private final String TAG = this.getClass().getSimpleName();
    Context context = MainActivity.this;
    int duration = Toast.LENGTH_SHORT;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate");
        Toast.makeText(context, "onCreate", duration).show();

    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
        Toast.makeText(context, "onStart", duration).show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.w(TAG, "onStop");
        Toast.makeText(context, "onStop", duration).show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy");
        Toast.makeText(context, "onDestroy", duration).show();
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.w(TAG, "onPause");
        Toast.makeText(context, "onPause", duration).show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.v(TAG, "onResume");
        Toast.makeText(context, "onResume", duration).show();
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart");
        Toast.makeText(context, "onRestart", duration).show();
    }

}