package com.example.expensemanager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class menu extends Activity implements OnClickListener {
	
	Button income,expense,calculator,notepad,report;
	
	
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.menu);
	        Log.d("menu","----------onCreate---------");
	        income=(Button)findViewById(R.id.income);
	        expense=(Button)findViewById(R.id.exp);
            calculator=(Button)findViewById(R.id.cal);
            notepad=(Button)findViewById(R.id.note);
            report=(Button)findViewById(R.id.report);
            
            
            income.setOnClickListener(this);
	        expense.setOnClickListener(this);
	        calculator.setOnClickListener(this);
	        notepad.setOnClickListener(this);
	        report.setOnClickListener(this);
	       
}
	 
	 public void income(View v){
	    	Intent intent=new Intent(this,incomeitems.class);
	    	startActivity(intent);

}
	 public void expense(View v){
		 Intent intent=new Intent(this,expenseitems.class);
		 startActivity(intent);
		 
	 }
	// public void calculator(View v){
	    	//Intent intent=new Intent(this,.class);
	    	//startActivity(intent);
	    	
	   // }
	 public void Notepad(View v){
		 Intent intent=new Intent(menu.this,notepad.class);
		 startActivity(intent);
		 
	 }
	 public void Report(View v){
		 Intent intent=new Intent(menu.this,report.class);
		 startActivity(intent);
		 
	 }

	 protected void onRestart(){
	    	super.onRestart();
	    	Log.d("menu","---------onRestart---------");
	    }
	    protected void onStart(){
	    	super.onStart();
	    	Log.d("menu","---------onStart---------");
	    }
	    protected void onResume(){
	    	super.onResume();
	    	Log.d("menu","---------onResume---------");
	    }
	    protected void onPause(){
	    	super.onPause();
	    	Log.d("menu","---------onPause---------");
	    }
	    protected void onStop(){
	    	super.onStop();
	    	Log.d("menu","---------onStop---------");
	    }

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			
        switch(arg0.getId()){
			
			case R.id.income:
			
			  break;
			  
			case R.id.exp:
				break;
			case R.id.cal:
				break;
			case R.id.note:
				break;
			case R.id.report:
				break;	
        }
			
		}
}
	    

