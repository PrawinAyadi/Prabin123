package com.example.prabin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class login extends AppCompatActivity {
    private ViewPager viewPager;
    private TabLayout tabId;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabId=findViewById(R.id.tabId);
        viewPager=findViewById(R.id.viewPager);

        ViewPageAdapter adapter = new ViewPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new LoginFragment(), "Login");
        adapter.addFragment(new RegistrationFragment(), "Registration");

        viewPager.setAdapter(adapter);
        tabId.setupWithViewPager(viewPager);
    }

}