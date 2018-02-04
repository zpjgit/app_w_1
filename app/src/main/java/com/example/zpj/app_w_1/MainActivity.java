package com.example.zpj.app_w_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private boolean ledon = false;
    Button button_1 = null;
    CheckBox checkBox1 = null;
    CheckBox checkBox2 = null;
    CheckBox checkBox3 = null;
    CheckBox checkBox4 = null;

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkBox1:
                if (checked) {
                    // Put some meat on the sandwich
                    Toast.makeText(com.example.zpj.app_w_1.MainActivity.this, "led1_on",
                            Toast.LENGTH_SHORT).show();
                }
                else {
                    // Remove the meat
                    Toast.makeText(com.example.zpj.app_w_1.MainActivity.this, "led1_off",
                            Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.checkBox2:
                if (checked) {
                    // Cheese me
                    Toast.makeText(com.example.zpj.app_w_1.MainActivity.this, "led2_on",
                            Toast.LENGTH_SHORT).show();
                }
                else {
                    // I'm lactose intolerant
                    Toast.makeText(com.example.zpj.app_w_1.MainActivity.this, "led2_off",
                            Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.checkBox3:
                if (checked) {
                    // Cheese me
                    Toast.makeText(com.example.zpj.app_w_1.MainActivity.this, "led3_on",
                            Toast.LENGTH_SHORT).show();
                }
                else {
                    // I'm lactose intolerant
                    Toast.makeText(com.example.zpj.app_w_1.MainActivity.this, "led3_off",
                            Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.checkBox4:
                if (checked) {
                    // Cheese me
                    Toast.makeText(com.example.zpj.app_w_1.MainActivity.this, "led4_on",
                            Toast.LENGTH_SHORT).show();
                }
                else {
                    // I'm lactose intolerant
                    Toast.makeText(com.example.zpj.app_w_1.MainActivity.this, "led4_off",
                            Toast.LENGTH_SHORT).show();
                }
                break;

        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        setContentView(R.layout.content_layout_id);


        final Button button_1 = (Button) findViewById(R.id.button1);
        final CheckBox checkBox_1 = (CheckBox) findViewById(R.id.checkBox1);
        final CheckBox checkBox_2 = (CheckBox) findViewById(R.id.checkBox2);
        final CheckBox checkBox_3 = (CheckBox) findViewById(R.id.checkBox3);
        final CheckBox checkBox_4 = (CheckBox) findViewById(R.id.checkBox4);

//        if (checkBox.isChecked()) {
//            checkBox.setChecked(false);
//        }

        button_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                ledon = !ledon;
                if (ledon) {
                    button_1.setText("ALL OFF");
                    checkBox_1.setChecked(true);
                    checkBox_2.setChecked(true);
                    checkBox_3.setChecked(true);
                    checkBox_4.setChecked(true);
                }
                else {
                    button_1.setText("ALL ON");
                    checkBox_1.setChecked(false);
                    checkBox_2.setChecked(false);
                    checkBox_3.setChecked(false);
                    checkBox_4.setChecked(false);
                }
            }
        });



    }
}
