package com.example.expensemanager;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Button;

public class salary extends Activity implements OnClickListener {
	
	Button save,edit,delete;
	EditText edtamnt,edtdte,crntsal;
	
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.salary);
	        Log.d("menu","----------onCreate---------");
	        edit=(Button)findViewById(R.id.editsal);
	        save=(Button)findViewById(R.id.savesal);
	        delete=(Button)findViewById(R.id.dltsal);
	        
	        edtamnt=(EditText)findViewById(R.id.edtamntedu);
	        edtdte=(EditText)findViewById(R.id.edtdateedu);
	        crntsal=(EditText)findViewById(R.id.crntedu);
	        
	        
	        edit.setOnClickListener((OnClickListener) this);
	        save.setOnClickListener((OnClickListener) this);
	        delete.setOnClickListener((OnClickListener) this);
	       

}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch(arg0.getId()){ 
	    case R.id.savesal:
		
	     break;
		  
		case R.id.editsal:
			break;
		case R.id.dltsal:
			break;	
		
		}
	}

}
