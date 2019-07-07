package com.nc.story.utils;

import android.content.Context;
import android.graphics.Typeface;

/**
 * Created by Mahdi on 8/8/2018.
 */

public class Font
{
    private static String IRANSans            = "IRANSans.ttf";
    private static String IRANSansUltraLight  = "IRANSans_UltraLight.ttf";
    private static String IRANSansLight       = "IRANSansLight.ttf";
    private static String IRANSansMedium      = "IRANSans_Medium.ttf";
    private static String IRANSansBold        = "IRANSans_Bold.ttf";

    private static String IRANYekan_300       = "IRANYekan_300.ttf";
    private static String IRANYekan_400       = "IRANYekan_400.ttf";
    private static String IRANYekan_700       = "IRANYekan_700.ttf";

    private static String mainFont = IRANSansLight;

    private static String path = "fonts/";


    public static Typeface getMainFont (Context context)
    {

        return Typeface.createFromAsset(context.getAssets(), path + mainFont);
    }

    public static Typeface getIRANSans (Context context)
    {
        return Typeface.createFromAsset(context.getAssets(), path + IRANSans);
    }

    public static Typeface getIRANSansLight (Context context)
    {
        return Typeface.createFromAsset(context.getAssets(), path + IRANSansLight);
    }

    public static Typeface getIRANSansUltraLight (Context context)
    {
        return Typeface.createFromAsset(context.getAssets(), path + IRANSansUltraLight);
    }

    public static Typeface getIRANSansMedium (Context context)
    {
        return Typeface.createFromAsset(context.getAssets(), path + IRANSansMedium);
    }

    public static Typeface getIRANSansBold (Context context)
    {
        return Typeface.createFromAsset(context.getAssets(), path + IRANSansBold);
    }

    public static Typeface IRANYekan_300 (Context context)
    {
        return Typeface.createFromAsset(context.getAssets(), path + IRANYekan_300);
    }

    public static Typeface IRANYekan_400 (Context context)
    {
        return Typeface.createFromAsset(context.getAssets(), path + IRANYekan_400);
    }

    public static Typeface IRANYekan_700 (Context context)
    {
        return Typeface.createFromAsset(context.getAssets(), path + IRANYekan_700);
    }


}
