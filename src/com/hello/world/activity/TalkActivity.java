package com.hello.world.activity;

import com.hello.world.activity.R;

import android.os.Bundle;
import android.view.Window;

public class TalkActivity extends BaseActivity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.layout_talk);
	}
}
