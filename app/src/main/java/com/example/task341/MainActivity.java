package com.example.task341;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Spinner;


public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Utils.onActivityCreateSetTheme(this);
        setContentView(R.layout.activity_main);


        Button btnOk = findViewById(R.id.btn_ok);
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Spinner spinner = findViewById(R.id.spinner);
                String checkTheme = spinner.getSelectedItem().toString();
                System.out.println(checkTheme);

                switch (checkTheme) {
                    case ("черный"):
                        Utils.changeToTheme(MainActivity.this, Utils.THEME_BLACK);
                        break;
                    case ("зеленый"):
                        Utils.changeToTheme(MainActivity.this, Utils.THEME_GREEN);
                        break;
                    case ("синий"):
                        Utils.changeToTheme(MainActivity.this, Utils.THEME_BLUE);
                        break;
                }
            }
        });
    }
}
