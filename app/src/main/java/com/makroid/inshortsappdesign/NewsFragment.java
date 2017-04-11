package com.makroid.inshortsappdesign;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import jp.wasabeef.glide.transformations.BlurTransformation;

public class NewsFragment extends Fragment {
    private TextView contentText,titleText;
    private ImageView topImage,bottomImage;
    private View view;
    private static final int blurFactor = 200;
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
        titleText = (TextView) view.findViewById(R.id.title);
        contentText = (TextView) view.findViewById(R.id.content);
        topImage = (ImageView) view.findViewById(R.id.top_image);
        bottomImage = (ImageView) view.findViewById(R.id.bottom_image);
        setText("This is just a title of a main app, says President","Lorem ipsum dolor sit amet, consectetur elit adipisicing , sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim minim ad  veniam quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat.");
        switch (getArguments().getInt(NUM) % 5) {
            case 0:
                Glide.with(getActivity()).load(R.drawable.image1).into(topImage);
                Glide.with(getActivity()).load(R.drawable.image1).bitmapTransform(new BlurTransformation(getContext(),blurFactor)).into(bottomImage);
                break;
            case 1:
                Glide.with(getActivity()).load(R.drawable.image2).into(topImage);
                Glide.with(getActivity()).load(R.drawable.image2).bitmapTransform(new BlurTransformation(getContext(),blurFactor)).into(bottomImage);
                break;
            case 2:
                Glide.with(getActivity()).load(R.drawable.image3).into(topImage);
                Glide.with(getActivity()).load(R.drawable.image3).bitmapTransform(new BlurTransformation(getContext(),blurFactor)).into(bottomImage);
                break;
            case 3:
                Glide.with(getActivity()).load(R.drawable.image4).into(topImage);
                Glide.with(getActivity()).load(R.drawable.image4).bitmapTransform(new BlurTransformation(getContext(),blurFactor)).into(bottomImage);
                break;

            default:
                Glide.with(getActivity()).load(R.drawable.image5).into(topImage);
                Glide.with(getActivity()).load(R.drawable.image5).bitmapTransform(new BlurTransformation(getContext(),blurFactor)).into(bottomImage);

        }
        return view;
    }

    private void setText(String title, String content) {
        titleText.setText(title);
        contentText.setText(content);
    }
}
