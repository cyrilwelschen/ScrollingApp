package com.example.cyrilwelschen.scrollingapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: started.");
        initImageBitmaps();
    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps");

        mImageUrls.add("https://i.pinimg.com/originals/9d/30/0d/9d300d0df0df43a5b8725751e33642c2.jpg");
        mNames.add("Zermatt");

        for(int l=0; l<=30; l++) {
            mImageUrls.add("https://i.pinimg.com/originals/9d/30/0d/9d300d0df0df43a5b8725751e33642c2.jpg");
            mNames.add("Zermatt "+l);
        }

        mImageUrls.add("https://i.pinimg.com/originals/9d/30/0d/9d300d0df0df43a5b8725751e33642c2.jpg");
        mNames.add("Randa");

        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: initialising Recylcer view");
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, mImageUrls);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
