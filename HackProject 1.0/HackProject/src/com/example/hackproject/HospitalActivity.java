package com.example.hackproject;


import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HospitalActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hospital);
		
		Hospitals hospitals = new Hospitals();
		List hospitalInfo = hospitals.getHospitalList();
		
		Button buttonHospital1 = (Button)findViewById(R.id.buttonHospital1);
		//hospital1.setText(hospitalInfo.get(0));
		Hospital h1 = (Hospital) hospitalInfo.get(0);
		buttonHospital1.setText(h1.hospitalName);
		
		Button buttonHospital2 = (Button)findViewById(R.id.buttonHospital2);
		//hospital1.setText(hospitalInfo.get(1));
		Hospital h2 = (Hospital) hospitalInfo.get(1);
		buttonHospital2.setText(h2.hospitalName);
		
		Button buttonHospital3 = (Button)findViewById(R.id.buttonHospital3);
		//hospital1.setText(hospitalInfo.get(0));
		Hospital h3 = (Hospital) hospitalInfo.get(2);
		buttonHospital3.setText(h3.hospitalName);
		
		Button buttonHospital4 = (Button)findViewById(R.id.buttonHospital4);
		//hospital1.setText(hospitalInfo.get(0));
		Hospital h4 = (Hospital) hospitalInfo.get(3);
		buttonHospital4.setText(h4.hospitalName);
		
		Button buttonHospital5 = (Button)findViewById(R.id.buttonHospital5);
		//hospital1.setText(hospitalInfo.get(0));
		Hospital h5 = (Hospital) hospitalInfo.get(4);
		buttonHospital5.setText(h5.hospitalName);
		
		Button buttonHospital6 = (Button)findViewById(R.id.buttonHospital6);
		//hospital1.setText(hospitalInfo.get(0));
		Hospital h6 = (Hospital) hospitalInfo.get(5);
		buttonHospital6.setText(h6.hospitalName);
		
		Button buttonHospital7 = (Button)findViewById(R.id.buttonHospital7);
		//hospital1.setText(hospitalInfo.get(0));
		Hospital h7 = (Hospital) hospitalInfo.get(6);
		buttonHospital7.setText(h7.hospitalName);
		
		Button buttonHospital8 = (Button)findViewById(R.id.buttonHospital8);
		//hospital1.setText(hospitalInfo.get(0));
		Hospital h8 = (Hospital) hospitalInfo.get(7);
		buttonHospital8.setText(h8.hospitalName);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.hospital, menu);
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
	
	public void ambulanceData(View vw){
/*		
		GPSTracker gps = new GPSTracker(HospitalActivity.this);
		if(gps.canGetLocation()){
        	
        	double latitude = gps.getLatitude();
        	double longitude = gps.getLongitude();
        	
        	Toast.makeText(getApplicationContext(), "Your Location is - \nLat: " + latitude + "\nLong: " + longitude, Toast.LENGTH_LONG).show();
        	
        	if (latitude == 0.0 || longitude == 0.0) {
                Toast.makeText(this, "Please enter Yes button and Enable your network.",
                        Toast.LENGTH_LONG).show();
                return;
            }
     	
        }else{
        	gps.showSettingsAlert();
        }
		double myLatitude = 23.724972;
		double myLongitude = 90.403067;
*/
		
		
	}
	
	public void callHospital1(View vw){
		MyPhoneListener phoneListener = new MyPhoneListener();
		TelephonyManager telephonyManager = (TelephonyManager) this.getSystemService(Context.TELEPHONY_SERVICE);
		telephonyManager.listen(phoneListener,PhoneStateListener.LISTEN_CALL_STATE);
		try {
			Hospitals hospitals = new Hospitals();
			List hospitalInfo = hospitals.getHospitalList();
			Hospital h1 = (Hospital) hospitalInfo.get(0);
			
            String uri = "tel:"+ h1.hospitalPhone;//number.getText().toString();
            Intent callIntent = new Intent(Intent.ACTION_CALL, Uri.parse(uri));
            startActivity(callIntent);
        }catch(Exception e) {
            Toast.makeText(getApplicationContext(),"Your call has failed...",
                Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }
	}
	
	public void callHospital2(View vw){
		MyPhoneListener phoneListener = new MyPhoneListener();
		TelephonyManager telephonyManager = (TelephonyManager) this.getSystemService(Context.TELEPHONY_SERVICE);
		telephonyManager.listen(phoneListener,PhoneStateListener.LISTEN_CALL_STATE);
		try {
			Hospitals hospitals = new Hospitals();
			List hospitalInfo = hospitals.getHospitalList();
			Hospital h2 = (Hospital) hospitalInfo.get(1);
			
            String uri = "tel:"+ h2.hospitalPhone;
            Intent callIntent = new Intent(Intent.ACTION_CALL, Uri.parse(uri));
            startActivity(callIntent);
        }catch(Exception e) {
            Toast.makeText(getApplicationContext(),"Your call has failed...",
                Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }
	}
	
	public void callHospital3(View vw){
		MyPhoneListener phoneListener = new MyPhoneListener();
		TelephonyManager telephonyManager = (TelephonyManager) this.getSystemService(Context.TELEPHONY_SERVICE);
		telephonyManager.listen(phoneListener,PhoneStateListener.LISTEN_CALL_STATE);
		try {
			Hospitals hospitals = new Hospitals();
			List hospitalInfo = hospitals.getHospitalList();
			Hospital h3 = (Hospital) hospitalInfo.get(2);
			
            String uri = "tel:"+ h3.hospitalPhone;
            Intent callIntent = new Intent(Intent.ACTION_CALL, Uri.parse(uri));
            startActivity(callIntent);
        }catch(Exception e) {
            Toast.makeText(getApplicationContext(),"Your call has failed...",
                Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }
	}
	
	public void callHospital4(View vw){
		MyPhoneListener phoneListener = new MyPhoneListener();
		TelephonyManager telephonyManager = (TelephonyManager) this.getSystemService(Context.TELEPHONY_SERVICE);
		telephonyManager.listen(phoneListener,PhoneStateListener.LISTEN_CALL_STATE);
		try {
			Hospitals hospitals = new Hospitals();
			List hospitalInfo = hospitals.getHospitalList();
			Hospital h4 = (Hospital) hospitalInfo.get(3);
			
            String uri = "tel:"+ h4.hospitalPhone;
            Intent callIntent = new Intent(Intent.ACTION_CALL, Uri.parse(uri));
            startActivity(callIntent);
        }catch(Exception e) {
            Toast.makeText(getApplicationContext(),"Your call has failed...",
                Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }
	}
	
	public void callHospital5(View vw){
		MyPhoneListener phoneListener = new MyPhoneListener();
		TelephonyManager telephonyManager = (TelephonyManager) this.getSystemService(Context.TELEPHONY_SERVICE);
		telephonyManager.listen(phoneListener,PhoneStateListener.LISTEN_CALL_STATE);
		try {
			Hospitals hospitals = new Hospitals();
			List hospitalInfo = hospitals.getHospitalList();
			Hospital h5 = (Hospital) hospitalInfo.get(4);
			
            String uri = "tel:"+ h5.hospitalPhone;
            Intent callIntent = new Intent(Intent.ACTION_CALL, Uri.parse(uri));
            startActivity(callIntent);
        }catch(Exception e) {
            Toast.makeText(getApplicationContext(),"Your call has failed...",
                Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }
	}
	
	public void callHospital6(View vw){
		MyPhoneListener phoneListener = new MyPhoneListener();
		TelephonyManager telephonyManager = (TelephonyManager) this.getSystemService(Context.TELEPHONY_SERVICE);
		telephonyManager.listen(phoneListener,PhoneStateListener.LISTEN_CALL_STATE);
		try {
			Hospitals hospitals = new Hospitals();
			List hospitalInfo = hospitals.getHospitalList();
			Hospital h6 = (Hospital) hospitalInfo.get(5);
			
            String uri = "tel:"+ h6.hospitalPhone;
            Intent callIntent = new Intent(Intent.ACTION_CALL, Uri.parse(uri));
            startActivity(callIntent);
        }catch(Exception e) {
            Toast.makeText(getApplicationContext(),"Your call has failed...",
                Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }
	}
	
	public void callHospital7(View vw){
		MyPhoneListener phoneListener = new MyPhoneListener();
		TelephonyManager telephonyManager = (TelephonyManager) this.getSystemService(Context.TELEPHONY_SERVICE);
		telephonyManager.listen(phoneListener,PhoneStateListener.LISTEN_CALL_STATE);
		try {
			Hospitals hospitals = new Hospitals();
			List hospitalInfo = hospitals.getHospitalList();
			Hospital h7 = (Hospital) hospitalInfo.get(6);
			
            String uri = "tel:"+ h7.hospitalPhone;
            Intent callIntent = new Intent(Intent.ACTION_CALL, Uri.parse(uri));
            startActivity(callIntent);
        }catch(Exception e) {
            Toast.makeText(getApplicationContext(),"Your call has failed...",
                Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }
	}
	
	public void callHospital8(View vw){
		MyPhoneListener phoneListener = new MyPhoneListener();
		TelephonyManager telephonyManager = (TelephonyManager) this.getSystemService(Context.TELEPHONY_SERVICE);
		telephonyManager.listen(phoneListener,PhoneStateListener.LISTEN_CALL_STATE);
		try {
			Hospitals hospitals = new Hospitals();
			List hospitalInfo = hospitals.getHospitalList();
			Hospital h8 = (Hospital) hospitalInfo.get(7);
			
            String uri = "tel:"+ h8.hospitalPhone;
            Intent callIntent = new Intent(Intent.ACTION_CALL, Uri.parse(uri));
            startActivity(callIntent);
        }catch(Exception e) {
            Toast.makeText(getApplicationContext(),"Your call has failed...",
                Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }
	}
	
	private class MyPhoneListener extends PhoneStateListener {

        private boolean onCall = false;
        @Override
        public void onCallStateChanged(int state, String incomingNumber) {
            switch (state) {
            case TelephonyManager.CALL_STATE_RINGING:
                // phone ringing...
                Toast.makeText(HospitalActivity.this, incomingNumber + " calls you",
                        Toast.LENGTH_LONG).show();
                break;
            case TelephonyManager.CALL_STATE_OFFHOOK:
                // one call exists that is dialing, active, or on hold
                Toast.makeText(HospitalActivity.this, "on call...",
                        Toast.LENGTH_LONG).show();
                //because user answers the incoming call
                onCall = true;
                break;
 
            case TelephonyManager.CALL_STATE_IDLE:
                // in initialization of the class and at the end of phone call
                // detect flag from CALL_STATE_OFFHOOK
                if (onCall == true) {
                    Toast.makeText(HospitalActivity.this, "restart app after call",
                            Toast.LENGTH_LONG).show();
  
                    // restart our application
                    Intent restart = getBaseContext().getPackageManager().
                        getLaunchIntentForPackage(getBaseContext().getPackageName());
                    restart.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(restart);
  
                    onCall = false;
                }
                break;
            default:
                break;
            }
             
        }
    }
}
