package crunchtime.crunchtime;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class GoalCalories extends AppCompatActivity {

    private Spinner mSpinner;
    private Button mCalculate;
    private TextView mResult;
    private TextView mInput;
    private TextView mEquiv;


    public void addSpinnerSelection() {
        mSpinner = (Spinner) findViewById(R.id.exercise_spinner_g);
        mSpinner.setOnItemSelectedListener(new ExersizeSpinner());
    }

    private void calculateCalories() {


        mSpinner = (Spinner) findViewById(R.id.exercise_spinner_g);
        String x = String.valueOf(mSpinner.getSelectedItem());

        mInput = (TextView) findViewById(R.id.input_value_g);
        mResult = (TextView) findViewById(R.id.result_text_g);




        int i = Integer.parseInt(mInput.getText().toString());


        if (Objects.equals(x, "Pushup")){
            int t =(int) Math.ceil((i/.285714286));
//            String equivText = "Which is equivalent to:\n" + (t/0.5)+" Situps\n" + (t/10) + " minutes of Jumping Jacks\n" +
//                    (t/8.333333333) + " minutes of Jogging";
            String resultText = "You Need to do:\n " + t + " " +x+"(s)";
            mResult.setText(resultText);
//            mEquiv.setText(equivText);

        } else if (Objects.equals(x,"Situp")){
            int t =(int) Math.ceil((i/0.5));
//            String equivText = "Which is equivalent to:\n" + (t/.285714286)+" Pushups\n" + (t/10) + " minutes of Jumping Jacks\n" +
//                    (t/8.333333333) + " minutes of Jogging";
            String resultText = "You Need to do:\n " + t + " " +x+"(s)";
            mResult.setText(resultText);
//            mEquiv.setText(equivText);


        } else if (Objects.equals(x,"Squats")){
            int t =(int) Math.ceil((i/0.4444444444));
            String resultText = "You Need to do:\n " + t + " " +x;
            mResult.setText(resultText);

        } else if (Objects.equals(x,"Leg-lift")){
            int t =(int) Math.ceil((i/4));
            String resultText = "You Need to do:\n " + t + " " +x+"(s)";
            mResult.setText(resultText);

        } else if (Objects.equals(x,"Plank")){
            int t =(int) Math.ceil((i/4));
            String resultText = "You Need to do:\n " + t + " minute(s) of " +x;
            mResult.setText(resultText);

        } else if (Objects.equals(x,"Jumping Jacks")){
            int t =(int) Math.ceil((i/10));
//            String equivText = "Which is equivalent to:\n" + (t/.285714286)+" Pushups\n" + (t/0.5)+" Situps\n" +
//                    (t/8.333333333) + " minutes of Jogging";
            String resultText = "You Need to do:\n " + t + " minute(s) of " +x;
            mResult.setText(resultText);
//            mEquiv.setText(equivText);

        } else if (Objects.equals(x,"Pullup")){
            String resultText = "You Need to do:\n " + i + " " +x+"(s)";
            mResult.setText(resultText);

        } else if (Objects.equals(x,"Cycling")){
            int t =(int) Math.ceil((i/8.333333333));
            String resultText = "You Need to do:\n " + t + " minute(s) of " +x;
            mResult.setText(resultText);

        } else if (Objects.equals(x,"Walking")){
            int t =(int) Math.ceil((i/5));
            String resultText = "You Need to do:\n " + t + " minute(s) of " +x;
            mResult.setText(resultText);

        } else if (Objects.equals(x,"Jogging")){
            int t =(int) Math.ceil((i/8.333333333));
//            String equivText = "Which is equivalent to:\n" + (t/.285714286)+" Pushups\n" + (t/0.5)+" Situps\n" +
//                    (t/10) + " minutes of Jumping Jacks\n";
            String resultText = "You Need to do:\n " + t + " minute(s) of " +x;
            mResult.setText(resultText);
//            mEquiv.setText(equivText);

        } else if (Objects.equals(x,"Swimming")){
            int t =(int) Math.ceil((i/7.692307692));
            String resultText = "You Need to do:\n " + t + " minute(s) of " +x;
            mResult.setText(resultText);

        } else if (Objects.equals(x,"Stair-Climbing")){
            int t =(int) Math.ceil((i/6.666666667));
            String resultText = "You Need to do:\n " + t + " minute(s) of " +x;
            mResult.setText(resultText);
        }




    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goal_calories);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        addSpinnerSelection();

        mCalculate = (Button) findViewById(R.id.calc_button_g);
        mCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Does nothing yet, but soon!
                mInput = (TextView) findViewById(R.id.input_value_g);
                String x = mInput.getText().toString();

                mSpinner = (Spinner) findViewById(R.id.exercise_spinner_g);
                String exer = String.valueOf(mSpinner.getSelectedItem());

                if (x.matches("") || Objects.equals(exer, "Select")){
                    Toast.makeText(GoalCalories.this, "Please write in and choose a value", Toast.LENGTH_LONG).show();
                    return;
                }

                calculateCalories();

            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
