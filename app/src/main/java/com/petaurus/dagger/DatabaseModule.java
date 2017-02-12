package com.petaurus.dagger;

import android.content.Context;
import dagger.Module;
import dagger.Provides;
import io.realm.Realm;
import io.realm.RealmConfiguration;

import javax.inject.Singleton;

@Module
public class DatabaseModule {

	@Provides
	@Singleton
	public Realm provideRealm(Context context) {
		Realm.init(context);
		RealmConfiguration config = new RealmConfiguration.Builder()
				.deleteRealmIfMigrationNeeded()
				.build();
		Realm.setDefaultConfiguration(config);
		return Realm.getDefaultInstance();
	}

}
