package com.example.a10016322.buttonpractice;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ButtonColorActivity extends AppCompatActivity
{
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_color);

        button = (Button)(findViewById(R.id.button_id));
    }

    public void onClickGo(View view)
    {
        button.setBackgroundColor(Color.CYAN);
        ((Button)view).setText("Clicked");
    }
}
