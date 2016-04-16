package br.com.wilterson.premiere;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnLogin;
    private static final String TAG = "Email";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUI();
        setActions();
    }

    private void setUI(){
        btnLogin = (Button) findViewById(R.id.btnLogin);

    }

    private void setActions(){
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mudaTela = new Intent(MainActivity.this,activity_home.class);
                startActivity(mudaTela);
            }
        });

    }
}
