package com.example.usuario.tablayout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by usuario on 13/12/17.
 */

public class CustomFragment extends android.support.v4.app.Fragment {
    private TextView txvMessage;
    public static final String KEY_MESSAGE ="message";

    public static CustomFragment newInstance(Bundle arguments){
        CustomFragment customFragment = new CustomFragment();
        if(arguments != null){
            customFragment.setArguments(arguments);
        }
        return customFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_layout, container, false);
        txvMessage = rootView.findViewById(R.id.txvMessage);
        String message = getArguments().getString(KEY_MESSAGE);
        txvMessage.setText(message);
        return rootView;
    }
}
