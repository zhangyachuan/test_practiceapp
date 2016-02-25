package com.hello.world;

import android.R.string;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class HelloworldActivity extends Activity {
    /** Called when the activity is first created. */
	
	private Button loginButton;
	private TextView textUser;
	private TextView textPwd;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.main);
        Log.d("activity", "a�ɹ�����������");
        
      loginButton=(Button)findViewById(R.id.login);
      textUser= (TextView) findViewById(R.id.textUser);
      textPwd=(TextView) findViewById(R.id.textPwd);
      
      
      loginButton.setOnClickListener(new OnClickListener() {
		
		public void onClick(View v) {
			String tuer= textUser.getText().toString();
			String tpwd= textPwd.getText().toString();
			
			if(tuer.equals("admin") && tpwd.equals("1234"))
			{
				Log.d("��ʾ", "��¼�ɹ�");
				Toast.makeText(HelloworldActivity.this, "��½�ɹ�", Toast.LENGTH_SHORT).show();
				
//				������ȷ��ʼ��¼��ת
				Intent dataIntent=new Intent(HelloworldActivity.this, MainActivity.class);
				dataIntent.putExtra("user", tuer);
				dataIntent.putExtra("pwd", tpwd);
				startActivity(dataIntent);
				
				
			}else {
				Log.e("��ʾ", "��¼ʧ��");
			}
			
			
		}
	});
    }
    
    @Override
    public void onBackPressed() {
    	super.onBackPressed();
    	Log.d("activity", "����");
        Log.e("activity", "e����");
        Log.w("activity", "w����");
    	Toast.makeText(this, "�ҵĵ�һ�η�����ʾ", Toast.LENGTH_SHORT).show();
    }
}