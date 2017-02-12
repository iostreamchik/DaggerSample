package com.petaurus.dagger;

import android.os.Build;
import android.widget.Button;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class, application = App.class, sdk = Build.VERSION_CODES.LOLLIPOP)
public class MainActivityTest {

	private MainActivity activity;

	@Before
	public void setUp() {
		activity = Robolectric.setupActivity(MainActivity.class);
	}

	@Test
	public void clickingButton_shouldChangeResultsViewText() throws Exception {
		Button button = (Button) activity.findViewById(R.id.button);
		button.performClick();
		assertThat(button.getText().toString(), equalTo("<<< rest >>>"));
		assertNotNull(activity.getRest());
		assertNotNull(activity.getRest().getContext());
	}
}
