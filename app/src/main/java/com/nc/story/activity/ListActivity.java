package com.nc.story.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.nc.story.R;
import com.nc.story.adapter.StoryAdapter;
import com.nc.story.model.Story;
import com.nc.story.utils.Config;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity
{

    private RecyclerView recyclerView;
    private StoryAdapter adapter;
    private List<Story>  storyList;

    @Override
    protected void onCreate (Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        init();

        storyList = Config.getStories();

        GridLayoutManager layoutManager = new GridLayoutManager(this,2, LinearLayoutManager.VERTICAL, false);
        adapter = new StoryAdapter(this,storyList);


        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }

    private void init ()
    {
        storyList = new ArrayList<>();

        recyclerView = findViewById(R.id.recyclerView);
    }
}
