package com.domaindriven.androidtools;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public final class Connectivity {
	
	public static boolean isNetworkAvailable(Context context) {
	
		ConnectivityManager connectivityManager 
	          = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
	    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
	    return activeNetworkInfo != null;
	}
}
