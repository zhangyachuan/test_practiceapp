package com.hello.world.activity;

import com.hello.activitycollec.ActivityCollector;
import com.hello.world.activity.R;

import android.R.string;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends BaseActivity implements OnClickListener{
    /** Called when the activity is first created. */
	
	private Button loginButton;
	private TextView textUser;
	private TextView textPwd;
	private Button cancelButton;
	private Button talkButton;
	private Button fragmentButton;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.main);
        
       
        
        loginButton=(Button)findViewById(R.id.login);
        cancelButton=(Button)findViewById(R.id.cancel);
        textUser= (TextView) findViewById(R.id.textUser);
        textPwd=(TextView) findViewById(R.id.textPwd);
        talkButton=(Button)findViewById(R.id.talk);
        fragmentButton=(Button)findViewById(R.id.fragment);
        
        if (savedInstanceState != null) {
        	String tempData = savedInstanceState.getString("user");
        	Log.d("tag", tempData);
        	 textUser.setText(tempData);
        	}
        Log.d("activity", "a成功啦，哈哈哈");
       
      
      
      
      loginButton.setOnClickListener(this);
      cancelButton.setOnClickListener(this);
      talkButton.setOnClickListener(this);
      fragmentButton.setOnClickListener(this);
    }
    
    @Override
    public void onBackPressed() {
    	super.onBackPressed();
    	Log.d("activity", "返回");
        Log.e("activity", "e返回");
        Log.w("activity", "w返回");
    	Toast.makeText(this, "我的第一次返回提示", Toast.LENGTH_SHORT).show();
    }

	public void onClick(View v) {
		String tuer= textUser.getText().toString();
		String tpwd= textPwd.getText().toString();
		
			switch (v.getId()) {
			case R.id.talk:
				Intent talkIntent=new Intent("com.test.activyresult.TalkActivity");
				talkIntent.addCategory("com.intent.category.mytest.TalkActivity");
				startActivity(talkIntent);
				break;
			case R.id.fragment:
				Intent fragmentIntent=new Intent("com.test.activyresult.MainFragMentActivity");
				fragmentIntent.addCategory("com.intent.category.mytest.MainFragMentActivity");
				startActivity(fragmentIntent);
				break;
			case R.id.login:

				if(tuer.equals("admin") && tpwd.equals("1234"))
				{
					Log.d("提示", "登录成功");
					Toast.makeText(LoginActivity.this, "登陆成功", Toast.LENGTH_SHORT).show();
					
//					密码正确开始登录跳转
/*					Intent dataIntent=new Intent(HelloworldActivity.this, MainActivity.class);
					dataIntent.putExtra("user", tuer);
					dataIntent.putExtra("pwd", tpwd);
					startActivity(dataIntent);
					*/
					
					ActivityCollector.actionStartIntent(this, MainActivity.class, new String[]{"user",tuer}, new String[]{"pwd",tpwd});
					
				}else {
					Log.e("提示", "登录失败");
				}
				break;
			case R.id.cancel:
				
				
				if(tuer.equals("admin") && tpwd.equals("1234"))
				{
					Log.d("提示", "登录成功");
					Toast.makeText(LoginActivity.this, "登陆成功", Toast.LENGTH_SHORT).show();
					
//					密码正确开始登录跳转
/*					Intent dataIntent=new Intent(HelloworldActivity.this, MainActivity.class);
					dataIntent.putExtra("user", tuer);
					dataIntent.putExtra("pwd", tpwd);
					startActivity(dataIntent);*/
					Log.d("提示", "隐式登录成功");
					Intent hideintentIntent=new Intent("com.example.activitytest.ACTION_START");
					hideintentIntent.addCategory("com.intent.category.MY_TEST");
					startActivity(hideintentIntent);
				}else {
					Log.e("提示", "登录失败");
				}
				break;
			default:
				break;
			}	
				
				
	
		
	}
	
	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		Log.d("当前状态", "停止");
	}
	
	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Log.d("当前状态", "暂停");
	}
	
	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
		Log.d("当前状态", "onRestart");
	}
	
	
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		Log.d("当前状态", "onStart");
	}
	
	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		String userString=textUser.getText().toString();
		outState.putString("user", userString);
	}
}