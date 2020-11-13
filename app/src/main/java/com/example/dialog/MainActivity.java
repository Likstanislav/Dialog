package com.example.dialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button btnfon;
    ConstraintLayout constraintLayout;
    Context context;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnfon = (Button)findViewById(R.id.idbtn);
        constraintLayout = (ConstraintLayout)findViewById(R.id.idconstl);
        context = MainActivity.this;

    }

    @Override
    public void onClick(View v) {

        final CharSequence[] items = {getText(R.string.red), getText(R.string.yellow), getText(R.string.green)};


        btnfon.setOnClickListener(this);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.massage);

        builder.setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int item) {

                switch (item) {

                    case 0:
                        constraintLayout.setBackgroundColor(R.string.redColor);

                    break;

                    case 1:
                        constraintLayout.setBackgroundColor(R.string.yellowColor);
                        break;

                    case 2:
                        constraintLayout.setBackgroundColor(R.string.greenColor);
                        break;



                }

            }
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();


    }
}