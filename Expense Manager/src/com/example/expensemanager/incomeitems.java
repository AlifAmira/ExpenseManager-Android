package com.example.expensemanager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class incomeitems extends Activity {
	
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.incomeitems);
	        Log.d("MainActivity","----------onCreate---------");

}
	  public void salary(View v){
	    	Intent intent=new Intent(this,salary.class);
	    	startActivity(intent);
	    	
	    }
	  public void selling(View v){
	    	Intent intent=new Intent(this,selling.class);
	    	startActivity(intent);
	    	
	    }
	  public void invest(View v){
	    	Intent intent=new Intent(this,investment.class);
	    	startActivity(intent);
	    	
	    }
	  public void profit(View v){
	    	Intent intent=new Intent(this,profit.class);
	    	startActivity(intent);
	    	
	    }
	  public void property(View v){
	    	Intent intent=new Intent(this,property.class);
	    	startActivity(intent);
	    	
	    }
	    protected void onRestart(){
	    	super.onRestart();
	    	Log.d("MainActivity","---------onRestart---------");
	    }
	    protected void onStart(){
	    	super.onStart();
	    	Log.d("MainActivity","---------onStart---------");
	    }
	    protected void onResume(){
	    	super.onResume();
	    	Log.d("MainActivity","---------onResume---------");
	    }
	    protected void onPause(){
	    	super.onPause();
	    	Log.d("MainActivity","---------onPause---------");
	    }
	    protected void onStop(){
	    	super.onStop();
	    	Log.d("MainActivity","---------onStop---------");
	    }
	} 	 

