package es.applique.and_destiny;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RatingBar;
import android.widget.TextView;
import android.content.Intent;
import es.applique.and_destiny.model.Factory;
import es.applique.and_destiny.model.Sign;


public class SignProfile extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_profile);

        Intent intent = getIntent();
        Sign sign = (Sign) intent.getSerializableExtra("sign");

        // Name
        TextView name = (TextView) findViewById(R.id.name);
        name.setText(sign.getName());

        // Color
        TextView color = (TextView) findViewById(R.id.color);
        color.setText(sign.getColor());

        // Planet
        TextView planet = (TextView) findViewById(R.id.planet);
        planet.setText(sign.getPlanet());

        // Love
        RatingBar love = (RatingBar) findViewById(R.id.love);
        love.setMax(5);
        love.setProgress(sign.getLove());

        // Finance
        RatingBar finance = (RatingBar) findViewById(R.id.finance);
        finance.setMax(5);
        finance.setProgress(sign.getFinance());

        // Carrer
        RatingBar carrer = (RatingBar) findViewById(R.id.carrer);
        carrer.setMax(5);
        carrer.setProgress(sign.getCarrer());

        // Mood
        RatingBar mood = (RatingBar) findViewById(R.id.mood);
        mood.setMax(5);
        mood.setProgress(sign.getMood());

        // Numbers
        TextView numbers = (TextView) findViewById(R.id.numbers);
        String list = TextUtils.join(", ", sign.getLuckyNumbers());
        numbers.setText(list);

        // Compatibles
        TextView compatibles = (TextView) findViewById(R.id.compatibles);
        list = TextUtils.join(", ", sign.getCompatibleSigns());
        compatibles.setText(list);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sign_profile, menu);
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
