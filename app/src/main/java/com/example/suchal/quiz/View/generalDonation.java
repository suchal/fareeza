package com.example.suchal.quiz.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.suchal.quiz.R;

import java.util.ArrayList;
import java.util.List;

public class generalDonation extends AppCompatActivity {
    private Spinner gen_type;
    private Button gen_donate;
    private EditText amount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gen_donation);
        //Intent intent = getIntent();
        //selected_type = intent.getStringExtra("selected_type");
        spinner_values();
        gen_type=findViewById(R.id.donation_type);
        gen_donate=findViewById(R.id.gen_donate);
        amount=findViewById(R.id.amount);
        gen_donate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String selected_type=gen_type.getSelectedItem().toString();
                Toast.makeText(generalDonation.this, "You have selected "+selected_type+"with amount"+amount.getText(),Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void spinner_values(){
        List list = new ArrayList();
        list.add("Zakat");
        list.add("Fitrana");
        list.add("Sadqa");
        ArrayAdapter dataAdapter =new ArrayAdapter(generalDonation.this,android.R.layout.simple_spinner_item,list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        gen_type.setAdapter(dataAdapter);
    }
}
