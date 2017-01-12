package com.example.expensemanager;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Button;


public class medical extends Activity implements OnClickListener {
	
	Button save,edit,delete;
	EditText edtamnt,edtdte,crntm;
	
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.medical);
	       // Log.d("MainActivity","----------onCreate---------");
	        edit=(Button)findViewById(R.id.edtm);
	        save=(Button)findViewById(R.id.savem);
	        delete=(Button)findViewById(R.id.dltm);
	        
	        edtamnt=(EditText)findViewById(R.id.edtamntm);
	        edtdte=(EditText)findViewById(R.id.edtdtem);
	        crntm=(EditText)findViewById(R.id.crntm);
	        
	        
	        edit.setOnClickListener(this);
	        save.setOnClickListener(this);
	        delete.setOnClickListener(this);
	       

	       
	    }

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch(arg0.getId()){ 
	    case R.id.savem:
		
	     break;
		  
		case R.id.edtm:
			break;
		case R.id.dltm:
			break;	
	}
		
	}
	    

}
