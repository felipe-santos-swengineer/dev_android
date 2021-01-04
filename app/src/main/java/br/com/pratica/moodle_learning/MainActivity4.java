package br.com.pratica.moodle_learning;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {

    Button btn_show_popup;
    Button btn_clique_longo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        btn_show_popup = (Button) findViewById(R.id.btn_show_popup);
        btn_clique_longo = (Button) findViewById(R.id.btn_clique_longo);

        btn_clique_longo.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(getApplicationContext(),"Você pressionou durante um tempo",Toast.LENGTH_LONG).show();
                return true;
            }
        });

        btn_clique_longo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Você não pressionou durante um tempo",Toast.LENGTH_LONG).show();
            }
        });
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



    public void onClickButtonShowPopUp( View view ){
        //Creating the instance of PopupMenu
        PopupMenu popup = new PopupMenu(MainActivity4.this, view);
        //Inflating the Popup using xml file
        popup.getMenuInflater().inflate(R.menu.popup_menu, popup.getMenu());
        //registering popup with OnMenuItemClickListener
        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            public boolean onMenuItemClick(MenuItem item) {
                Toast.makeText(MainActivity4.this, "Você Selecionou : " + item.getTitle(), Toast.LENGTH_SHORT).show();
                return true;
            }

        });
        popup.show();
    }

    public void onClickButtonGoogle1( View view ){
        //Creating the instance of PopupMenu
        PopupMenu popup = new PopupMenu(MainActivity4.this, view);
        //Inflating the Popup using xml file
        popup.getMenuInflater().inflate(R.menu.google_1, popup.getMenu());
        //registering popup with OnMenuItemClickListener
        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            public boolean onMenuItemClick(MenuItem item) {
                Toast.makeText(MainActivity4.this, "Você Selecionou : " + item.getTitle(), Toast.LENGTH_SHORT).show();
                return true;
            }

        });
        popup.show();
    }
    public void onClickButtonGoogle2( View view ){
        //Creating the instance of PopupMenu
        PopupMenu popup = new PopupMenu(MainActivity4.this, view);
        //Inflating the Popup using xml file
        popup.getMenuInflater().inflate(R.menu.google_2, popup.getMenu());
        //registering popup with OnMenuItemClickListener
        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            public boolean onMenuItemClick(MenuItem item) {
                Toast.makeText(MainActivity4.this, "Você Selecionou : " + item.getTitle(), Toast.LENGTH_SHORT).show();
                return true;
            }

        });
        popup.show();
    }

    public void onClickButtonGoogle3( View view ){
        //Creating the instance of PopupMenu
        PopupMenu popup = new PopupMenu(MainActivity4.this, view);
        //Inflating the Popup using xml file
        popup.getMenuInflater().inflate(R.menu.google_3, popup.getMenu());
        //registering popup with OnMenuItemClickListener
        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            public boolean onMenuItemClick(MenuItem item) {
                Toast.makeText(MainActivity4.this, "Você Selecionou : " + item.getTitle(), Toast.LENGTH_SHORT).show();
                return true;
            }

        });
        popup.show();
    }

    public void onClickButtonGoogle4( View view ){
        //Creating the instance of PopupMenu
        PopupMenu popup = new PopupMenu(MainActivity4.this, view);
        //Inflating the Popup using xml file
        popup.getMenuInflater().inflate(R.menu.google_4, popup.getMenu());
        //registering popup with OnMenuItemClickListener
        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            public boolean onMenuItemClick(MenuItem item) {
                Toast.makeText(MainActivity4.this, "Você Selecionou : " + item.getTitle(), Toast.LENGTH_SHORT).show();
                return true;
            }

        });
        popup.show();
    }

    public void onClickBtnProximaTela(View v){

        Intent tela_5 = new Intent(this, MainActivity5.class);
        startActivity(tela_5);
    }



}