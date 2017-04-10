package com.makroid.inshortsappdesign;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class NewsFragment extends Fragment {
    View view;
    private static final String NUM = "NUMBER";
    public static NewsFragment newInstance(int number){
        NewsFragment newsFragment = new NewsFragment();
        Bundle args = new Bundle();
        args.putInt(NUM,number);
        newsFragment.setArguments(args);
        return newsFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.news_fragment,container,false);
        return view;
    }
}
