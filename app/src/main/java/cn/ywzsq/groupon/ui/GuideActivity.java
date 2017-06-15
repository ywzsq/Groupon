package cn.ywzsq.groupon.ui;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.viewpagerindicator.CirclePageIndicator;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.ywzsq.groupon.R;
import cn.ywzsq.groupon.adapter.MyPagerAdapter;

public class GuideActivity extends AppCompatActivity {

    @BindView(R.id.viewPager_guide)
    ViewPager viewPager;
    MyPagerAdapter adapter;

    @BindView(R.id.indicator)
    CirclePageIndicator indicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        ButterKnife.bind(this);
        initViewPager();
    }

    private void initViewPager() {
        adapter = new MyPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        final float density = getResources().getDisplayMetrics().density;
        




        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (position == 3) {
                    indicator.setVisibility(View.INVISIBLE);
                }else {
                    indicator.setVisibility(View.VISIBLE);
                }

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }



}
