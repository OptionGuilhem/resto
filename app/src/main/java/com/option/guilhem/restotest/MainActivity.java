package com.option.guilhem.restotest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView    mListView;
    private static final String URLADDRESS = "https://dl.dropboxusercontent.com/u/6820/Lunchr/lunchr_restaurants.json";
    private RequestQueue requestQueue;
    private Gson gson;
    private List<Restaurant> result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        requestQueue = Volley.newRequestQueue(getApplicationContext());

        mListView = (ListView) findViewById(R.id.listView);

        GsonBuilder gsonBuilder = new GsonBuilder();
        gson = gsonBuilder.create();


        fetchRestaurants();

    }


    private void fetchRestaurants() {
        StringRequest request = new StringRequest(Request.Method.GET, URLADDRESS, onSuccess, onError);

        requestQueue.add(request);
    }


    private final Response.Listener<String> onSuccess = new Response.Listener<String>() {
        @Override
        public void onResponse(String response) {
            Restaurants res = gson.fromJson(response, Restaurants.class);

            result = res.restaurants;
            afficherListe();
        }
    };

    private final Response.ErrorListener onError = new Response.ErrorListener() {
        @Override
        public void onErrorResponse(VolleyError error) {
            Log.e("Restaurant : onError", error.toString());
        }
    };



    private void afficherListe() {
        MyAdapter adapter = new MyAdapter(MainActivity.this, result);
        mListView.setAdapter(adapter);
    }

}
