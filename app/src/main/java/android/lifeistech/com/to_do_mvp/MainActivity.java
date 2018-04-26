package android.lifeistech.com.to_do_mvp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Shader;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    List<Card> mCards;
    CardAdapter mCardAdapter;
    ListView mListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView = (ListView)findViewById(R.id.listview);
        mCards = new ArrayList<Card>();

        mCards.add(new Card(getString(R.id.textView)));

        mCardAdapter = new CardAdapter(this,R.layout.card, mCards);
        mListView.setAdapter(mCardAdapter);

    }

    public void add(View v){
        Intent intent = new Intent(this,shinki.class);
        startActivity(intent);
    }

    public void kanryo(View v){

        Intent intent = new Intent();
        intent.getExtras();
        startActivity(intent);


    }

    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater mi = getMenuInflater();
        mi.inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }












}
