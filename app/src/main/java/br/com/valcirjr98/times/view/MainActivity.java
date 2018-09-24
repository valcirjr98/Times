package br.com.valcirjr98.times.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import br.com.valcirjr98.times.R;
import br.com.valcirjr98.times.adapter.AdapterTimes;
import br.com.valcirjr98.times.model.Time;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewTimes;
    private List<Time> listaTimes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewTimes = findViewById(R.id.recyclerViewTimes);

        this.criarTimes();

        AdapterTimes adapterTimes = new AdapterTimes(listaTimes);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerViewTimes.setLayoutManager(layoutManager);
        recyclerViewTimes.setHasFixedSize(true);
        recyclerViewTimes.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerViewTimes.setAdapter(adapterTimes);
    }

    public void criarTimes(){
        Time time = new Time("Barcelona", "Espanha", "1899", R.drawable.barcelonalogo);
        listaTimes.add(time);

        time = new Time("Real Madrid", "Espanha", "1904", R.drawable.realmadridlogo);
        listaTimes.add(time);

        time = new Time("Vasco da Gama", "Brasil", "1898", R.drawable.vascologo);
        listaTimes.add(time);

        time = new Time("Fluminense", "Brasil", "1905", R.drawable.fluminenselogo);
        listaTimes.add(time);

        time = new Time("Botafogo", "Brasil", "1910", R.drawable.botafogologo);
        listaTimes.add(time);

        time = new Time("Liverpool", "Inglaterra", "1892", R.drawable.liverpoollogo);
        listaTimes.add(time);

        time = new Time("PSG", "França", "1970", R.drawable.psglogo);
        listaTimes.add(time);

        time = new Time("Roma", "Itália", "1893", R.drawable.romalogo);
        listaTimes.add(time);

        time = new Time("Juventus", "Itália", "1903", R.drawable.juventuslogo);
        listaTimes.add(time);



    }
}
