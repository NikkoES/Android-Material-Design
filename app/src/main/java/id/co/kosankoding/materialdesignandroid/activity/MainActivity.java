package id.co.kosankoding.materialdesignandroid.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;
import id.co.kosankoding.materialdesignandroid.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_tab_layout, R.id.btn_bottom_navigation_bar, R.id.btn_floating_text_input_snack_bar, R.id.btn_navigation_drawer})
    public void actionButton(View v){
        switch (v.getId()){
            case R.id.btn_tab_layout :
                startActivity(new Intent(this, TabLayoutActivity.class));
                break;
            case R.id.btn_navigation_drawer :
                startActivity(new Intent(this, NavigationDrawerActivity.class));
                break;
            case R.id.btn_floating_text_input_snack_bar :
                startActivity(new Intent(this, FABActivity.class));
                break;
            case R.id.btn_bottom_navigation_bar :
                startActivity(new Intent(this, BottomNavBarActivity.class));
                break;
        }
    }
}
