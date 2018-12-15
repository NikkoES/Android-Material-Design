package id.co.kosankoding.materialdesignandroid.activity;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.TextView;

import id.co.kosankoding.materialdesignandroid.R;
import id.co.kosankoding.materialdesignandroid.adapter.tablayout.ViewPagerAdapter;
import id.co.kosankoding.materialdesignandroid.fragment.DuaFragment;
import id.co.kosankoding.materialdesignandroid.fragment.SatuFragment;
import id.co.kosankoding.materialdesignandroid.fragment.TigaFragment;

public class TabLayoutActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout);

        tabLayout = findViewById(R.id.tabs);
        viewPager = findViewById(R.id.viewpager);

        setupViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupTab() {
        TextView tabSatu = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabSatu.setText(getString(R.string.tab_1));
        tabLayout.getTabAt(0).setCustomView(tabSatu);

        TextView tabDua = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabDua.setText(getString(R.string.tab_2));
        tabLayout.getTabAt(1).setCustomView(tabDua);

        TextView tabTiga = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabTiga.setText(getString(R.string.tab_3));
        tabLayout.getTabAt(2).setCustomView(tabTiga);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new SatuFragment(), getString(R.string.tab_1));
        adapter.addFragment(new DuaFragment(), getString(R.string.tab_2));
        adapter.addFragment(new TigaFragment(), getString(R.string.tab_3));
        viewPager.setAdapter(adapter);
    }
}
