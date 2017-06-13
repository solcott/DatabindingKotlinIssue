package com.example.mylibrary;

import android.databinding.BindingAdapter;
import android.view.ViewGroup;
import android.widget.TextView;

public class BindingAdapters {

    @BindingAdapter(value = {"android:layout_marginLeft"})
    public static void setMarginLeftAndRight(TextView view, float marginLeft){
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if(layoutParams != null && layoutParams instanceof ViewGroup.MarginLayoutParams){
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins((int)marginLeft, marginLayoutParams.topMargin, marginLayoutParams.rightMargin/*(int)marginRight*/, marginLayoutParams.bottomMargin);
            view.setLayoutParams(layoutParams);
        }
    }
}
