package com.bingerdranch.android.autoservices;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public final static String LOG_TAG = "MyLogs";

    private Spinner spinner_marka, spinner_model, spinner_okrug, spinner_rayon, spinner_metro, spinner_vid_rabot;
    private Button button_search;

    ArrayList<String> marka;
    ArrayList<String> model;
    ArrayList<String> okrug;
    ArrayList<String> rayon;
    ArrayList<String> metro;
    ArrayList<String> vid_rabot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner_marka = (Spinner) findViewById(R.id.spinner_marka);
        spinner_model = (Spinner) findViewById(R.id.spinner_model);
        spinner_okrug = (Spinner) findViewById(R.id.spinner_okrug);
        spinner_rayon = (Spinner) findViewById(R.id.spinner_rayon);
        spinner_metro = (Spinner) findViewById(R.id.spinner_metro);
        spinner_vid_rabot = (Spinner) findViewById(R.id.spinner_vid_rabot);

        button_search = (Button) findViewById(R.id.button_poisk);
        button_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchMethod();
            }
        });

        test();
    }

    private void searchMethod() {
        String marka = "";
        String model = "";
        String okrug = "";
        String rayon = "";
        String metro = "";
        String vid_rabot = "";

        marka = spinner_marka.getSelectedItem().toString();
        model = spinner_model.getSelectedItem().toString();
        okrug = spinner_okrug.getSelectedItem().toString();
        rayon = spinner_rayon.getSelectedItem().toString();
        metro = spinner_metro.getSelectedItem().toString();
        vid_rabot = spinner_vid_rabot.getSelectedItem().toString();

        Autoservice autoservice = new Autoservice(marka,model,okrug,rayon,metro,vid_rabot);

        Intent intent = new Intent(MainActivity.this,SearchResult.class);
        startActivity(intent);

        Log.d(LOG_TAG,autoservice.toString());
    }

    private void test() {
        marka = new ArrayList<>();
        model = new ArrayList<>();
        okrug = new ArrayList<>();
        rayon = new ArrayList<>();
        metro = new ArrayList<>();
        vid_rabot = new ArrayList<>();
        for (int i = 0; i<10;i++){
            String markaString = "marka_" + i;
            String modelString = "model_" + i;
            String okrugString = "okrug_" + i;
            String rayonString = "rayon_" + i;
            String metroString = "metro_" + i;
            String vid_rabotString = "vid_rabot_" + i;
            marka.add(markaString);
            model.add(modelString);
            okrug.add(okrugString);
            rayon.add(rayonString);
            metro.add(metroString);
            vid_rabot.add(vid_rabotString);
        }
        ArrayAdapter<String> adapter_marka = new ArrayAdapter<>(MainActivity.this,android.R.layout.simple_list_item_1,marka);
        spinner_marka.setAdapter(adapter_marka);

        ArrayAdapter<String> adapter_model = new ArrayAdapter<>(MainActivity.this,android.R.layout.simple_list_item_1,model);
        spinner_model.setAdapter(adapter_model);

        ArrayAdapter<String> adapter_okrug = new ArrayAdapter<>(MainActivity.this,android.R.layout.simple_list_item_1,okrug);
        spinner_okrug.setAdapter(adapter_okrug);

        ArrayAdapter<String> adapter_rayon = new ArrayAdapter<>(MainActivity.this,android.R.layout.simple_list_item_1,rayon);
        spinner_rayon.setAdapter(adapter_rayon);

        ArrayAdapter<String> adapter_metro = new ArrayAdapter<>(MainActivity.this,android.R.layout.simple_list_item_1,metro);
        spinner_metro.setAdapter(adapter_metro);

        ArrayAdapter<String> adapter_vid_rabot = new ArrayAdapter<>(MainActivity.this,android.R.layout.simple_list_item_1,vid_rabot);
        spinner_vid_rabot.setAdapter(adapter_vid_rabot);
    }
}
