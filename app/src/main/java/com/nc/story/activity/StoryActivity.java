package com.nc.story.activity;

import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.nc.story.R;
import com.nc.story.component.CustomTextView;
import com.nc.story.model.Story;

import java.io.IOException;

public class StoryActivity extends AppCompatActivity
{

    private ImageView playImage, pauseImage;
    private CustomTextView      titleText;
    private Intent              i;
    private Story               story;
    private MediaPlayer         mediaPlayer;
    private AssetFileDescriptor descriptor;
    private RelativeLayout      bannerLayout;

    @Override
    protected void onCreate (Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);
        init();


        titleText.setText(story.persianName);
        bannerLayout.setBackgroundResource(story.imageRes);


        playImage.setOnClickListener(new View.OnClickListener()
        {
            public void onClick (View v)
            {
                play();
            }
        });


        pauseImage.setOnClickListener(new View.OnClickListener()
        {
            public void onClick (View v)
            {
                pause();
            }
        });

    }


    private void init ()
    {

        try
        {
            descriptor = getAssets().openFd("sounds/test.mp3");
            mediaPlayer = new MediaPlayer();

            mediaPlayer.setDataSource(descriptor.getFileDescriptor(), descriptor.getStartOffset(), descriptor.getLength());
            descriptor.close();

            mediaPlayer.prepare();

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        i = getIntent();

        story = (Story) i.getSerializableExtra("story");



        //find views
        playImage = findViewById(R.id.playImage);
        pauseImage = findViewById(R.id.pauseImage);
        bannerLayout = findViewById(R.id.bannerLayout);


        titleText = findViewById(R.id.titleText);
    }

    private void play ()
    {
        playImage.animate().scaleX(1.5f).scaleY(1.5f).setDuration(200).start();
        pauseImage.animate().scaleX(1f).scaleY(1f).setDuration(200).start();

        if (!mediaPlayer.isPlaying())
        {
            mediaPlayer.start();
        }


    }


    private void pause ()
    {
        pauseImage.animate().scaleX(1.5f).scaleY(1.5f).setDuration(200).start();
        playImage.animate().scaleX(1f).scaleY(1f).setDuration(200).start();

        if (mediaPlayer.isPlaying())
        {
            mediaPlayer.pause();
        }
    }
}
