package com.example.expensemanager;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class report extends Activity implements OnClickListener {
	Button daily,monthly,yearly;
	
	
	

	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.report);
	        Log.d("MainActivity","----------onCreate---------");
	        daily=(Button)findViewById(R.id.dailyr);
	        monthly=(Button)findViewById(R.id.monthlyr);
	        yearly=(Button)findViewById(R.id.yearlyr);
	        
	       
	        
	        
	        daily.setOnClickListener(this);
	        monthly.setOnClickListener(this);
	        yearly.setOnClickListener(this);
	       
	       
	    }




	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch(arg0.getId()){ 
	    case R.id.dailyr:
		
	     break;
		  
		case R.id.monthlyr:
			break;
		case R.id.yearlyr:
			break;	
		
		}
		
	}
	

}
