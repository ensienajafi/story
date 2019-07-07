package com.nc.story.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.nc.story.R;
import com.nc.story.component.CustomTextView;

public class MainActivity extends AppCompatActivity
{

    private CustomTextView storyBtn;

    @Override
    protected void onCreate (Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();


        storyBtn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick (View v)
            {
                startActivity(new Intent(MainActivity.this, ListActivity.class));
            }
        });

    }


    private void init ()
    {
        storyBtn = findViewById(R.id.storyBtn);
    }
}
