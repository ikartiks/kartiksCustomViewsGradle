package com.kartiks.sample;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

public class MainActivity extends Activity {

	Context context=MainActivity.this;

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_main);

		//Test CHange
		
		/*SliderView sv=(SliderView)findViewById(R.id.SliderView1);
		sv.setOnReachedListener(new OnReachedListener() {
			@Override
			public void onReached() {
				LoggerGeneral.info("reached");
			}
			
			@Override
			public void onLoggedOut() {
				LoggerGeneral.info("logout maar");
			}
		});*/
		
		/*CustomTextView ctx=findViewById(R)
		Typeface type = Typeface.createFromAsset(getAssets(),"s.ttf"); 
		   txtyour.setTypeface(type);*/
		//fm=getSupportFragmentManager();
		//fm.beginTransaction().add(R.id.container,new ListViewScrollListenerFragment()).commit();
		
	}




}
