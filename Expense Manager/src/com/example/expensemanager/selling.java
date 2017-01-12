package com.example.expensemanager;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Button;

public class selling extends Activity implements OnClickListener {
	
	Button save,edit,delete;
	EditText edtamnt,edtdte,crntsel;
	
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.selling);
	        Log.d("menu","----------onCreate---------");
	        edit=(Button)findViewById(R.id.edtsel);
	        save=(Button)findViewById(R.id.savesel);
	        delete=(Button)findViewById(R.id.dltsel);
	        
	        edtamnt=(EditText)findViewById(R.id.edtsel);
	        edtdte=(EditText)findViewById(R.id.edtdtesel);
	        crntsel=(EditText)findViewById(R.id.crntsel);
	        
	        
	        edit.setOnClickListener(this);
	        save.setOnClickListener(this);
	        delete.setOnClickListener(this);
	       

}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch(arg0.getId()){ 
	    case R.id.savesel:
		
	     break;
		  
		case R.id.edtsel:
			break;
		case R.id.dltsel:
			break;	
		}
		
	}

}
