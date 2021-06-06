package com.example.firrstapp;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

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

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
    }

    public void validate(View view) {
        EditText Firstname = (EditText)findViewById(R.id.FirstName);
        EditText Lastname = (EditText)findViewById(R.id.LastName);
        EditText adresse = (EditText)findViewById(R.id.Adresse);
        if(Firstname.getText().toString().equals("") || Lastname.getText().toString().equals("") || adresse.getText().toString().equals("")){
            Toast.makeText(getApplicationContext(),
                    "empty...",Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(getApplicationContext(),
                    "good...",Toast.LENGTH_SHORT).show();
        }

    }
}