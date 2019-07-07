package com.nc.story.component;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.util.AttributeSet;

import com.nc.story.R;
import com.nc.story.utils.Font;


/**
 * Created by Mahdi on 8/27/2018.
 */

public class CustomTextView extends android.support.v7.widget.AppCompatTextView
{
    
    float radius;
    
    public CustomTextView (Context context)
    {
        super(context);
    }
    
    public CustomTextView (Context context, @Nullable AttributeSet attrs)
    {
        super(context, attrs);
        setFont(context, attrs);
    }
    
    public CustomTextView (Context context, @Nullable AttributeSet attrs, int defStyleAttr)
    {
        super(context, attrs, defStyleAttr);
        setFont(context, attrs);
        
    }
    
    private void setRadius (float radius)
    {
        this.radius = radius;
    }
    
    private void setFont (Context context, AttributeSet attrs)
    {
        
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.CustomTextView);
        
        int value = typedArray.getInteger(R.styleable.CustomTextView_fontName, 2);

        
        switch (value)
        {
            
            case 1:
                
                this.setTypeface(Font.getIRANSansLight(context));
                
                break;
            
            case 2:
                
                this.setTypeface(Font.getIRANSansUltraLight(context));
                
                break;
            
            case 3:
                
                this.setTypeface(Font.getIRANSansMedium(context));
                
                break;
            
            case 4:
                
                this.setTypeface(Font.getIRANSans(context));
                
                break;
            
            case 5:

                this.setTypeface(Font.getIRANSansBold(context));

                break;

            case 6:

                this.setTypeface(Font.IRANYekan_300(context));

                break;

            case 7:

                this.setTypeface(Font.IRANYekan_400(context));

                break;

            case 8:

                this.setTypeface(Font.IRANYekan_700(context));

                break;


        }
        
        typedArray.recycle();
        
        
    }

}
