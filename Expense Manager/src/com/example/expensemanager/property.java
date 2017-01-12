package com.example.expensemanager;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Button;

public class property extends Activity implements OnClickListener {
	
	Button save,edit,delete;
	EditText edtamnt,edtdte,crntproperty;
	
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.property);
	        Log.d("menu","----------onCreate---------");
	        edit=(Button)findViewById(R.id.edtprof);
	        save=(Button)findViewById(R.id.saveprof);
	        delete=(Button)findViewById(R.id.dltprof);
	        
	        edtamnt=(EditText)findViewById(R.id.edtamntprof);
	        edtdte=(EditText)findViewById(R.id.edtdteprof);
	        crntproperty=(EditText)findViewById(R.id.crntprof);
	        
	        
	        edit.setOnClickListener((OnClickListener) this);
	        save.setOnClickListener((OnClickListener) this);
	        delete.setOnClickListener((OnClickListener) this);
	       

}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch(arg0.getId()){ 
	    case R.id.savepro:
		
	     break;
		  
		case R.id.edtpro:
			break;
		case R.id.dltpro:
			break;	
		
		}	
	}

}
