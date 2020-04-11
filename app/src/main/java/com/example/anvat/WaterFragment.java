package com.example.anvat;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.anvat.Model.MonAn;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class WaterFragment extends Fragment {
    ArrayList<MonAn> waTer;

    @Nullable
    @Override
    public View onCreateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceSate) {
        View view = inflater.inflate(R.layout.fragment_water,container,false);
        return view;
    }
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        waTer = new ArrayList<>();


        Bundle bundle = getArguments();
        String text = bundle.getString("listWater");
        Type typeArrayList = new TypeToken<ArrayList<MonAn>>(){}.getType();
        waTer = new Gson().fromJson(text, typeArrayList);

//        getData();
        ListView listView = getActivity().findViewById(R.id.listwater);
        Adapter adapter = new Adapter(waTer);
        listView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}
