package com.rgz.adoptme.ripple;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 */
public class RipplesFragment extends Fragment {


    public static final String ARG_LAYOUT = "com.umpay.ripple.ARG_LAYOUT";

    public RipplesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        int layoutId = getArguments().getInt(ARG_LAYOUT, 0);
        return inflater.inflate(layoutId, container, false);
    }


}
