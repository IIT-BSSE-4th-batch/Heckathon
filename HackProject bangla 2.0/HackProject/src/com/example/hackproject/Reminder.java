package com.example.hackproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer;
import android.renderscript.Int3;
import android.util.Log;

public class Reminder {

	List<ReminderData>userRemiderDataList;
	static public MediaPlayer mp;
	static public boolean paused=false;
	
	public Reminder(Context context) {
		
		
		userRemiderDataList = new ArrayList<>();
		InputStream is = context.getResources().openRawResource(R.drawable.time_data);
		BufferedReader input = new BufferedReader(new InputStreamReader(is));
		System.out.println("rifat");
		String line;
		try {
			while((line=input.readLine())!=null)
			{
				System.out.println(line);
				String message=line;
				String hour=input.readLine();
				//System.out.println(hour);
				String minute=input.readLine();//Integer.parseInt(input.readLine());
				userRemiderDataList.add(new ReminderData(message, hour, minute));
				
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		Boolean flag=true;
		MediaPlayer mediaPlayer = MediaPlayer.create(context,R.drawable.test);
		
		mp=mediaPlayer;
		while(flag){
			boolean found=false;
		for (ReminderData userReminderData : userRemiderDataList) {
		
			Calendar today = Calendar.getInstance();
			System.out.println("Condition:");
			System.out.println(userReminderData.hour.equals(Integer.toString(today.get(Calendar.HOUR))) && userReminderData.minute.equals(Integer.toString(today.get(Calendar.MINUTE))));
			//System.out.println(userReminderData.hour+":"+userReminderData.minute+":"+userReminderData.message);
			//System.out.println(userReminderData.minute.equals(Integer.toString(today.get(Calendar.MINUTE))));
			if(userReminderData.hour.equals(Integer.toString(today.get(Calendar.HOUR))) && userReminderData.minute.equals(Integer.toString(today.get(Calendar.MINUTE))) )
			{

				found=true;
				//if(flag)
				// {
				System.err.println("paused: "+paused);
				
				if(!mediaPlayer.isPlaying() && !paused){
				//mediaPlayer=MediaPlayer.create(context,R.drawable.test);
							
				    mediaPlayer.seekTo(1);
					mediaPlayer.start();

					Intent intent = new Intent(context,ReminderActivity.class);
					intent.putExtra("MESSAGE", userReminderData.message);
					context.startActivity(intent);
				
				}
				/*mediaPlayer.setOnPreparedListener(new OnPreparedListener() {
					
					@Override
					public void onPrepared(MediaPlayer mp) {
						// TODO Auto-generated method stub
						mp.start();
					}
				});*/
					
					
					//flag=false;
				 //}
				//flag=false;
			}
			
		
		}
		
		if(!found && mediaPlayer.isPlaying())
			{
			mediaPlayer.pause();
		    paused=false;
			}
		if(!found)
		{
			paused=false;
		}
		
		}
		
		
		
				
	}
    


}
