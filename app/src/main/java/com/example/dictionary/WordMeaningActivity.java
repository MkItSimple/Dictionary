package com.example.dictionary;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.MenuItem;

public class WordMeaningActivity extends AppCompatActivity {

    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_meaning);

//        Toolbar toolbar = (Toolbar) findViewById(R.id.mytoolbar);
//        setSupportActionBar(toolbar);
//        getSupportActionBar().setTitle("English Words");
//
//        toolbar.setNavigationIcon(R.drawable.ic_arrow_back);
//
//        viewPager = (ViewPager) findViewById(R.id.tab_viewpager);
//
//        if (viewPager != null){
////            setupViewPager(viewPager);
//        }
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        if (item.getItemId() == android.R.id.home) // Press Back Icon
//        {
//            onBackPressed();
//        }
        return super.onOptionsItemSelected(item);
    }
}
