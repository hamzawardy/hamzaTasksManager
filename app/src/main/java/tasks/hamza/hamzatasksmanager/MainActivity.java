package tasks.hamza.hamzatasksmanager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.SearchView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private FloatingActionButton fab2;
    private SearchView svsearchtask;
    private ListView lstvalltasks;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fab2=findViewById(R.id.fab2);
        svsearchtask=findViewById(R.id.svsearchtask);
        lstvalltasks=findViewById(R.id.lstvalltasks);


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {
       if(item.getItemId()==R.id.mnItmHistory)
       {
           Intent i=new Intent(getApplicationContext(),HistoryActivity.class);
           startActivity(i);
       }
       if(item.getItemId()==R.id.mnItmSetting)
       {
           Intent i=new Intent(getApplicationContext(),SettingActivity.class);
           startActivity(i);
       }
        if(item.getItemId()==R.id.mnItmSginUp)
        {
            AlertDialog.Builder builder =new AlertDialog.Builder(this);
            //
            builder.setMessage("Are you sure?");
            //
            builder.setCancelable(false);
            //
            builder.setPositiveButton("yes", (DialogInterface.OnClickListener) this);
            //
            builder.setNegativeButton("no", (DialogInterface.OnClickListener) this);
            //
            AlertDialog dialog=builder.create();
            //
            dialog.show();

        }

        return true;
    }
}