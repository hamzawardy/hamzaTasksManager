package tasks.hamza.hamzatasksmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class SginUpActivity extends AppCompatActivity {
    private TextInputEditText etEmail,etPassword,etRepassword,etPhone,etfullname;
    private Button btnSave;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sgin_up);

        etEmail=findViewById(R.id.etEmail);
        etPassword=findViewById(R.id.etPassword);
        etRepassword=findViewById(R.id.etRepassword);
        etPhone=findViewById(R.id.etPhone);
        etfullname=findViewById(R.id.etfullname);
        btnSave=findViewById(R.id.btnSave);
    }
}