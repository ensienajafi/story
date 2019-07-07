package com.nc.story.utils;

import com.nc.story.R;
import com.nc.story.model.Story;

import java.util.ArrayList;
import java.util.List;

public class Config
{

    final public static int BOY_THEME  = 0x000000;
    final public static int GIRL_THEME = 0xffffff;


    public static List<Story> getStories ()
    {
        List<Story> stories = new ArrayList<>();

        Story storyOne = new Story();
        storyOne.englishName = "small_cloud";
        storyOne.persianName = "ابر کوچولو";
        storyOne.imageRes = R.drawable.lion_king;
        stories.add(storyOne);

        Story storyTwo = new Story();
        storyTwo.englishName = "tree_golnar";
        storyTwo.persianName = "درخت و گلنار";
        storyTwo.imageRes = R.drawable.lion_king;
        stories.add(storyTwo);

        Story storyThree = new Story();
        storyThree.englishName = "bee";
        storyThree.persianName = "زنبور";
        storyThree.imageRes = R.drawable.lion_king;
        stories.add(storyThree);

        Story storyFour = new Story();
        storyFour.englishName = "lonely_queen";
        storyFour.persianName = "ملکه تنها";
        storyFour.imageRes = R.drawable.lion_king;
        stories.add(storyFour);

        Story storyFive = new Story();
        storyFive.englishName = "wish";
        storyFive.persianName = "من آرزو دارم";
        storyFive.imageRes = R.drawable.lion_king;
        stories.add(storyFive);

        return stories;

    }

}
