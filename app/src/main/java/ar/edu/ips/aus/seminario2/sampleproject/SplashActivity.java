package ar.edu.ips.aus.seminario2.sampleproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SplashActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity);

        Button jugarCallGame = (Button) findViewById(R.id.button_laberinto);
        jugarCallGame.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent game = new Intent(SplashActivity.this, GameSelectionActivity.class);
                startActivity(game);
                finish();
            }
        });
    }
}
