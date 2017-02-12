package com.petaurus.dagger;

import android.app.Application;

public class App extends Application {

	private static AppComponent component;

	public static AppComponent getComponent() {
		return component;
	}

	@Override
	public void onCreate() {
		super.onCreate();
		component = buildComponent();
	}

	private AppComponent buildComponent() {
		return DaggerAppComponent.builder()
				.appModule(new AppModule(this))
				.restModule(new RestModule())
				.build();
	}
}
