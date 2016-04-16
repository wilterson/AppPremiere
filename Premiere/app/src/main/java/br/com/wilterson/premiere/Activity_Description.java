package br.com.wilterson.premiere;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Wilterson on 14/04/2016.
 */
public class Activity_Description extends AppCompatActivity{

    private ImageView poster;
    private TextView titulo;
    private TextView date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        int id = getIntent().getIntExtra("id", R.id.filme1);

        setUI();
        setInfos(id);
    }

    private void setInfos(int id){

        int imageId = 0;
        String name = "";
        String data = "";
        String linkIngresso = "";
        switch(id){
            case R.id.filme1:
                imageId = R.drawable.poster1;
                name = "Convergente";
                data = "29/03/2016";
                linkIngresso = "http://www.ingresso.com/sao-paulo/home/espetaculo/cinema/a-serie-divergente-convergente";
                break;
            case R.id.filme2:
                imageId = R.drawable.poster2;
                name = "Deadpool";
                data = "11/02/2016";
                linkIngresso = "http://www.ingresso.com/sao-paulo/home/espetaculo/cinema/deadpool";
                break;
            case R.id.filme3:
                imageId = R.drawable.poster3;
                name = "Boa Noite Mamãe";
                data = "25/02/2016";
                linkIngresso = "http://www.ingresso.com/sao-paulo/home/";
                break;
            case R.id.filme4:
                imageId = R.drawable.poster4;
                name = "Zootopia";
                data = "17/03/2016";
                linkIngresso = "http://www.ingresso.com/sao-paulo/home/espetaculo/cinema/zootopia-essa-cidade-e-o-bicho";
                break;
            case R.id.filme5:
                imageId = R.drawable.poster5;
                name = "Batman v Superman: A Origem da Justiça";
                data = "24/03/2016";
                linkIngresso = "http://www.ingresso.com/sao-paulo/home/espetaculo/cinema/batman-vs-superman-a-origem-da-justica";
                break;
            case R.id.filme6:
                imageId = R.drawable.poster6;
                name = "The Witch";
                data = "03/03/2016";
                linkIngresso = "http://www.ingresso.com/sao-paulo/home/espetaculo/cinema/a-bruxa";
                break;
            case R.id.filme7:
                imageId = R.drawable.poster7;
                name = "Rua Cloverfield 10";
                data = "07/04/2016";
                linkIngresso = "http://www.ingresso.com/sao-paulo/home/espetaculo/cinema/rua-cloverfield-10";
                break;
            case R.id.filme8:
                imageId = R.drawable.poster8;
                name = "Truque de Mestre: O Segundo Ato";
                data = "09/06/2016";
                linkIngresso = "http://www.ingresso.com/sao-paulo/home/espetaculo/cinema/truque-de-mestre-o-segundo-ato";
                break;
        }

        poster.setImageResource(imageId);
        titulo.setText(name);
        date.setText(data);
    }

    private void setUI(){
        poster = (ImageView) findViewById(R.id.poster);
        titulo = (TextView) findViewById(R.id.titulo);
        date = (TextView) findViewById(R.id.data);
    }
}
