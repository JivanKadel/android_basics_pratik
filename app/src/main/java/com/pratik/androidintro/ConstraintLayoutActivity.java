package com.pratik.androidintro;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.time.Duration;

public class ConstraintLayoutActivity extends AppCompatActivity {
    TextView text1;
    TextView text2;
    EditText fullName, phoneNumber;
    Button submitButton;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        //EdgeToEdge.enable(this);
        setContentView(R.layout.activity_constraint_layout);
        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);

        fullName= findViewById(R.id.editNameInput);
        phoneNumber= findViewById(R.id.editPhoneInput);


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

    }

}
