package com.hello.fragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;

import com.hello.world.activity.BaseActivity;
import com.hello.world.activity.R;

public class MainFragMentActivity extends BaseActivity implements  OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.fragment_main);
		Button button=(Button) findViewById(R.id.button);
		button.setOnClickListener(this);
	}

	public void onClick(View v) {
	
			switch (v.getId()) {
			case R.id.button:
			AnotherRightFragment fragment = new AnotherRightFragment();
			FragmentManager fragmentManager = getFragmentManager();
			FragmentTransaction transaction = fragmentManager.
			beginTransaction();
			transaction.addToBackStack(null);
			transaction.commit();
			
			
			break;
			default:
			break;
			}
		}
	
	

		
}

