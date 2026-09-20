package com.example.powitanie;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText etName;
    private Button btnGreet;
    private TextView tvWelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.etName);
        btnGreet = findViewById(R.id.btnGreet);
        tvWelcome = findViewById(R.id.tvWelcome);

        btnGreet.setOnClickListener(v -> {
            String name = etName.getText().toString().trim();

            if (name.isEmpty()) {
                Toast.makeText(MainActivity.this, R.string.toast_empty, Toast.LENGTH_SHORT).show();
                tvWelcome.setText("");
            } else {
                String greeting = getString(R.string.welcome_message, name);
                tvWelcome.setText(greeting);
            }
        });
    }
}