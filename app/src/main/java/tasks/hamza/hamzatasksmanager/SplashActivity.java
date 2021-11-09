package tasks.hamza.hamzatasksmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {
    private ImageView ivp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ivp=findViewById(R.id.ivp);

        Thread th=new Thread(){
            @Override
            public void run() {
                //هنا المقطع الذي يعمل بالتزامن مع مقاطع اخرى
              int i=3*1000;
                try {
                    sleep(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };


    }
}