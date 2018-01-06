package com.example.suchal.quiz.View;

/**
 * Created by Hashim Ali Khan on 1/4/2018.
 */
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.suchal.quiz.R;

/**
 * Created by User on 2/28/2017.
 */

public class newsfeed extends Fragment {
    private static final String TAG = "Newsfeed";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_newsfeed,container,false);
        return view;
    }

}

