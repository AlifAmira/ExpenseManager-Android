package com.example.expensemanager;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Button;


public class entertainment extends Activity implements OnClickListener{
	
	//private static final View arg = null;
	//private static final View arg0 = null;
	Button save,edit,delete;
	EditText edtamnt,edtdte,crntent;
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.entertainment);
	        Log.d("MainActivity","----------onCreate---------");
	        edit=(Button)findViewById(R.id.edtent);
	        save=(Button)findViewById(R.id.saveent);
	        delete=(Button)findViewById(R.id.dltent);
	        
	        edtamnt=(EditText)findViewById(R.id.edtamntent);
	        edtdte=(EditText)findViewById(R.id.edtdteent);
	        crntent=(EditText)findViewById(R.id.crntent);
	        
	        
	        edit.setOnClickListener(this);
	        save.setOnClickListener(this);
	        delete.setOnClickListener(this);
	       
	       
	    }

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch(arg0.getId()){ 
	    case R.id.saveent:
		
	     break;
		  
		case R.id.edtent:
			break;
		case R.id.dltent:
			break;	
		
	}}
	   

}
