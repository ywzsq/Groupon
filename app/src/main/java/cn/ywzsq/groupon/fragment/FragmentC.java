package cn.ywzsq.groupon.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.ywzsq.groupon.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentC extends BaseFragment {


    @BindView(R.id.textView_Skip)
    TextView tvSkip;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
      View view = inflater.inflate(R.layout.fragment_fragment_c,container,false);
        ButterKnife.bind(this,view);
        skip(tvSkip);
        return view;
    }

}
