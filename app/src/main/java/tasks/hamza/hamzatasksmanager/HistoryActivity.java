package tasks.hamza.hamzatasksmanager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class HistoryActivity extends AppCompatActivity {

    private SearchView srchv;
    private RecyclerView Rlv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        srchv=findViewById(R.id.srchv);
        Rlv=findViewById(R.id.Rlv);
    }
}