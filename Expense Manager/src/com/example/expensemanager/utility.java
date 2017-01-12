package com.example.expensemanager;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Button;


public class utility extends Activity implements OnClickListener{
	
	Button save,edit,delete;
	EditText edtamnt,edtdte,crntutility;
	
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.utility);
	        Log.d("MainActivity","----------onCreate---------");
	        edit=(Button)findViewById(R.id.edtus);
	        save=(Button)findViewById(R.id.saveus);
	        delete=(Button)findViewById(R.id.dltus);
	        
	        edtamnt=(EditText)findViewById(R.id.edtamntus);
	        edtdte=(EditText)findViewById(R.id.edtdteus);
	        crntutility=(EditText)findViewById(R.id.crntus);
	        
	        
	        edit.setOnClickListener(this);
	        save.setOnClickListener(this);
	        delete.setOnClickListener(this);
	       
	       
	    }

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch(arg0.getId()){ 
	    case R.id.saveus:
		
	     break;
		  
		case R.id.edtus:
			break;
		case R.id.dltus:
			break;	
		}
		
	}
	    

}
