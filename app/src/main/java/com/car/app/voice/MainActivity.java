package com.car.app.voice;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSetting(View v){
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_LAUNCHER);
        ComponentName cn = new ComponentName("com.car.app", "com.car.app.MainActivity");
        intent.setComponent(cn);
        intent.putExtra("position",0);
        startActivity(intent);
    }

    public void OnVoice(View v){
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_LAUNCHER);
        ComponentName cn = new ComponentName("com.car.app", "com.car.app.MainActivity");
        intent.setComponent(cn);
        intent.putExtra("position",1);
        startActivity(intent);
    }

    public void onHome(View v){
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_LAUNCHER);
        ComponentName cn = new ComponentName("com.car.app", "com.car.app.MainActivity");
        intent.setComponent(cn);
        intent.putExtra("position",2);
        startActivity(intent);
    }

    public void OnApps(View v){
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_LAUNCHER);
        ComponentName cn = new ComponentName("com.car.app", "com.car.app.MainActivity");
        intent.setComponent(cn);
        intent.putExtra("position",3);
        startActivity(intent);
    }

    public void onPhoneBook(View v){
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_LAUNCHER);
        ComponentName cn = new ComponentName("com.car.app", "com.car.app.MainActivity");
        intent.setComponent(cn);
        intent.putExtra("position",3);
        intent.putExtra("appId",0);
        startActivity(intent);
    }

    public void onCalendar(View v){
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_LAUNCHER);
        ComponentName cn = new ComponentName("com.car.app", "com.car.app.MainActivity");
        intent.setComponent(cn);
        intent.putExtra("position",3);
        intent.putExtra("appId",1);
        startActivity(intent);
    }

    public void onWeather(View v){
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_LAUNCHER);
        ComponentName cn = new ComponentName("com.car.app", "com.car.app.MainActivity");
        intent.setComponent(cn);
        intent.putExtra("position",3);
        intent.putExtra("appId",9);
        startActivity(intent);
    }


}
