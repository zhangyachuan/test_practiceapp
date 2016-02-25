package com.hello.world;

import java.util.Date;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.Toast;

public class MainActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.mainactivity);
		Intent dataIntent=getIntent();
		String user=	dataIntent.getStringExtra("user");
//		/String	pwd=dataIntent.getStringExtra("pwd");
		Toast.makeText(this, "»¶Ó­Äã"+user+"ÈÕÆÚ"+new Date().toGMTString(), Toast.LENGTH_SHORT).show();
	}
}
