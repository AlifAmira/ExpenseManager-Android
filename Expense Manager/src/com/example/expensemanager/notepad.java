package com.example.expensemanager;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Button;


public class notepad extends Activity implements OnClickListener {
	
	
	Button save,edit,delete,show;
	EditText edtnote;
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notepad);
        Log.d("notepad","----------onCreate---------");
        edit=(Button)findViewById(R.id.edtn);
        save=(Button)findViewById(R.id.saven);
        delete=(Button)findViewById(R.id.dltn);
        show=(Button)findViewById(R.id.shwn);
        
        edtnote=(EditText)findViewById(R.id.edtnote);
        
        
        edit.setOnClickListener(this);
        save.setOnClickListener(this);
        delete.setOnClickListener(this);
        show.setOnClickListener(this);
        
        

}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch(arg0.getId()){ 
	    case R.id.edtn:
		
	     break;
		  
		case R.id.saven:
			break;
		case R.id.dltn:
			break;
		case R.id.shwn:
			break;	
			
	}
		
	}
}
