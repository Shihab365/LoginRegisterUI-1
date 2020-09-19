package com.lupinesoft.logreg_ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;

public class RegActivity extends AppCompatActivity {
    CardView cardLogButon;
    ImageView submitButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);

        cardLogButon = findViewById(R.id.register_goLogButton_ID);
        submitButton = findViewById(R.id.register_submitButton_ID);

        cardLogButon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegActivity.this, MainActivity.class));
            }
        });
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegActivity.this, MainActivity.class));
            }
        });
    }
}
