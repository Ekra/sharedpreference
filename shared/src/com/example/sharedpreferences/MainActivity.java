package com.example.sharedpreferences;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {
	

	   TextView name ;
	   TextView phone;
	   TextView email;
	   TextView street;
	   TextView place;
	   public static final String MyPREFERENCES = "MyPrefs" ;
	   public static final String Name = "nameKey"; 
	   public static final String Phone = "phoneKey"; 
	   public static final String Email = "emailKey"; 
	 

	   SharedPreferences sharedpreferences;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		      name = (TextView) findViewById(R.id.editTextName);
		      phone = (TextView) findViewById(R.id.editTextPhone);
		      street = (TextView) findViewById(R.id.editTextEmail);
		    

		      sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
		      if (sharedpreferences.contains(Name))
		      {
		         name.setText(sharedpreferences.getString(Name, ""));

		      }
		      if (sharedpreferences.contains(Phone))
		      {
		         phone.setText(sharedpreferences.getString(Phone, ""));

		      }
		      if (sharedpreferences.contains(Email))
		      {
		         street.setText(sharedpreferences.getString(Email, ""));

		      }
		    
		     
		   }

		   public void run(View view){
		      String n  = name.getText().toString();
		      String ph  = phone.getText().toString();
		      String e  = email.getText().toString();
		     
		      Editor editor = sharedpreferences.edit();
		      editor.putString(Name, n);
		      editor.putString(Phone, ph);
		      editor.putString(Email, e);
		     

		      editor.commit(); 
		      
		      //startActivity

		   }
		 
	}

	

