package com.mirea.makarenkonp.buttonclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView tv;
    private Button btnYes;
    private Button btnNo;
    private CheckBox ckBx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.tvOut);
        btnYes = findViewById(R.id.btnYes);
        btnNo = findViewById(R.id.btnNo);
        ckBx = findViewById(R.id.checkBoxStudent);

        View.OnClickListener onclbtnYes = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("Мой номер в списке №17");
                ckBx.setChecked(true);
            }
        };
        btnYes.setOnClickListener(onclbtnYes);
    }

    public void onMyButtonClick(View view){
        Toast.makeText(this, "Еще один способ!", Toast.LENGTH_SHORT).show();

        tv.setText("Упс это не я");
        ckBx.setChecked(false);
    }
}