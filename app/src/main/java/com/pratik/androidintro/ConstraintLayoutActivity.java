package com.pratik.androidintro;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class ConstraintLayoutActivity extends AppCompatActivity {
    TextView text1;
    TextView text2;
    EditText fullName, phoneNumber;
    Button submitButton;

    Spinner spinnerDropdown;

    List<String> items= Arrays.asList("Kathmandu","Changragiri","Nagarkot","Pokhara", "Lumbini");

//    String [] places= getResources().getStringArray(R.array.tour_places);

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        //EdgeToEdge.enable(this);
        setContentView(R.layout.activity_constraint_layout);
        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);

        fullName= findViewById(R.id.editNameInput);
        phoneNumber= findViewById(R.id.editPhoneInput);

        spinnerDropdown= findViewById(R.id.spinner);


        submitButton = findViewById(R.id.btn1);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ConstraintLayoutActivity.this,"You clicked the button Homie", Toast.LENGTH_SHORT).show();

                String fullNameValue= fullName.getText().toString();
                Long phoneNumberValue= Long.parseLong(phoneNumber.getText().toString());

                try {
                    text1.setText(fullNameValue);
                    text2.setText(String.valueOf(phoneNumberValue));
                }
                catch (Exception e){
                    System.out.println(e);
                }


            }
        });
        ArrayAdapter<String> adapter= new ArrayAdapter<>(ConstraintLayoutActivity.this, android.R.layout.simple_spinner_dropdown_item,items);
        spinnerDropdown.setAdapter(adapter);
        spinnerDropdown.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(ConstraintLayoutActivity.this, items.get(position), Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

}
