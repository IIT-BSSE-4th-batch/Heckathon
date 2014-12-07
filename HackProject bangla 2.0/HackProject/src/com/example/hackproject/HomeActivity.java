package com.example.hackproject;

import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class HomeActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		/*
		Thread tr=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				new Reminder(HomeActivity.this);
			}
		});
		
		//if(min==16)
		  tr.start();
		*/
		
	}
	
	
	
	//start anik function
	public void measureHeartBeat(View vw){
		System.out.println("heart beat");
		Intent intent = new Intent(HomeActivity.this, HomeActivity.class);
		startActivity(intent);
	}
	
	public void showSymptom(View vw){
		System.out.println("symptom");
		Intent intent = new Intent(HomeActivity.this, SymptomActivity.class);
		startActivity(intent);
	}
	
	public void showProtection(View vw){
		System.out.println("Protection");
		Intent intent = new Intent(HomeActivity.this, ProtectionActivity.class);
		startActivity(intent);
	}
	
	public void showPrevention(View vw){
		System.out.println("Prevention");
		Intent intent = new Intent(HomeActivity.this, PreventionActivity.class);
		startActivity(intent);
	}
	
	public void showHospital(View vw){
		Intent intent = new Intent(HomeActivity.this, HospitalActivity.class);
		startActivity(intent);
	}
	public void showAlarm(View vw){
		Intent intent = new Intent(HomeActivity.this, SchedulerActivity.class);
		startActivity(intent);
	}
	//end anik function	
	
	
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home, menu);
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
