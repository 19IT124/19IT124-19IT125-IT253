package com.example.matrixcalc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;


public class ActivityMatrixMainPage extends AppCompatActivity {
    Button bt_determine;
    Button bt_trancepose;
    Button bt_inverse;
    Button bt_adjoint;
    Button bt_sum;
    Button bt_multiplication;

    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matrix_main_page);

        bt_determine = (Button)findViewById(R.id.btdetermine);
        bt_trancepose = (Button)findViewById(R.id.bttranspose);
        bt_inverse = (Button)findViewById(R.id.btinverse);
        bt_adjoint = (Button)findViewById(R.id.btadjoint);
        bt_sum = (Button)findViewById(R.id.btsum);
        bt_multiplication = (Button)findViewById(R.id.btmultiplication);



        bt_sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abc = new Intent(ActivityMatrixMainPage.this,SumPage.class);
                startActivity(abc);
            }
        });
        bt_multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abc = new Intent(ActivityMatrixMainPage.this,MultiplicationPage.class);
                startActivity(abc);
            }
        })





    }
}