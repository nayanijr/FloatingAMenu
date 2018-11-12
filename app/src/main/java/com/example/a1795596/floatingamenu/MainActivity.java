package com.example.a1795596.floatingamenu;



import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;

public class MainActivity extends AppCompatActivity {
    FloatingActionMenu floatingActionMenu;
    FloatingActionButton edit, record, photo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        floatingActionMenu = (FloatingActionMenu) findViewById(R.id.floatingActionMenu);
        edit = (FloatingActionButton) findViewById(R.id.floatingActionEdit);
        photo = (FloatingActionButton)findViewById(R.id.floatingActionPhoto);
        record = (FloatingActionButton)findViewById(R.id.floatingActionRecord);

        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Edit Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Photo Clicked", Toast.LENGTH_SHORT).show();

            }
        });
        record.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Record Clicked", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
