package com.example.firrstapp;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.firrstapp.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
    }
    public void validate(View view) {
        Log.d("erreeeeeeeer", "aaaaa");
        EditText Firstname = (EditText)findViewById(R.id.FirstName);
        EditText Lastname = (EditText)findViewById(R.id.LastName);
        EditText adresse = (EditText)findViewById(R.id.Adresse);
        if(Firstname.getText().toString().equals("") || Lastname.getText().toString().equals("") || adresse.getText().toString().equals("")){
            Log.d("erreeeeeeeer", "");
            Toast.makeText(MainActivity.this,
                    "empty...",Toast.LENGTH_SHORT).show();
        }
        else{
            Intent intent = new Intent(getBaseContext(), MainActivity2.class);
            intent.putExtra(Intent.EXTRA_TEXT,Firstname.getText().toString());
            startActivity(intent);
        }

    }
}