package com.hello.world;

import android.os.Bundle;
import android.view.Window;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainListView extends BaseActivity {
	private ListView listView;
	private String[] data = { "Apple", "Banana", "Orange", "Watermelon",
			"Pear", "Grape", "Pineapple", "Strawberry", "Cherry", "Mango" };
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.mainlistview);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(
				this, android.R.layout.simple_list_item_1, data);
		listView= (ListView) findViewById(R.id.listview);
		listView.setAdapter(adapter);
		
		
		
	}
}
