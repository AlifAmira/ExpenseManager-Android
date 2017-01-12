package com.example.expensemanager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class expenseitems extends Activity {
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.expenseitems);
	        Log.d("income","----------onCreate---------");

}
	 public void shopping(View v){
	    	Intent intent=new Intent(this,shopping.class);
	    	startActivity(intent);
	    	
	    }
	 public void educational(View v){
	    	Intent intent=new Intent(this,education.class);
	    	startActivity(intent);
	    	
	    }
	 public void entertainment(View v){
	    	Intent intent=new Intent(this,entertainment.class);
	    	startActivity(intent);
	    	
	    }
	 public void medical(View v){
	    	Intent intent=new Intent(this,medical.class);
	    	startActivity(intent);
	    	
	    }
	 public void travel(View v){
	    	Intent intent=new Intent(this,travel.class);
	    	startActivity(intent);
	    	
	    }
	 public void utility(View v){
	    	Intent intent=new Intent(this,utility.class);
	    	startActivity(intent);
	    	
	    }
	    

	    

	    

	    

	    

	 
}
