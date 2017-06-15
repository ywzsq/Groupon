package cn.ywzsq.groupon.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

import cn.ywzsq.groupon.fragment.FragmentA;
import cn.ywzsq.groupon.fragment.FragmentB;
import cn.ywzsq.groupon.fragment.FragmentC;
import cn.ywzsq.groupon.fragment.FragmentD;

/**
 * Created by Administrator on 2017/6/15 0015.
 */

public class MyPagerAdapter extends FragmentPagerAdapter {

    List<Fragment> fragmentList;

    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
        fragmentList = new ArrayList<Fragment>();
        fragmentList.add(new FragmentA());
        fragmentList.add(new FragmentB());
        fragmentList.add(new FragmentC());
        fragmentList.add(new FragmentD());


    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }
}
