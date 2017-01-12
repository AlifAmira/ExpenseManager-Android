package com.example.expensemanager;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Button;

public class password extends Activity implements OnClickListener {
	
	Button save,Go;
	EditText setpass,confpass;
	@Override
	 protected  void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.password);
	        Log.d("password","----------onCreate---------");
	        save=(Button) findViewById(R.id.savepass);
	        Go=(Button) findViewById(R.id.Gopass1);
	        setpass=(EditText) findViewById(R.id.edtpass);
	        confpass=(EditText) findViewById(R.id.edtpass1);
	        
	        save.setOnClickListener(this);
	        Go.setOnClickListener(this);

}
	 
	 public void Go(View v){
	    	Intent intent=new Intent(this,menu.class);
	    	startActivity(intent);

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
			
			case R.id.savepass:
			
			  break;
			  
			case R.id.Gopass1:
				break;
			  
			}
			
		}}
