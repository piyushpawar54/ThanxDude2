package com.example.awesome.thanxdude;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    private Toolbar maintoolbar;

    private  FirebaseAuth mAuth;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAuth = FirebaseAuth.getInstance();

        maintoolbar = findViewById(R.id.main_toolbar);
        setSupportActionBar(maintoolbar);
        getSupportActionBar().setTitle("ThanxDude");

    }

    protected void onStart(){
        super.onStart();

        FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();
        if(currentUser == null)
        {
            sendtologin();
        }
        else
        {

        }
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main_menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId())
        {
            case R.id.action_logout_btn:
                logout();
                return  true;


            default:
                return  false;

        }

    }
    private void sendtologin() {
        Intent loginintent = new Intent(MainActivity.this,LoginActivity.class);
        startActivity(loginintent);
        finish();

    }

    private void logout() {
        mAuth.signOut();;
        sendtologin();
    }

}
