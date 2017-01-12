package com.example.expensemanager;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Button;

public class investment extends Activity implements OnClickListener {
	
	   Button save,edit,delete;
	   EditText edtamnt,edtdte,crnti;
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.investment);
	        Log.d("menu","----------onCreate---------");
	        edit=(Button)findViewById(R.id.edti);
	        save=(Button)findViewById(R.id.savei);
	        delete=(Button)findViewById(R.id.dlti);
	        
	        edtamnt=(EditText)findViewById(R.id.edtamnti);
	        edtdte=(EditText)findViewById(R.id.edtdtei);
	        crnti=(EditText)findViewById(R.id.crnti);
	        
	        
	        edit.setOnClickListener(this);
	        save.setOnClickListener(this);
	        delete.setOnClickListener(this);
	       

}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch(arg0.getId()){ 
	    case R.id.savei:
		
	     break;
		  
		case R.id.edti:
			break;
		case R.id.dlti:
			break;	
	}
		
	}

}
