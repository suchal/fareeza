package com.example.suchal.quiz.View;

import android.support.design.widget.TabLayout;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import android.view.View;
import android.widget.Spinner;

import com.example.suchal.quiz.R;

public class MainActivity extends AppCompatActivity{

    private static final String TAG = "MainActivity";
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    private SectionsPageAdapter mSectionsPageAdapter;
    private SectionsPageAdapter adapter= new SectionsPageAdapter(getSupportFragmentManager());
    private ViewPager mViewPager;
    Fragment Tab1Fragment;

    private Spinner type;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDrawerLayout=(DrawerLayout)findViewById(R.id.main_content);
        mToggle=new ActionBarDrawerToggle(this,mDrawerLayout,R.string.open,R.string.close);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Log.d(TAG, "onCreate: Starting.");
        mSectionsPageAdapter = new SectionsPageAdapter(getSupportFragmentManager());
        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        setupViewPager(mViewPager);


        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(mToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void setupViewPager(ViewPager viewPager) {

        adapter.addFragment(new newsfeed(), "NewsFeed");
        adapter.addFragment(new Tab1Fragment(), "Make Donation");
        adapter.addFragment(new Tab2Fragment(), "Payment History");
        adapter.addFragment(new Tab3Fragment(), "View Progress");
        viewPager.setAdapter(adapter);
    }


}
