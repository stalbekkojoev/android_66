package com.example.geektechandroid6hw;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private EditText edit_pochta,edit_parol;
    private Button btn_voyti, btn_password_zabyl;
    private TextView dobro_pojal, registr, vhod;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit_pochta = (EditText) findViewById(R.id.pochta);
        edit_parol = (EditText) findViewById(R.id.edit_parol);
        btn_voyti = (Button) findViewById(R.id.voyti);
        btn_password_zabyl = (Button) findViewById(R.id.password_zabyl);
        dobro_pojal = (TextView) findViewById(R.id.dobropojal);
        registr = (TextView) findViewById(R.id.registr);
        vhod = (TextView) findViewById(R.id.vhod);
        onclicklistener();
        edit_pochta.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (edit_pochta.getText().toString().isEmpty()) {
                    btn_voyti.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.gray));
                } else {
                    btn_voyti.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.ORANGE));
                }
            }
        });
        edit_parol.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable charSequence) {
                if (edit_parol.getText().toString().isEmpty()) {
                    btn_voyti.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.gray));
                } else {
                    btn_voyti.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.ORANGE));
                }
            }
        });
    }

    private void onclicklistener() {
        btn_voyti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edit_pochta.getText().toString().equals("admin@gmail.com") && edit_parol.getText().toString().equals("admin")){
                    btn_voyti.setVisibility(View.GONE);
                    btn_password_zabyl.setVisibility(View.GONE);
                    edit_pochta.setVisibility(View.GONE);
                    edit_parol.setVisibility(View.GONE);
                    registr.setVisibility(View.GONE);
                    vhod.setVisibility(View.GONE);
                    Toast.makeText(MainActivity.this, "Правильно", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Неверная почта или пароль.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

