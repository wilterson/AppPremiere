package br.com.wilterson.premiere;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by Wilterson on 09/04/2016.
 */
public class activity_home extends AppCompatActivity{

    private ImageView poster1, poster2, poster3, poster4, poster5, poster6, poster7, poster8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        setUI();
        setAction();
    }

    private void setAction() {
        poster1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToDescription(R.id.filme1);
            }
        });

        poster2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToDescription(R.id.filme2);
            }
        });

        poster3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToDescription(R.id.filme3);
            }
        });

        poster4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToDescription(R.id.filme4);
            }
        });

        poster5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToDescription(R.id.filme5);
            }
        });

        poster6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToDescription(R.id.filme6);
            }
        });

        poster7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToDescription(R.id.filme7);
            }
        });

        poster8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToDescription(R.id.filme8);
            }
        });
    }

    private void goToDescription(int id){
        Intent goDesc = new Intent(activity_home.this,Activity_Description.class);
        goDesc.putExtra("id", id);
        startActivity(goDesc);
    }

    private void setUI(){
        poster1 = (ImageView) findViewById(R.id.filme1);
        poster2 = (ImageView) findViewById(R.id.filme2);
        poster3 = (ImageView) findViewById(R.id.filme3);
        poster4 = (ImageView) findViewById(R.id.filme4);
        poster5 = (ImageView) findViewById(R.id.filme5);
        poster6 = (ImageView) findViewById(R.id.filme6);
        poster7 = (ImageView) findViewById(R.id.filme7);
        poster8 = (ImageView) findViewById(R.id.filme8);
    }
}
