package com.example.android.quizz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int score = 0;

    public void submitTest(View view) {
        EditText editText1 = (EditText) findViewById(R.id.edit_text1);
        String text1 = editText1.getText().toString();
        if (text1.equals("Mumbai") || text1.equals("mumbai")) {
            ++score;
        }
        RadioButton firstradio = (RadioButton) findViewById(R.id.a_radio1);
        if (firstradio.isChecked()) {
            ++score;
        }
        CheckBox aCheckbox1 = (CheckBox) findViewById(R.id.a_checkbox1);
        CheckBox bCheckbox1 = (CheckBox) findViewById(R.id.b_checkbox1);
        CheckBox cCheckbox1 = (CheckBox) findViewById(R.id.c_checkbox1);
        CheckBox dCheckbox1 = (CheckBox) findViewById(R.id.d_checkbox1);
        if (aCheckbox1.isChecked() && bCheckbox1.isChecked() && cCheckbox1.isChecked() && (!dCheckbox1.isChecked())) {
            ++score;
        }
        CheckBox aCheckbox2 = (CheckBox) findViewById(R.id.a_checkbox2);
        CheckBox bCheckbox2 = (CheckBox) findViewById(R.id.b_checkbox2);
        CheckBox cCheckbox2 = (CheckBox) findViewById(R.id.c_checkbox2);
        CheckBox dCheckbox2 = (CheckBox) findViewById(R.id.d_checkbox2);
        if (aCheckbox2.isChecked() && bCheckbox2.isChecked() && (!cCheckbox2.isChecked()) && (!dCheckbox2.isChecked())) {
            ++score;
        }
        RadioButton secondradio = (RadioButton) findViewById(R.id.d_radio2);
        if (secondradio.isChecked()) {
            ++score;
        }
        RadioButton thirdradio = (RadioButton) findViewById(R.id.c_radio3);
        if (thirdradio.isChecked()) {
            ++score;
        }
        RadioButton fourthradio = (RadioButton) findViewById(R.id.a_radio4);
        if (fourthradio.isChecked()) {
            ++score;
        }
        EditText editText2 = (EditText) findViewById(R.id.edit_text2);
        String text2 = editText2.getText().toString();

        if (text2.equals("Kerala") || text2.equals("kerala")) {
            score++;
        }
        if (score > 4) {
            Toast.makeText(this, "Congratulations! \nScore = " + score, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Work Hard! And Better Luck Next Time \nScore = " + score, Toast.LENGTH_SHORT).show();
        }
        score = 0;
    }

}
