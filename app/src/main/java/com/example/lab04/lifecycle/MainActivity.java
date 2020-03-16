package com.example.lab04.lifecycle;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.OnLifecycleEvent;

public class MainActivity extends AppCompatActivity {


    int Rpause=0;
    int Rcreate=0;
    int Rstart=0;
    int Rstop=0;
    int Rdestroy=0;
    int Rrestart=0;
    int Rresume=0;


    public TextView _11;
    public TextView _12;
    public TextView _21;
    public TextView _22;
    public TextView _31;
    public TextView _32;
    public TextView _41;
    public TextView _42;
    public TextView _51;
    public TextView _52;
    public TextView _61;
    public TextView _62;
    public TextView _71;
    public TextView _72;



    SharedPreferences sharedpreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


          _11 = (TextView) findViewById(R.id._11);
          _12 = (TextView) findViewById(R.id._12);
        _21 = (TextView) findViewById(R.id._21);
        _22 = (TextView) findViewById(R.id._22);
        _31 = (TextView) findViewById(R.id._31);
        _32 = (TextView) findViewById(R.id._32);
        _41 = (TextView) findViewById(R.id._41);
        _42 = (TextView) findViewById(R.id._42);
        _51 = (TextView) findViewById(R.id._51);
        _52 = (TextView) findViewById(R.id._52);
        _61 = (TextView) findViewById(R.id._61);
        _62 = (TextView) findViewById(R.id._62);
        _71 = (TextView) findViewById(R.id._71);
        _72 = (TextView) findViewById(R.id._72);

        sharedpreferences = getSharedPreferences("mypre", Context.MODE_PRIVATE);

        Rcreate+=1;
        _11.setText(""+Rcreate);
        SharedPreferences.Editor editor = sharedpreferences.edit();
        int numstart=sharedpreferences.getInt("create",0);
        int numstartD=sharedpreferences.getInt("Rdestroy",0);
        _72.setText(""+numstartD);
        editor.putInt("Rdestroy", numstartD+1);
        int tempnum = numstart+1;
        _12.setText(""+tempnum);
        Log.i("create", String.valueOf(Rcreate));
        editor.putInt("create", numstart+1);
        editor.apply();


    }

    @Override
    protected void onStart() {
        super.onStart();
        Rstart+=1;
        _21.setText(""+Rstart);
        SharedPreferences.Editor editor = sharedpreferences.edit();
        int numstart=sharedpreferences.getInt("start",0);
        int tempnum = numstart+1;
        _22.setText(""+tempnum);
        editor.putInt("start", numstart+1);
        editor.apply();

    }


    @Override
    protected void onResume() {

        super.onResume();
        Rresume+=1;
        _31.setText(""+Rresume);
        SharedPreferences.Editor editor = sharedpreferences.edit();
        int numstart=sharedpreferences.getInt("Rresume",0);
        int tempnum = numstart+1;
        _32.setText(""+tempnum);
        editor.putInt("Rresume", numstart+1);
        editor.apply();

    }

    @Override
    protected void onPause() {

        super.onPause();
        Rpause+=1;
        _41.setText(""+Rpause);
        SharedPreferences.Editor editor = sharedpreferences.edit();
        int numstart=sharedpreferences.getInt("Rpause",0);
        int tempnum = numstart+1;
        _42.setText(""+tempnum);
        editor.putInt("Rpause", numstart+1);
        //Log.i("numstart", String.valueOf(""+numstart+1));
        editor.apply();


    }

    @Override
    protected void onStop() {

        super.onStop();
        Rstop+=1;
        _51.setText(""+Rstop);
        SharedPreferences.Editor editor = sharedpreferences.edit();
        int numstart=sharedpreferences.getInt("stop",0);
        int tempnum = numstart+1;
        _52.setText(""+tempnum);
        editor.putInt("stop", numstart+1);
        editor.apply();


    }

    @Override
    protected void onRestart() {

        super.onRestart();
        Rrestart+=1;
        _61.setText(""+Rrestart);
        SharedPreferences.Editor editor = sharedpreferences.edit();
        int numstart=sharedpreferences.getInt("restart",0);
        int tempnum = numstart+1;
        _62.setText(""+tempnum);
        editor.putInt("restart", numstart+1);
        editor.apply();


    }


    @Override
    protected void onDestroy() {

        super.onDestroy();
        Rdestroy+=1;
        _71.setText(""+Rdestroy);
        SharedPreferences.Editor editor = sharedpreferences.edit();
        int numstart=sharedpreferences.getInt("Rdestroy",0);
        int tempnum = numstart+1;
        _72.setText(""+tempnum);
        editor.putInt("Rdestroy", numstart+1);
        Log.i("Rdestroy", String.valueOf(""+numstart+1));
        editor.apply();


    }

    protected void onDestroyHelp() {


    }





}
