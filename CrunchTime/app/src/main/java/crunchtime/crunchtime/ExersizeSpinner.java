package crunchtime.crunchtime;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

/**
 * Created by moonhyok on 1/29/16.
 */
public class ExersizeSpinner extends Activity implements OnItemSelectedListener{

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        // parent.getItemAtPosition(pos)

        String item = parent.getItemAtPosition(position).toString();

        // Showing selected spinner item
        if (!Objects.equals(item, "Select")){
            Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
        }
    }
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }
}
//public class SpinnerActivity extends Activity implements OnItemSelectedListener {
//    ...
//
//    public void onItemSelected(AdapterView<?> parent, View view,
//                               int pos, long id) {
//        // An item was selected. You can retrieve the selected item using
//        // parent.getItemAtPosition(pos)
//    }
//
//    public void onNothingSelected(AdapterView<?> parent) {
//        // Another interface callback
//    }
//}
