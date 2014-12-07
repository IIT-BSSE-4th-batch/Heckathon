package com.example.hackproject;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class PreventionActivity extends Activity {

/*
	Button foodButton;
	Button exerciseButton;
	Button weightButton;
	Button smokeButton;
	Button sleepButton;
	Button healthButton;
	Button tensionButton;
*/	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_prevention);
/*		
		foodButton = (Button) findViewById(R.id.foodButton);
		exerciseButton = (Button) findViewById(R.id.exerciseButton);
		weightButton = (Button) findViewById(R.id.weightButton);
		tensionButton = (Button) findViewById(R.id.tensionButton);
		
		
		foodButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(PreventionActivity.this, PreventionFoodActivity.class);
				startActivity(intent);
			}
		});
		
		
		exerciseButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(PreventionActivity.this,PreventionExerciseActivity.class);
				startActivity(intent);
			}
		});
		
		
		weightButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(PreventionActivity.this,PreventionWeightActivity.class);
				startActivity(intent);
			}
		});
		
		
		tensionButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(PreventionActivity.this,PreventionTensionActivity.class);
				startActivity(intent);
			}
		});
*/		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.prevention, menu);
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
