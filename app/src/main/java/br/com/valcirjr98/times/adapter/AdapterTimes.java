package br.com.valcirjr98.times.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import br.com.valcirjr98.times.R;
import br.com.valcirjr98.times.model.Time;

public class AdapterTimes extends RecyclerView.Adapter<AdapterTimes.MyViewHolder>{

    private List<Time> times;

    public AdapterTimes(List<Time> lista) {
        this.times = lista;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View timesLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_times, parent, false);
        return new MyViewHolder(timesLista);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        final Time time = times.get(position);


        holder.nome.setText(time.getNome());
        holder.ano.setText(time.getAno());
        holder.pais.setText(time.getPais());
        holder.imagem.setImageResource(time.getImagemLogo());





    }

    @Override
    public int getItemCount() {
        return times.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView nome;
        TextView pais;
        TextView ano;
        ImageView imagem;


        public MyViewHolder(View itemView) {
            super(itemView);

            nome = itemView.findViewById(R.id.textViewNomeTime);
            pais = itemView.findViewById(R.id.textViewNomeDoPais);
            ano = itemView.findViewById(R.id.textViewAnoFundacao);
            imagem = itemView.findViewById(R.id.logo_imagem);

            }

        }


}
