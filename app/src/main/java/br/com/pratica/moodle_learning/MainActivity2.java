package br.com.pratica.moodle_learning;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;

import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;
import java.util.ArrayList;
import android.os.Bundle;
import android.content.Intent;

public class MainActivity2 extends AppCompatActivity {

    //AutoComplete
    AutoCompleteTextView AutoComplete;
    //Spinner
    Spinner spinner;
    //radioButton
    RadioButton btn_radio_imagem;
    RadioButton btn_img_ocultar;
    //img_background
    TextView TV_img_background;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //Autocomplete
        String str[]={"Adam","Alex","Antonio","Alvin"};

        AutoCompleteTextView t1 = (AutoCompleteTextView) findViewById(R.id.AutoComplete);

        ArrayAdapter<String> adp=new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,str);

        t1.setThreshold(1);
        t1.setAdapter(adp);

        //Spinner
        String[] pessoas = {"Escolher", "Jose", "Maria","Alguem","fulano","ciclano"};
        spinner = (Spinner)findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, pessoas);

        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {

                    @Override
                    public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {

                        int position = spinner.getSelectedItemPosition();
                        if(pessoas[+position].equals("Escolher")!= true)
                            Toast.makeText(getApplicationContext(),"Você selecionou: "+pessoas[+position],Toast.LENGTH_LONG).show();
                        // TODO Auto-generated method stub
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> arg0) {
                        // TODO Auto-generated method stub

                    }

                }
        );

        //radiogroup
        btn_radio_imagem = (RadioButton) findViewById(R.id.btn_radio_imagem);
        btn_img_ocultar = (RadioButton) findViewById(R.id.btn_img_ocultar);
        //img_background
        TV_img_background = (TextView) findViewById((R.id.TV_img_background));
    }

    //radiobutton
    public void onRadioGroupButtonClicked(View view) {

        // Check which radio button was clicked
        //Log.d("MainActivity2","Cliquei no group");
        if (((RadioButton)findViewById(R.id.btn_radio_imagem)).isChecked()) {
            TV_img_background.setBackgroundResource(R.drawable.android10hero);
            TV_img_background.setVisibility(View.VISIBLE);
        }
        if (((RadioButton)findViewById(R.id.btn_img_ocultar)).isChecked()) {
            TV_img_background.setVisibility(View.INVISIBLE);
        }

    }

    public void onClickBtnProximaTela(View v){

        Intent tela_3 = new Intent(this, MainActivity3.class);
        startActivity(tela_3);
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