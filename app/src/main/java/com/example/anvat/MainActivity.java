package com.example.anvat;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.example.anvat.Model.MonAn;
import com.google.android.material.navigation.NavigationView;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.net.URL;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    Toolbar toolbar;
    NavigationView navigationView;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    ArrayList<MonAn> mMonAn = new ArrayList<>();
    Button btn_cart;


    private static final String BASE_URL = "http://192.168.1.4/sever/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getData();

        drawerLayout = findViewById(R.id.drawer);
        navigationView = findViewById(R.id.navigation_View);
        navigationView.setNavigationItemSelectedListener(this);

        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.setDrawerIndicatorEnabled(true);
        actionBarDrawerToggle.syncState();


    }

    private void EventButton() {
        btn_cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),GioHang.class);
                startActivity(intent);
            }
        });
    }

    private void getData() {
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest("http://192.168.1.4/server/getdata.php", new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                try {
                    Log.d("LOG_SIZE", "onResponse: " + response.length());
                        Gson gson = new Gson();
                    for (int i = 0; i < response.length(); i++) {
                        JSONObject object = response.getJSONObject(i);
                        String textObject = object.toString();
                        MonAn monAn = gson.fromJson(textObject, MonAn.class);

                        mMonAn.add(monAn);
//                        Log.d("LOG_DATA", "onResponse: " + textObject);
//                        Log.d("LOG_DATA", "onResponse: " + monAn.toString());
//                        Log.d("LOG_DATA", "onResponse: ");
                    }

                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("LOG_GETDATA", "onErrorResponse: " + error.toString());
            }
        }
        );
        VolleySingleton.getInstance(this).getRequestQueue().add(jsonArrayRequest);
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        Log.d("LOG_ITEM_SELECTED", "onNavigationItemSelected: " + menuItem.getItemId());
        Log.d("LOG_ITEM_SELECTED", "onNavigationItemSelected: " + mMonAn);
        if (menuItem.getItemId() == R.id.home) {
            Bundle bundle = new Bundle();

            ArrayList<MonAn> listFood = new ArrayList<>();
            for(MonAn monan : mMonAn){
                if(monan.getIdloaimonan().equals("1")){
                    listFood.add(monan);
                }
            }

            String text = new Gson().toJson(listFood);
            Log.d("LOG_TEXT_FOOD", "onNavigationItemSelected: " + text);

            bundle.putString("listMonAn", text);
            MainFragment mainFragment = new MainFragment();

            mainFragment.setArguments(bundle);

            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container_fragment, mainFragment);
            fragmentTransaction.commit();
        }

        if (menuItem.getItemId() == R.id.water) {
            Bundle bundle = new Bundle();

            ArrayList<MonAn> listWater = new ArrayList<>();
            for(MonAn monan : mMonAn){
                if(monan.getIdloaimonan().equals("2")){
                    listWater.add(monan);
                }
            }

            String text = new Gson().toJson(listWater);
            bundle.putString("listWater", text);

            Log.d("LOG_TEXT_WATER", "onNavigationItemSelected: " + text);

            WaterFragment waterFragment = new WaterFragment();
            waterFragment.setArguments(bundle);

            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container_fragment, waterFragment);
            fragmentTransaction.commit();
        }
        if (menuItem.getItemId() == R.id.phone) {

        }
//        drawerLayout.closeDrawer(Gravity.START);
        return true;
    }
}
