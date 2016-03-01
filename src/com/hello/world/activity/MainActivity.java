package com.hello.world.activity;

import java.util.Date;

import com.hello.world.activity.R;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends BaseActivity implements OnClickListener{
	private Button ysButton;
	private Button ystelButton;
	private Button ysactreslButton;
	private Button changeImageButton;
	private Button alertdiagbButton;
	private Button listbuttButton;
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
		
		ysButton=(Button) findViewById(R.id.ysintent);
		ystelButton=(Button) findViewById(R.id.tel);
		ysactreslButton=(Button) findViewById(R.id.actresl);
		changeImageButton=(Button) findViewById(R.id.changeview);
		alertdiagbButton=(Button) findViewById(R.id.alertdialog);
		listbuttButton=(Button) findViewById(R.id.mainlist);
		ysButton.setOnClickListener(this);
		ystelButton.setOnClickListener(this);
		ysactreslButton.setOnClickListener(this);
		changeImageButton.setOnClickListener(this);
		alertdiagbButton.setOnClickListener(this);
		listbuttButton.setOnClickListener(this);
	}

	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.ysintent:
			
			Intent yssIntent=new Intent("android.intent.action.VIEW");
			yssIntent.setData(Uri.parse("http://www.baidu.com"));
			startActivity(yssIntent);
			break;
		case R.id.tel:
			
			Intent ystelIntent=new Intent(Intent.ACTION_DIAL);
			ystelIntent.setData(Uri.parse("tel://10086"));
			startActivity(ystelIntent);
			break;
		case R.id.actresl:
			
			Intent ysactreslIntent=new Intent("com.test.activyresult.ACTION_START");
			startActivityForResult(ysactreslIntent, 2);
			break;
		case R.id.changeview:
			
			ImageView imv=(ImageView) findViewById(R.id.imagview);
			imv.setImageResource(R.drawable.img01);
			break;
			
		case R.id.alertdialog:
			
			AlertDialog.Builder dialog=new AlertDialog.Builder(this);
			dialog.setTitle("This is Dialog");
			dialog.setMessage("Something important.");
			dialog.setCancelable(false);
			
			dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() 
			{

				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
					
				}

			});
			dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {

				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
					
				}

			});
			dialog.show();
			break;
		case R.id.mainlist:
				Intent mainlistinIntent=new Intent("com.test.activyresult.MainListView");
				startActivity(mainlistinIntent);
				break;
			
		default:
			break;
		
		}
		
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		switch (requestCode) {
		case 2:
		if (resultCode == RESULT_OK) {
		String returnedData = data.getStringExtra("data_return");
		Log.d("MainActivity", returnedData);
		}
		break;
		default:
			break;
		}
		
	}
}
