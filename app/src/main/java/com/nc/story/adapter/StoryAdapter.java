package com.nc.story.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.nc.story.R;
import com.nc.story.activity.StoryActivity;
import com.nc.story.component.CustomTextView;
import com.nc.story.model.Story;

import java.util.List;

public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.Holder>
{
    private List<Story> storyList;
    private Context     context;


    public StoryAdapter (Context context, List<Story> storyList)
    {
        this.context = context;
        this.storyList = storyList;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder (@NonNull ViewGroup viewGroup, int i)
    {
        return new Holder(LayoutInflater.from(context).inflate(R.layout.viewholer_story,viewGroup,false));
    }

    @Override
    public void onBindViewHolder (@NonNull Holder holder, int i)
    {
        final Story story = storyList.get(i);

        holder.title.setText(story.persianName);
        holder.image.setImageResource(story.imageRes);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v)
            {
                Intent i = new Intent(context, StoryActivity.class);

                i.putExtra("story", story);

                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount ()
    {
        return storyList.size();
    }

    class Holder extends RecyclerView.ViewHolder
    {
        public ImageView      image;
        public CustomTextView title;

        public Holder (@NonNull View itemView)
        {
            super(itemView);


            image = itemView.findViewById(R.id.image);

            title = itemView.findViewById(R.id.title);

        }
    }
}
