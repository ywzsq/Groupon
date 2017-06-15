package cn.ywzsq.groupon.fragment;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.view.View;

import cn.ywzsq.groupon.ui.MainActivity;

/**
 * Created by Administrator on 2017/6/15 0015.
 */

public class BaseFragment extends Fragment {

    public void skip(View view) {

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivity.class);
                startActivity(intent);
                getActivity().finish();
            }
        });



    }

}
