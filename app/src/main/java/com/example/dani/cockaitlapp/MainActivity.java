package com.example.dani.cockaitlapp;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private MainViewModel mViewModel;
    private RecyclerView mRecyclerView;
    private DrinkListAdapter mDrinkListAdapter;


    //

    private SectionsPagerAdapter mSectionsPagerAdapter;
    private ViewPager mViewPager;
    private MainViewModel mainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        mViewPager = findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = findViewById(R.id.tabs);

        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));

        mainViewModel = ViewModelProviders.of(MainActivity.this).get(MainViewModel.class);


        /////////

        /*mRecyclerView = findViewById(R.id.movieList);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        mDrinkListAdapter = new DrinkListAdapter();
        mRecyclerView.setAdapter(mDrinkListAdapter);

        mViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        mViewModel.getDrinks().observe(this, new Observer<List<Drink>>() {
            @Override
            public void onChanged(@Nullable List<Drink> drinks) {
                mDrinkListAdapter.drinkList = drinks;
                mDrinkListAdapter.notifyDataSetChanged();
            }
        });
*/

    }

    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0: return new MargaritaListFragment();
                case 1: return new RandomCocktelFragment();
                case 2: return new VodkaListFragment();
                default: return new MargaritaListFragment();
            }
        }

        @Override
        // Cuántos tab se van a ver.
        public int getCount() {
            return 3;
        }
    }
}
