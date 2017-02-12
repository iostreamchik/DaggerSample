package com.petaurus.dagger;

import dagger.Component;

import javax.inject.Singleton;

@Component(modules = {AppModule.class, RestModule.class, DatabaseModule.class})
@Singleton
public interface AppComponent {
	void inject(MainActivity mainActivity);
}