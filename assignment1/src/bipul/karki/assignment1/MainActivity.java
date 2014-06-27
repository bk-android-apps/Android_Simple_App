package bipul.karki.assignment1;
//Bipul Karki, CmpE 277, Spring 2014 - Simple Android Application

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {
	final Context CONTEXT = this;
	private boolean flag = false;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void openSJSU(View v){
    	String url = "http://www.sjsu.edu";
    	Intent i = new Intent(Intent.ACTION_VIEW);
    	i.setData(Uri.parse(url));
    	flag = true;
    	startActivity(i);
    }
    
    public void checkButtonOne(View v){
    	AlertDialog.Builder dialog_builder = new AlertDialog.Builder(CONTEXT);
    	
    	if(flag){
    		Log.i("myMsg", "SJSU button has been clicked"); //message1
    		dialog_builder.setMessage(R.string.message1); 
    		dialog_builder.setNeutralButton(R.string.ok, null); // action button "OK"
    		dialog_builder.show();	
    	} 
    	else{
    		Log.i("myMsg", "click on SJSU button"); //message2
    		dialog_builder.setMessage(R.string.message2); 
    		dialog_builder.setNeutralButton(R.string.ok, null); // action button "OK"
    		dialog_builder.show();
    	}   	
    }

}
