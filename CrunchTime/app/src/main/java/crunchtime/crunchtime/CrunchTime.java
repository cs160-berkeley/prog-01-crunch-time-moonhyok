package crunchtime.crunchtime;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.Objects;


public class CrunchTime extends AppCompatActivity {


    private Spinner mSpinner;
    private Spinner mSpinner2;
    private Button mCalculate;
    private TextView mResult;
    private TextView mInput;
    private TextView mEquiv;
    private Button mSwap;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;


    public void addSpinnerSelection() {
        mSpinner = (Spinner) findViewById(R.id.exercise_spinner);
        mSpinner.setOnItemSelectedListener(new ExersizeSpinner());
    }

    private void calculateCalories() {


        mSpinner = (Spinner) findViewById(R.id.exercise_spinner);
        String x = String.valueOf(mSpinner.getSelectedItem());

        mSpinner2 = (Spinner) findViewById(R.id.equiv_spinner);
        String equiv = String.valueOf(mSpinner2.getSelectedItem());

        mInput = (TextView) findViewById(R.id.input_value);
        mResult = (TextView) findViewById(R.id.result_text);
        mEquiv = (TextView) findViewById(R.id.equiv_text);
//        String equiv = String.valueOf(mSpinner.getSelectedItem());





        int i = Integer.parseInt(mInput.getText().toString());

        double t = 0;

        if (Objects.equals(x, "Pushup")){
            t = (i*.285714286);
//            String equivText = "Which is equivalent to:\n" + (t/0.5)+" Situps\n" + (t/10) + " minutes of Jumping Jacks\n" +
//                    (t/8.333333333) + " minutes of Jogging";
            String resultText = "You Burned:\n " + t + " kcal";
            mResult.setText(resultText);
//            mEquiv.setText(equivText);

        } else if (Objects.equals(x,"Situp")){
            t = (i*0.5);
//            String equivText = "Which is equivalent to:\n" + (t/.285714286)+" Pushups\n" + (t/10) + " minutes of Jumping Jacks\n" +
//                    (t/8.333333333) + " minutes of Jogging";
            String resultText = "You Burned:\n " + t + " kcal";
            mResult.setText(resultText);
//            mEquiv.setText(equivText);


        } else if (Objects.equals(x,"Squats")){
             t = (i*0.4444444444);
            String resultText = "You Burned:\n " + t + " kcal";
            mResult.setText(resultText);

        } else if (Objects.equals(x,"Leg-lift")){
             t = (i*4);
            String resultText = "You Burned:\n " + t + " kcal";
            mResult.setText(resultText);

        } else if (Objects.equals(x,"Plank")){
             t = (i*4);
            String resultText = "You Burned:\n " + t + " kcal";
            mResult.setText(resultText);

        } else if (Objects.equals(x,"Jumping Jacks")){
             t = (i*10);
//            String equivText = "Which is equivalent to:\n" + (t/.285714286)+" Pushups\n" + (t/0.5)+" Situps\n" +
//                    (t/8.333333333) + " minutes of Jogging";
            String resultText = "You Burned:\n " + t + " kcal";
            mResult.setText(resultText);
//            mEquiv.setText(equivText);

        } else if (Objects.equals(x,"Pullup")){
            String resultText = "You Burned:\n " + i + " kcal";
            mResult.setText(resultText);

        } else if (Objects.equals(x,"Cycling")){
             t = (i*8.333333333);
            String resultText = "You Burned:\n " + t + " kcal";
            mResult.setText(resultText);

        } else if (Objects.equals(x,"Walking")){
             t = (i*5);
            String resultText = "You Burned:\n " + t + " kcal";
            mResult.setText(resultText);

        } else if (Objects.equals(x,"Jogging")){
             t = (i*8.333333333);
//            String equivText = "Which is equivalent to:\n" + (t/.285714286)+" Pushups\n" + (t/0.5)+" Situps\n" +
//                    (t/10) + " minutes of Jumping Jacks\n";
            String resultText = "You Burned:\n " + t + " kcal";
            mResult.setText(resultText);
//            mEquiv.setText(equivText);

        } else if (Objects.equals(x,"Swimming")){
             t = (i*7.692307692);
            String resultText = "You Burned:\n " + t + " kcal";
            mResult.setText(resultText);

        } else{
             t = (i*6.666666667);
            String resultText = "You Burned:\n " + t + " kcal";
            mResult.setText(resultText);
        }

        /////////////////////////////////

        if (Objects.equals(equiv, "Pushup")){
            t = (t/.285714286);

            String equivText = "Which is equivalent to:\n" + t + " " +equiv+"(s)";
            mEquiv.setText(equivText);

        } else if (Objects.equals(equiv,"Situp")){
            t = (t/0.5);

            String equivText = "Which is equivalent to:\n" + t + " " +equiv+"(s)";
            mEquiv.setText(equivText);


        } else if (Objects.equals(equiv,"Squats")){
             t = (t/0.4444444444);
            String equivText = "Which is equivalent to:\n" + t + " " +equiv;
            mEquiv.setText(equivText);

        } else if (Objects.equals(equiv,"Leg-lift")){
             t = (t/4);
            String equivText = "Which is equivalent to:\n" + t + " " +equiv+"(s)";
            mEquiv.setText(equivText);

        } else if (Objects.equals(equiv,"Plank")){
             t = (t/4);
            String equivText = "Which is equivalent to:\n" + t + " minute(s) of " +equiv;
            mEquiv.setText(equivText);

        } else if (Objects.equals(equiv,"Jumping Jacks")){
             t = (t/10);
            String equivText = "Which is equivalent to:\n" + t + " minute(s) of " +equiv;
            mEquiv.setText(equivText);

        } else if (Objects.equals(equiv,"Pullup")){
            String equivText = "Which is equivalent to:\n" + t + " " +equiv+"(s)";
            mEquiv.setText(equivText);

        } else if (Objects.equals(equiv,"Cycling")){
             t = (t/8.333333333);
            String equivText = "Which is equivalent to:\n" + t + " minute(s) of " +equiv;
            mEquiv.setText(equivText);

        } else if (Objects.equals(equiv,"Walking")){
             t = (t/5);
            String equivText = "Which is equivalent to:\n" + t + " minute(s) of " +equiv;
            mEquiv.setText(equivText);

        } else if (Objects.equals(equiv,"Jogging")){
             t = (t/8.333333333);
            String equivText = "Which is equivalent to:\n" + t + " minute(s) of " +equiv;
            mEquiv.setText(equivText);

        } else if (Objects.equals(equiv,"Swimming")){
             t = (t/7.692307692);
            String equivText = "Which is equivalent to:\n" + t + " minute(s) of " +equiv;
            mEquiv.setText(equivText);

        } else if (Objects.equals(equiv,"Stair-Climbing")){
             t = (t/6.666666667);
            String equivText = "Which is equivalent to:\n" + t + " minute(s) of " +equiv;
            mEquiv.setText(equivText);
        }




    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crunch_time);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        addSpinnerSelection();

        mSwap = (Button) findViewById(R.id.swap_calc);
        mSwap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Does nothing yet, but soon!
                Intent myIntent = new Intent(CrunchTime.this, GoalCalories.class);
                CrunchTime.this.startActivity(myIntent);
            }
        });

        mCalculate = (Button) findViewById(R.id.calc_button);
        mCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Does nothing yet, but soon!
                mInput = (TextView) findViewById(R.id.input_value);
                String x = mInput.getText().toString();

                mSpinner = (Spinner) findViewById(R.id.exercise_spinner);
                String exer = String.valueOf(mSpinner.getSelectedItem());

                if (x.matches("") || Objects.equals(exer, "Select")){
                    Toast.makeText(CrunchTime.this, "Please write in and choose a value", Toast.LENGTH_LONG).show();
                    return;
                }

                calculateCalories();

            }
        });
//        Spinner spinner = (Spinner) findViewById(R.id.exercise_spinner);
//        // Create an ArrayAdapter using the string array and a default spinner layout
//        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
//                R.array.exercise_list, android.R.layout.simple_spinner_item);
//        // Specify the layout to use when the list of choices appears
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        // Apply the adapter to the spinner
//        spinner.setAdapter(adapter);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_crunch_time, menu);
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

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "CrunchTime Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://crunchtime.crunchtime/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "CrunchTime Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://crunchtime.crunchtime/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
