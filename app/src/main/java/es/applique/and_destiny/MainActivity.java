package es.applique.and_destiny;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import java.io.Serializable;

import es.applique.and_destiny.model.Factory;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_aries = (Button) findViewById(R.id.btn_aries);
        Button btn_taurus = (Button) findViewById(R.id.btn_taurus);
        Button btn_gemini = (Button) findViewById(R.id.btn_gemini);
        Button btn_cancer = (Button) findViewById(R.id.btn_cancer);
        Button btn_leo = (Button) findViewById(R.id.btn_leo);
        Button btn_virgo = (Button) findViewById(R.id.btn_virgo);
        Button btn_libra = (Button) findViewById(R.id.btn_libra);
        Button btn_scorpio = (Button) findViewById(R.id.btn_scorpio);
        Button btn_sagittarius = (Button) findViewById(R.id.btn_sagittarius);
        Button btn_capricorn = (Button) findViewById(R.id.btn_capricorn);
        Button btn_aquarius = (Button) findViewById(R.id.btn_aquarius);
        Button btn_pisces = (Button) findViewById(R.id.btn_pisces);

        btn_aries.setTag("aries");
        btn_taurus.setTag("taurus");
        btn_gemini.setTag("gemini");
        btn_cancer.setTag("cancer");
        btn_leo.setTag("leo");
        btn_virgo.setTag("virgo");
        btn_libra.setTag("libra");
        btn_scorpio.setTag("scorpio");
        btn_sagittarius.setTag("sagittarius");
        btn_capricorn.setTag("capricorn");
        btn_aquarius.setTag("aquarius");
        btn_pisces.setTag("pisces");
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

    public void displaySignProfile(View view) {
        String profile = (String) view.getTag();
        Intent intent = new Intent(this, SignProfile.class);
        intent.putExtra("sign", (Serializable) Factory.createSign(profile));
        startActivity(intent);
    }
}
