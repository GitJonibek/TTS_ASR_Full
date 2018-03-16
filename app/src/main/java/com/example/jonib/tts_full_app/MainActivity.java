package com.example.jonib.tts_full_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.jonib.tts_full_app.adapter.CustomAdapter;
import com.example.jonib.tts_full_app.model.DataModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<DataModel> dataModels;
    ListView listView;
    private static CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.main_list);

        String[] values = {"ASRWithIntent", "ASRWithLib", "Stacy", "TTSWithLib", "GrammarTest",
                "VoiceLunch", "TTSWithIntent", "Derek", "VoiceSearch", "Jack", "Parrot", "SillyParrot",
                "SendMessage", "VoiceSearchConfirmation", "MusicBrain"};

        dataModels = new ArrayList<>();
        for( int i=0; i<values.length; i++)
            dataModels.add(new DataModel(R.drawable.ic_launcher_foreground, values[i].toString()));
        adapter = new CustomAdapter(getApplicationContext(), dataModels);


        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        startActivity(new Intent(MainActivity.this, ASRWithIntent.class));
                        break;
                    case 1:
                        startActivity(new Intent(MainActivity.this, ASRWithLib.class));
                        break;
                    case 2:
                        startActivity(new Intent(MainActivity.this, ASRWithIntent.class));
                        break;
                    case 3:
                        startActivity(new Intent(MainActivity.this, ASRWithIntent.class));
                        break;
                    case 4:
                        startActivity(new Intent(MainActivity.this, ASRWithIntent.class));
                        break;
                    case 5:
                        startActivity(new Intent(MainActivity.this, ASRWithIntent.class));
                        break;
                    case 6:
                        startActivity(new Intent(MainActivity.this, ASRWithIntent.class));
                        break;
                    case 7:
                        startActivity(new Intent(MainActivity.this, ASRWithIntent.class));
                        break;
                    case 8:
                        startActivity(new Intent(MainActivity.this, ASRWithIntent.class));
                        break;
                    case 9:
                        startActivity(new Intent(MainActivity.this, ASRWithIntent.class));
                        break;
                    case 10:
                        startActivity(new Intent(MainActivity.this, ASRWithIntent.class));
                        break;
                    case 11:
                        startActivity(new Intent(MainActivity.this, ASRWithIntent.class));
                        break;
                    case 12:
                        startActivity(new Intent(MainActivity.this, ASRWithIntent.class));
                        break;
                    case 13:
                        startActivity(new Intent(MainActivity.this, ASRWithIntent.class));
                        break;
                    case 14:
                        startActivity(new Intent(MainActivity.this, ASRWithIntent.class));
                        break;
                }
            }
        });
    }
}
