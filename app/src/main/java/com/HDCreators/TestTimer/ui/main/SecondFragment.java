package com.HDCreators.TestTimer.ui.main;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.app.Activity;
import androidx.fragment.app.Fragment;
import android.view.Menu;
import android.view.MenuItem;

import com.HDCreators.TestTimer.R;


class SecondActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_fragment);
        getActionBar().setDisplayHomeAsUpEnabled(true);
    }


    public SecondActivity(){
        super();
    }
    public boolean[] testSections = new boolean[]{false, false, false, false};
    public void onCheckboxClicked(View view)
    {
        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId())
        {
            case R.id.Reading:
                testSections[0] = true;
            case R.id.Writing:
                testSections[1] = true;
            case R.id.MathNoCalc:
                testSections[2] = true;
            case R.id.MathCalc:
                testSections[3] = true;
        }
    }
}
