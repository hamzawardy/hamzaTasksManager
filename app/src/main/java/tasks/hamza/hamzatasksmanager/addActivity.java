package tasks.hamza.hamzatasksmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Spinner;

import com.google.android.material.textfield.TextInputEditText;

public class addActivity extends AppCompatActivity {

    private TextInputEditText ettitle,etsubject;
    private Spinner spn;
    private SeekBar seekBar;
    private ImageView iv2;
    private Button btnsave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        ettitle=findViewById(R.id.ettitle);
        etsubject=findViewById(R.id.etsubject);
        spn=findViewById(R.id.spn);
        seekBar=findViewById(R.id.seekBar);
        iv2=findViewById(R.id.iv2);
        btnsave=findViewById(R.id.btnsave);


    }

}