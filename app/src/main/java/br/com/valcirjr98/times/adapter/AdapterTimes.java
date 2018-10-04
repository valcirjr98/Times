package br.com.valcirjr98.times.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

import br.com.valcirjr98.times.DetalhesTime;
import br.com.valcirjr98.times.R;
import br.com.valcirjr98.times.model.Time;

public class AdapterTimes extends RecyclerView.Adapter<AdapterTimes.MyViewHolder>{

    private List<Time> times;
    private Context context;



    public AdapterTimes(Context context, List<Time> lista) {
        this.times = lista;
        this.context = context;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View timesLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_times, parent, false);
        return new MyViewHolder(timesLista);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {

        final Time time = times.get(position);


        holder.nome.setText(time.getNome());
        holder.ano.setText(time.getAno());
        holder.pais.setText(time.getPais());
        holder.imagem.setImageResource(time.getImagemLogo());

        holder.card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, DetalhesTime.class);
                intent.putExtra("Descricao", times.get(position).getNome());
                intent.putExtra("Foto",times.get(position).getImagemLogo());
                // start the activity
                context.startActivity(intent);

            }
        });





    }

    @Override
    public int getItemCount() {
        return times.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView nome;
        private TextView pais;
        private TextView ano;
        private ImageView imagem;
        private LinearLayout card;



        public MyViewHolder(View itemView) {
            super(itemView);

            nome = itemView.findViewById(R.id.textViewNomeTime);
            pais = itemView.findViewById(R.id.textViewNomeDoPais);
            ano = itemView.findViewById(R.id.textViewAnoFundacao);
            imagem = itemView.findViewById(R.id.logo_imagem);
            card = itemView.findViewById(R.id.card_click);

            }

        }


}
