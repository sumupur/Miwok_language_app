package com.sumupur.miwok_language_app;

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
    public void number(View View)
    {
        Intent intent=new Intent(this,NumbersActivity.class);
        startActivity(intent);
    }
    public void colors(View View)
    {
        Intent intent=new Intent(this,ColorsActivity.class);
        startActivity(intent);
    }
    public void family (View View)
    {
        Intent intent=new Intent(this,FamilyActivity.class);
        startActivity(intent);
    }
    public void Phrases(View View)
    {
        Intent intent=new Intent(this,PhrasesActivity.class);
        startActivity(intent);
    }
}
