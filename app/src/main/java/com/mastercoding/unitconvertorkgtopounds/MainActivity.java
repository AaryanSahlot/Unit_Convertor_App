package com.mastercoding.unitconvertorkgtopounds;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView welcome_tv,output_tv;
    EditText name_et,weight_et;
    Button calculate_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        welcome_tv=findViewById(R.id.welcome_tv);
        output_tv=findViewById(R.id.output_tv);
        name_et=findViewById(R.id.entername_et);
        weight_et=findViewById(R.id.enterweight_et);
        calculate_btn=findViewById(R.id.calculate_btn);

        calculate_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=name_et.getText().toString();
                double weight_in_kg=Double.parseDouble(weight_et.getText().toString());
                output_tv.setText("Hello "+name+"\n"+"Your Weight in Pounds is: "+convertToPound(weight_in_kg)+" lbs");
                Toast.makeText(MainActivity.this, "Please also inform others\nabout this App", Toast.LENGTH_SHORT).show();

            }
        });


    }

    public double convertToPound(double a){
        double weight_pound=a*2.20462;
        return weight_pound;
    }
}