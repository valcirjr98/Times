package br.com.valcirjr98.times;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalhesTime extends AppCompatActivity {

    private ImageView imageViewDescricao;
    private TextView textViewDescricao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes_time);



   textViewDescricao = findViewById(R.id.textViewDescricao);
   imageViewDescricao = findViewById(R.id.imageViewTimes);

        Intent intent = getIntent();
        String descricao = intent.getExtras().getString("Descricao");
        int image = intent.getExtras().getInt("Foto") ;


        textViewDescricao.setText(descricao);
        imageViewDescricao.setImageResource(image);



    }
}
