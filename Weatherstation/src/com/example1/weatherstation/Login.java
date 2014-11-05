package com.example1.weatherstation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends Activity{


	Button sub;
	TextView log;
	EditText usr , pas;
	@Override
	protected void onCreate(Bundle llogin) {
		// TODO Auto-generated method stub
		super.onCreate(llogin);
		setContentView(R.layout.login);

		sub = (Button) findViewById(R.id.but);
		log = (TextView) findViewById(R.id.tv);
		usr = (EditText) findViewById(R.id.t_login);
		pas = (EditText) findViewById(R.id.t_pass);
		
		sub.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent open_menu = new Intent("com.example1.weatherstation.Menu");
				startActivity(open_menu);
				
			}
		});
	}
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}
	

}
