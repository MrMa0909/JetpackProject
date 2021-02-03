package com.cfox.jetnavigation.my;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.cfox.jetnavigation.R;

public class MyMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_activity_main);

//        NavController controller = Navigation.findNavController(this, R.id.nav_fragment);

    }
}
