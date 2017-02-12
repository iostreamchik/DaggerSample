package com.petaurus.dagger;

import io.realm.RealmObject;

public class SimpleModel extends RealmObject {
	private String name;

	public SimpleModel() {
	}

	public SimpleModel(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
