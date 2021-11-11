package tasks.hamza.hamzatasksmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
                //   هنا المقطع الذي يعمل بالتزامن مع مقاطع اخرى
              int ms=3*1000;//millisecond
                try {
                    sleep(ms);
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        //Thread: 4
        th.start();


    }
}




