package com.example.activitylifcycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("lifecycle","onCreate invoked");
    }
    protected void onStart()
    {
        super.onStart();
        Log.d("lifecycle","onStart invoked");
    }
    protected void onResume()
    {
        super.onResume();
        Log.d("Lifecycle","onResume invoked");
    }
    protected void onPause()
    {
        super.onPause();
        Log.d("lifecyle","onPause invoked");
    }
    protected void onStop()
    {
        super.onStop();
        Log.d("lifecycle","onStop invoked");
    }
     protected void onRestart()
    {
        super.onRestart();
        Log.d("lifecycle","onRestart invoked");
    }
     protected void onDestroy()
    {
        super.onDestroy();
        Log.d("lifecycle","onDestroy invoked");
    }
}