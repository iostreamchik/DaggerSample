package com.petaurus.dagger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

	@Inject
	Rest rest;
//	@Inject
//	Realm realm;

	Button button;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		App.getComponent().inject(this);

		button = (Button) findViewById(R.id.button);
		button.setOnClickListener(v -> button.setText("<<< rest >>>"));
	}

	public Rest getRest() {
		return rest;
	}

//	public Realm getRealm() {
//		return realm;
//	}
}
