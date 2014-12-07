package com.example.hackproject;
 
import java.util.Calendar;
import android.app.Activity;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;
 
public class SchedulerActivity extends Activity {
 
	private TextView tvDisplayTime;
	private TimePicker timePicker1;
	private TimePicker timePicker2;
	private TimePicker timePicker3;
	private TimePicker timePicker4;
	private Button btnChangeTime;
	private Button btnChangeTime1;
	private Button btnChangeTime2;
	private Button btnChangeTime3;
 
	private int hour;
	private int minute;
 
	static final int TIME_DIALOG_ID = 999;
 
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_scheduler);
 
		setCurrentTimeOnView();
		addListenerOnButton();
 
	}
 
	// display current time
	public void setCurrentTimeOnView() {
 
		tvDisplayTime = (TextView) findViewById(R.id.tvTime);
		timePicker1 = (TimePicker) findViewById(R.id.timePicker1);
 
		final Calendar c = Calendar.getInstance();
		hour = c.get(Calendar.HOUR_OF_DAY);
		minute = c.get(Calendar.MINUTE);
 
		// set current time into textview
		tvDisplayTime.setText(
                    new StringBuilder().append(pad(hour))
                                       .append(":").append(pad(minute)));
 
		// set current time into timepicker
		timePicker1.setCurrentHour(hour);
		timePicker1.setCurrentMinute(minute);
 
	}
 
	public void addListenerOnButton() {
 
		btnChangeTime = (Button) findViewById(R.id.btnChangeTime);
 
		btnChangeTime.setOnClickListener(new OnClickListener() {
 
			@Override
			public void onClick(View v) {
 
				showDialog(TIME_DIALOG_ID);
 
			}
 
		});
		
		btnChangeTime1 = (Button) findViewById(R.id.btnChangeTime1);
		 
		btnChangeTime1.setOnClickListener(new OnClickListener() {
 
			@Override
			public void onClick(View v) {
 
				showDialog(TIME_DIALOG_ID);
 
			}
 
		});
		
		btnChangeTime2 = (Button) findViewById(R.id.btnChangeTime2);
		 
		btnChangeTime2.setOnClickListener(new OnClickListener() {
 
			@Override
			public void onClick(View v) {
 
				showDialog(TIME_DIALOG_ID);
 
			}
 
		});
		
		btnChangeTime3 = (Button) findViewById(R.id.btnChangeTime3);
		 
		btnChangeTime3.setOnClickListener(new OnClickListener() {
 
			@Override
			public void onClick(View v) {
 
				showDialog(TIME_DIALOG_ID);
 
			}
 
		});
 
	}
 
	@Override
	protected Dialog onCreateDialog(int id) {
		switch (id) {
		case TIME_DIALOG_ID:
			// set time picker as current time
			return new TimePickerDialog(this, 
                                        timePickerListener, hour, minute,false);
 
		}
		return null;
	}
 
	private TimePickerDialog.OnTimeSetListener timePickerListener = 
            new TimePickerDialog.OnTimeSetListener() {
		public void onTimeSet(TimePicker view, int selectedHour,
				int selectedMinute) {
			hour = selectedHour;
			minute = selectedMinute;
 
			// set current time into textview
			tvDisplayTime.setText(new StringBuilder().append(pad(hour))
					.append(":").append(pad(minute)));
 
			// set current time into timepicker
			timePicker1.setCurrentHour(hour);
			timePicker1.setCurrentMinute(minute);
 
		}
	};
 
	private static String pad(int c) {
		if (c >= 10)
		   return String.valueOf(c);
		else
		   return "0" + String.valueOf(c);
	}
}