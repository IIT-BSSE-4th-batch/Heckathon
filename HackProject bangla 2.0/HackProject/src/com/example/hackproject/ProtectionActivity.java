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
	Button protectionAloneAttack;
	Button protectionSuddenAttack;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_protection);
		
		protectionFoodButton = (Button) findViewById(R.id.protectionFoodButton);
		protectionExerciseButton = (Button) findViewById(R.id.protectionExerciseButton);
		protectionWeightButton = (Button) findViewById(R.id.protectionWeightButton);
		protectionTensionButton = (Button) findViewById(R.id.protectionTensionButton);
		
		protectionSleepButton = (Button) findViewById(R.id.protectionSleepButton);
		protectionHealthButton = (Button) findViewById(R.id.protectionHealthButton);
		protectionSmokeButton = (Button) findViewById(R.id.protectionSmokeButton);
		protectionAloneAttack = (Button) findViewById(R.id.protectionAloneAttack);
		protectionSuddenAttack = (Button) findViewById(R.id.protectionSuddenAttack);
		
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
		
		protectionSleepButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(ProtectionActivity.this,ProtectionSleepActivity.class);
				startActivity(intent);
			}
		});
		
		protectionHealthButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(ProtectionActivity.this,ProtectionHealthCareActivity.class);
				startActivity(intent);
			}
		});
		
		protectionSmokeButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(ProtectionActivity.this,ProtectionSmokeActivity.class);
				startActivity(intent);
			}
		});
		
		protectionAloneAttack.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(ProtectionActivity.this,ProtectionAloneAttackActivity.class);
				startActivity(intent);
			}
		});
		
		protectionSuddenAttack.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(ProtectionActivity.this,ProtectionSuddenAttackActivity.class);
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
