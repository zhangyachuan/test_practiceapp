package com.hello.activitycollec;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

public class ActivityCollector {
	public static List<Activity> activities=new ArrayList<Activity>();
	
	
	public static void addActivity(Activity activity) {
		activities.add(activity);
		}
	
	
	public static void removeActivity(Activity activity) {
	activities.remove(activity);
	}
	
	public static void finishAll() {
	for (Activity activity : activities) {
	if (!activity.isFinishing()) {
	activity.finish();
	}
	}
	}
	
	
	
	public static void actionStartIntent(Context context,Class<?> cls,String[] para,String[] para1)
	{
		Intent ints=new Intent(context, cls);
		ints.putExtra(para[0], para[1]);
		ints.putExtra(para1[0], para1[1]);
		context.startActivity(ints);
	}
}
