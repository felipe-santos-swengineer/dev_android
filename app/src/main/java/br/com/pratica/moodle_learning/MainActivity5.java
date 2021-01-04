package br.com.pratica.moodle_learning;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {

    GridView grid_view;
    String[] itens = new String[100];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        for(int i = 0; i < 100; i = i + 1){
            itens[i] = "item " + Integer.toString(i);
        }

        grid_view = findViewById(R.id.grid_view);
        MainAdapter adapter = new MainAdapter(MainActivity5.this, itens);
        grid_view.setAdapter(adapter);

        grid_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity5.this, "Você Selecionou : " + itens[position], Toast.LENGTH_SHORT).show();
            }
        });
    }

}