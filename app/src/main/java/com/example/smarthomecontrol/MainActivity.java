package com.example.smarthomecontrol;


import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;


public class MainActivity extends AppCompatActivity {

    MainViewModel viewModel;
    BluetoothAdapter bluetoothAdapter;
    Intent intent;
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

    public void temperatureControl(View view) {
        intent = new Intent(getApplicationContext(), LightsActivity.class);
        startActivity(intent);
    }

    public void setPool(View view) {
    }

    public void setCurtains(View view) {
    }

    public void setLights(View view) {
    }

}
