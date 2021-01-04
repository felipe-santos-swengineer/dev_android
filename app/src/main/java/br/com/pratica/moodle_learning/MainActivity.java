package br.com.pratica.moodle_learning;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //EditText
    EditText edtInput;
    //ToggleButtons
    private ToggleButton toggleButton1;
    //Som
    MediaPlayer sound;
    //ArrayList
    public ArrayList<String> pessoas;
    //listview
    ListView lista_nomes;
    ArrayAdapter ad;
    //auxiliares
    TextView text_confirm;
    Button btn_add_in_arraylist;
    EditText edtinput_arraylist;
    Button btn_prox_tela;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //instanciamento
        edtInput = findViewById(R.id.edtInput);
        text_confirm = findViewById(R.id.text_confirm);

        //som
        sound = MediaPlayer.create(this, R.raw.ft_theme);
        //chamado pelo togglebutton1

        //togglebuttons
        toggleButton1 = (ToggleButton) findViewById(R.id.toggleButton1);
        toggleButton1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    sound.start();
                    sound.setLooping(true);

                } else if (sound.isPlaying()) {
                    sound.pause();
                }

            }
        });

        //arraylist
        pessoas = new ArrayList<>();
        pessoas.add("Jose");
        pessoas.add("Maria");
        pessoas.add("João");

        btn_add_in_arraylist = findViewById(R.id.btn_add_in_arraylist);
        edtinput_arraylist = findViewById(R.id.edtinput_arraylist);
        lista_nomes = (ListView)findViewById(R.id.lista_nomes);
        ad = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,pessoas);
        lista_nomes.setAdapter(ad);

        //multiplas activity
        btn_prox_tela = findViewById(R.id.btn_prox_tela);


    }

    public void onClickButton01( View view ){
        //Log.d("MainActivity","Clique btn 01");
        String textoEdtInput  = edtInput.getText().toString();
        String ola = "ola";
        //Log.d("MainActivity",textoEdtInput);
        if(textoEdtInput.equals(ola))
        {
            //Log.d("MainActivity","entrei no visible");
            text_confirm.setVisibility(View.VISIBLE);
        }
        else {
            text_confirm.setVisibility((View.INVISIBLE));
        }
        edtInput.setText("");
    }

    public void onClickBtnArraylist(View v){
        String newName = edtinput_arraylist.getText().toString();
        if(newName.equals("")){
        }
        else {
            pessoas.add(newName);
            ad.notifyDataSetChanged();
        }
        edtinput_arraylist.setText("");
    }

    public void onClickBtnProximaTela(View v){

        Intent tela_2 = new Intent(this, MainActivity2.class);
        startActivity(tela_2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.btn_config:
                Toast.makeText(getApplicationContext(),"Você selecionou: item 1 ",Toast.LENGTH_LONG).show();
                return true;
            case R.id.voltar_inicio:
                Toast.makeText(getApplicationContext(),"Você selecionou: item 2",Toast.LENGTH_LONG).show();
                return true;

        }
        return super.onOptionsItemSelected(item);
    }

}