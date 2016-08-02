package com.omen.sunshine;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class PlaceholderFragment extends Fragment {

    private ArrayAdapter<String> mForecastAdapter;
    private View view;
    private ListView mForecastListView;

    public PlaceholderFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        String[] forecastArray = {
                "今天--晴天--25-30度",
                "明天--晴天--25-30度",
                "后天--晴天--25-30度",
                "周三--晴天--25-30度",
                "周四--晴天--25-30度",
                "周五--晴天--25-30度"
        };
        List<String> weekFroecast = new ArrayList<String>(Arrays.asList(forecastArray));
        mForecastAdapter = new ArrayAdapter<String>(context, R.layout.list_item_forecast,
                R.id.list_item_forecast_textview, weekFroecast);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_placeholder, container, false);
        mForecastListView = (ListView) view.findViewById(R.id.listview_forecast);
        mForecastListView.setAdapter(mForecastAdapter);
        return view;

    }

}
