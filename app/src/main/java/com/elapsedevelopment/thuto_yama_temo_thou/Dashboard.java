package com.elapsedevelopment.thuto_yama_temo_thou;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.MenuItem;
import android.widget.TextView;

import com.elapsedevelopment.thuto_yama_temo_thou.Fragments.HomeFragment;
import com.elapsedevelopment.thuto_yama_temo_thou.Fragments.InfoFragment;
import com.elapsedevelopment.thuto_yama_temo_thou.Fragments.LearnFragment;
import com.elapsedevelopment.thuto_yama_temo_thou.Fragments.TestFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Dashboard extends AppCompatActivity {

    TextView rText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        rText = findViewById(R.id.ready_text);

        String text = "Ready To Learn";

        SpannableString ss = new SpannableString(text);

        ForegroundColorSpan fscBlue = new ForegroundColorSpan(getResources().getColor(R.color.primary_color));

        ss.setSpan(fscBlue, 9, 14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        rText.setText(ss);

        BottomNavigationView bottomNav = findViewById(R.id.bottomNavigationViewF);
        bottomNav.setBackground(null);
        bottomNav.setOnNavigationItemSelectedListener(navListener);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                new HomeFragment()).commit();


    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            Fragment selectedFragment = null;

            switch (menuItem.getItemId()) {
                case R.id.nhome:
                    selectedFragment = new HomeFragment();
                    break;
                case R.id.nTest:
                    selectedFragment = new TestFragment();
                    break;
                case R.id.nLearn:
                    selectedFragment = new LearnFragment();
                    break;
                case R.id.nInfo:
                    selectedFragment = new InfoFragment();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();
            return true;

        }
    };
}