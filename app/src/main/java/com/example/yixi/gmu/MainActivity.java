package com.example.yixi.gmu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.net.Uri;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button gradbtn = (Button) findViewById(R.id.grduatebutton);
        gradbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent weblink = new Intent(Intent.ACTION_VIEW,Uri.parse("https://docs.google.com/forms/d/1BdDKAEu6fSyZJbE7-vs1quAIHmYqPbjc50D4ZhWEWT0/viewform?edit_requested=true"));
                startActivity(weblink);
            }
        });

        Button undergradbtn = (Button) findViewById(R.id.undergradbutton);
        undergradbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent weblink = new Intent(Intent.ACTION_VIEW,Uri.parse("https://docs.google.com/forms/d/1BFcuNgVWhLEINVbc2GHyqDUbecCsYqru5mM2TcpNW5c/viewform?edit_requested=true"));
                startActivity(weblink);
            }
        });
    }
}
