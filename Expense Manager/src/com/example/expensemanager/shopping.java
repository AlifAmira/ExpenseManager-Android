package com.example.expensemanager;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Button;


public class shopping extends Activity implements OnClickListener {
	
	Button save,edit,delete;
	EditText edtamnt,edtdte,crntshop;
	
	
	  @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.shopping);
	        edit=(Button)findViewById(R.id.edtshop);
	        save=(Button)findViewById(R.id.saveshop);
	        delete=(Button)findViewById(R.id.dltshop);
	        
	        edtamnt=(EditText)findViewById(R.id.edtamntshop);
	        edtdte=(EditText)findViewById(R.id.edtdteshop);
	        crntshop=(EditText)findViewById(R.id.crntshop);
	        
	        
	        edit.setOnClickListener(this);
	        save.setOnClickListener(this);
	        delete.setOnClickListener(this);
	       

}


	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch(arg0.getId()){ 
	    case R.id.saveshop:
		
	     break;
		  
		case R.id.edtshop:
			break;
		case R.id.dltshop:
			break;	
		
		}
	}
}
