package com.example.lab2_form;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnShow;
    TextView tvShow,tvShow2;
    EditText edtName, edtRoll, edtStatus, edtBloodGroup, edtpresentAddress, edtPermanentAddress, edtSchool, edtCollege, edtUniversity;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnShow=findViewById(R.id.btnShow);
        tvShow=findViewById(R.id.tvSHow);
        tvShow2=findViewById(R.id.tvSHow2);
        edtName=findViewById(R.id.edtName);
        edtRoll=findViewById(R.id.edtRoll);
        edtBloodGroup=findViewById(R.id.edtBloodGroup);
        edtpresentAddress=findViewById(R.id.edtPresentAddress);
        edtPermanentAddress=findViewById(R.id.edtPermanentAddress);
        edtSchool=findViewById(R.id.edtSchool);
        edtCollege=findViewById(R.id.edtCollege);
        edtStatus=findViewById(R.id.edtStatus);
        edtUniversity=findViewById(R.id.edtUniversity);

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sh="Name: "+(edtName.getText().toString().trim())+
                        "\n   Roll: "+(edtRoll.getText().toString().trim())+
                        "\nBloodGroup: "+(edtBloodGroup.getText().toString().trim());


                sh = sh+"\nPresent Address: "+(edtpresentAddress.getText().toString().trim())+
                        "\nPermanent Adresss: "+(edtPermanentAddress.getText().toString().trim())+
                        "\nStatus: "+(edtStatus.getText().toString().trim())+
                        "\nSchool: "+(edtSchool.getText().toString().trim());


                //String sh1 =" Roll: "+(edtRoll.getText().toString().trim());

                tvShow.setText(sh);
                //tvShow2.setText(sh1);


            }
        });
    }
}