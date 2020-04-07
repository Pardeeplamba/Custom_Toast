package com.example.toastshowtext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
   //     Toast.makeText( getApplicationContext(), "toast shows", Toast.LENGTH_SHORT).show();

        LayoutInflater inflater=getLayoutInflater();
        View l=inflater.inflate(R.layout.customtoast,(ViewGroup) findViewById(R.id.linear));
        Toast toast=new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(l);
        toast.show();

    }
}
