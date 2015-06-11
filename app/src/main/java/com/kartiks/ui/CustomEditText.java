package com.kartiks.ui;

import com.kartiks.sample.R;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.TextView;


public class CustomEditText extends EditText {
	
	Context context;
	public CustomEditText(Context context) {
		super(context);
		this.context=context;
	}
	
	public CustomEditText(Context context, AttributeSet attrs) {
		super(context, attrs);
		this.context=context;
		
		TypedArray a = context.getTheme().obtainStyledAttributes(
		        attrs,
		        R.styleable.CustomTextView,
		        0, 0);
		
		
		
		try {
		       String resourse=a.getString(R.styleable.CustomTextView_ttfResourseName);
		       
		       //LoggerGeneral.e("res "+resourse);
		       if(resourse!=null&&!isInEditMode()){
		    	   Typeface tf=Typeface.createFromAsset(context.getAssets(), resourse);
			       setTypeface(tf);	         
		       }
		       
	   } finally {
	       a.recycle();
	   }
	}
	
	public CustomEditText(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		this.context=context;
		
		TypedArray a = context.getTheme().obtainStyledAttributes(attrs,R.styleable.CustomTextView,0, 0);
		
		try {
		       String resourse=a.getString(R.styleable.CustomTextView_ttfResourseName);
		       //LoggerGeneral.e("res "+resourse);
		       if(resourse!=null&&!isInEditMode()){
		    	   Typeface tf=Typeface.createFromAsset(context.getAssets(), resourse);
			       setTypeface(tf);	         
		       }
		       
		       
	   } finally {
	       a.recycle();
	   }
	}
	
	public void setCustomTypeFace(String path){
		
		if(path!=null){
			Typeface tf=Typeface.createFromAsset(context.getAssets(), path);
			setTypeface(tf);	         
		}
		invalidate();
		requestLayout();
	}
	
}
