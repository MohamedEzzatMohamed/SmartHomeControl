package com.example.smarthomecontrol;

//import android.arch.lifecycle.ViewModelProvider;
import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
//import android.support.annotation.Nullable;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

public class MainActivity extends AppCompatActivity {

    MainViewModel viewModel;
    BluetoothAdapter bluetoothAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        if(!bluetoothAdapter.isEnabled()){
            Intent enableBT = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
            startActivity(enableBT);
        }


        viewModel = ViewModelProviders.of(this).get(MainViewModel.class);

//        viewModel.fetch().observe(this, new Observer<List<Repositories>>() {
//            @Override
//            public void onChanged(@Nullable List<Repositories> repo) {
//
//            }
//        });
    }
}
