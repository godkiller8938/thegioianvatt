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

public class MainFragment extends Fragment {
    ArrayList<MonAn> mMonAn;
    @Nullable
    @Override
    public View onCreateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceSate) {
        View view = inflater.inflate(R.layout.fragment_main,container,false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mMonAn = new ArrayList<>();


        Bundle bundle = getArguments();
        String text = bundle.getString("listMonAn");
        Type typeArrayList = new TypeToken<ArrayList<MonAn>>(){}.getType();
        mMonAn = new Gson().fromJson(text, typeArrayList);

//        getData();
        ListView listView = getActivity().findViewById(R.id.listmain);
        Adapter adapter = new Adapter(mMonAn);
        listView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }


}
