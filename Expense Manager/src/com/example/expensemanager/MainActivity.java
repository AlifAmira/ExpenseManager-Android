package com.example.expensemanager;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity","----------onCreate---------");
       
    }
    
    public void password(View v){
    	Intent intent=new Intent(this,password.class);
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
} 