package com.example.expensemanager;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Button;


public class travel extends Activity implements OnClickListener{
	
	Button save,edit,delete;
	EditText edtamnt,edtdte,crnttravel;
	
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.travel);
	        Log.d("MainActivity","----------onCreate---------");
	        edit=(Button)findViewById(R.id.edttrv);
	        save=(Button)findViewById(R.id.savetrv);
	        delete=(Button)findViewById(R.id.dlttrv);
	        
	        edtamnt=(EditText)findViewById(R.id.edtamnttrv);
	        edtdte=(EditText)findViewById(R.id.edtdtetrv);
	        crnttravel=(EditText)findViewById(R.id.crnttrv);
	        
	        
	        edit.setOnClickListener(this);
	        save.setOnClickListener(this);
	        delete.setOnClickListener(this);
	       
	       
	    }

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch(arg0.getId()){ 
	    case R.id.savetrv:
		
	     break;
		  
		case R.id.edttrv:
			break;
		case R.id.dlttrv:
			break;	
		
	}
	}    

}
