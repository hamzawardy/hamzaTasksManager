package tasks.hamza.hamzatasksmanager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private FloatingActionButton floatingActionButton2;
    private SearchView svsearchtask;
    private RecyclerView lstvalltasks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        floatingActionButton2=findViewById(R.id.floatingActionButton2);
        svsearchtask=findViewById(R.id.svsearchtask);
        lstvalltasks=findViewById(R.id.lstvalltasks);

    }
}