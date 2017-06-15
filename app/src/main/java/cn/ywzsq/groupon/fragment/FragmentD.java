package cn.ywzsq.groupon.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.ywzsq.groupon.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentD extends BaseFragment {


    @BindView(R.id.button_fragment_Skip)
    Button btnSkip;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment_d, container, false);
        ButterKnife.bind(this,view);
        skip(btnSkip);
        return view;
    }

}
