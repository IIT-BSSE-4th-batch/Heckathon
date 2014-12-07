package com.example.hackproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ProtectionActivity extends Activity {

	Button protectionFoodButton;
	Button protectionWeightButton;
	Button protectionExerciseButton;
	Button protectionTensionButton;
	Button protectionSleepButton;
	Button protectionHealthButton;
	Button protectionSmokeButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_protection);
		
		protectionFoodButton = (Button) findViewById(R.id.protectionFoodButton);
		protectionExerciseButton = (Button) findViewById(R.id.protectionExerciseButton);
		protectionWeightButton = (Button) findViewById(R.id.protectionWeightButton);
		protectionTensionButton = (Button) findViewById(R.id.protectionTensionButton);
		
		protectionFoodButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(ProtectionActivity.this,ProtectionFoodActivity.class);
				startActivity(intent);
			}
		});
		
		protectionExerciseButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(ProtectionActivity.this,ProtectionExerciseActivity.class);
				startActivity(intent);
			}
		});
		
		protectionWeightButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(ProtectionActivity.this,ProtectionWeightActivity.class);
				startActivity(intent);
			}
		});
		
		protectionTensionButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(ProtectionActivity.this,ProtectionTensionActivity.class);
				startActivity(intent);
			}
		});
		
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.protection, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
