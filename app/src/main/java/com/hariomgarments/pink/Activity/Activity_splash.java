package com.hariomgarments.pink.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

import com.hariomgarments.pink.Components.SessionManager;
import com.hariomgarments.pink.R;

public class Activity_splash extends Activity {

    Handler handler;
    SessionManager session;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_splash);
        session = new SessionManager(getApplicationContext());
        handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
               ///
                session.checkLogin();

               /* if (session.isLoggedIn){
                    Toast.makeText(Activity_splash.this, "session login true", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(Activity_splash.this, "session login false", Toast.LENGTH_SHORT).show();

                }*/

                finish();
            }
        },2000);

    }
}