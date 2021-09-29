package tasks.hamza.hamzatasksmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class SettingActivity extends AppCompatActivity {

    private Button btnsginout,btnclearhistory;
    private TextView etstay_sign_in;
    private RadioGroup RG;
    private RadioButton brgdelete,brgcrossline,brgRadioButton;
    private ToggleButton tbtn;
    private Switch sch1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        btnsginout=findViewById(R.id.btnsginout);
        btnclearhistory=findViewById(R.id.btnclearhistory);
        etstay_sign_in=findViewById(R.id.etstay_sign_in);
        RG=findViewById(R.id.RG);
        brgdelete=findViewById(R.id.brgdelete);
        brgcrossline=findViewById(R.id.brgcrossline);
        brgRadioButton=findViewById(R.id.brgRadioButton);
        tbtn=findViewById(R.id.tbtn);
        sch1=findViewById(R.id.sch1);



    }
}