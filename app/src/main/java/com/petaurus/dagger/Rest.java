package com.petaurus.dagger;

import android.content.Context;

public class Rest {

	private static final String TAG = Rest.class.getSimpleName();

	private Context context;

	public Rest(Context context) {
		this.context = context;
	}

	public Context getContext() {
		return context;
	}
}
