package com.jinyoung.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mediaStreamer = (Button) findViewById(R.id.media_streamer);
        Button superDuo1 = (Button) findViewById(R.id.super_duo1);
        Button superDuo2 = (Button) findViewById(R.id.super_duo2);
        Button antTerminator = (Button) findViewById(R.id.ant_terminator);
        Button materialize = (Button) findViewById(R.id.materialize);
        Button capstone = (Button) findViewById(R.id.capstone);

        setPopupMessage(mediaStreamer, "spotify streamer");
        setPopupMessage(superDuo1, "scores app");
        setPopupMessage(superDuo2, "library app");
        setPopupMessage(antTerminator, "build it bigger");
        setPopupMessage(materialize, "xyz reader");
        setPopupMessage(capstone, "my capstone app");
    }

    private void setPopupMessage(Button btn, final String appName) {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button will launch " + appName + "!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
