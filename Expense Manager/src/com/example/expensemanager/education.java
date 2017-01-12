package com.example.expensemanager;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Button;


public class education extends Activity implements OnClickListener {
	
	Button edit,save,delete;
	EditText edtamnt,edtdate,crntedu;
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.education);
	        Log.d("MainActivity","----------onCreate---------");
	        edit=(Button)findViewById(R.id.edtedu);
	        save=(Button)findViewById(R.id.saveedu);
	        delete=(Button)findViewById(R.id.dltedu);
	        
	        edtamnt=(EditText)findViewById(R.id.edtamntedu);
	        edtdate=(EditText)findViewById(R.id.edtdateedu);
	        crntedu=(EditText)findViewById(R.id.crntedu);
	        
	        
	        edit.setOnClickListener(this);
	        save.setOnClickListener(this);
	        delete.setOnClickListener(this);
	       


	       
	    }
	 protected void onRestart(){
	    	super.onRestart();
	    	Log.d("MainActivity","---------onRestart---------");
	    }
	    protected void onStart(){
	    	super.onStart();
	    	Log.d("MainActivity","---------onStart---------");
	    }
	    protected void onResume(){
	    	super.onResume();
	    	Log.d("MainActivity","---------onResume---------");
	    }
	    protected void onPause(){
	    	super.onPause();
	    	Log.d("MainActivity","---------onPause---------");
	    }
	    protected void onStop(){
	    	super.onStop();
	    	Log.d("MainActivity","---------onStop---------");
	    }


	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch(arg0.getId()){ 
	    case R.id.saveedu:
		
	     break;
		  
		case R.id.edtedu:
			break;
		case R.id.dltedu:
			break;	
	}
	}
}


