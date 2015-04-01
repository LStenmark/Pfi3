package com.example.laura.pfi3;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends Activity
{
    Button btn;

    @Override
    public void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btttttttttttt);
        final String[] quotes = getResources().getStringArray(R.array.Quotes);
        final TextView tv =(TextView)findViewById(R.id.text1);
        int rand = (int) (Math.random() * 14);
        tv.setText(quotes[rand]);

        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Log.i("MyAPP", "Button pressed");
                int rand = (int) (Math.random() * 14);
                tv.setText(quotes[rand]);
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("MyAPP", "on Start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MyAPP", "on Resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MyAPP", "on Pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MyAPP", "on Stop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("MyAPP", "on Restart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MyAPP", "on Destroy");
    }
}