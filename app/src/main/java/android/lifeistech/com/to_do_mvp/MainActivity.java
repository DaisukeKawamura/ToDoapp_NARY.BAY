package android.lifeistech.com.to_do_mvp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Shader;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

public class MainActivity extends AppCompatActivity {

    List<Card> mCards;
    CardAdapter mCardAdapter;
    ListView mListView;
    SharedPreferences pref;
    SharedPreferences.Editor editor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView = (ListView)findViewById(R.id.listview);
        mCards = new ArrayList<Card>();
        pref = getSharedPreferences("pref_memo",MODE_PRIVATE);
        editor = pref.edit();
        HashSet<String> set = new HashSet<String>();


            set.addAll(pref.getStringSet("set",set));



        if (intent.getStringExtra("titleText")!=null) {
                Intent intent  = getIntent();
                String title = intent.getStringExtra("titileText");
                String content = intent.getStringExtra("contentText");

                if (title!=null) {

                    set.add(title);
                    editor.putStringSet("set", set);
                    editor.putString(title, content);
                    editor.commit();

                    for (String s : set) {
                        mCards.add(new Card(s));
                    }
                }

            Log.d("intent","title");


        }

//        mCards.add(new Card(getString(R.id.));

        mCardAdapter = new CardAdapter(this,R.layout.card,mCards);
        mListView.setAdapter(mCardAdapter);



    }

    public void add(View v){
        Intent intent = new Intent(this,shinki.class);
        startActivity(intent);
    }

    public void kanryo(View v){





        AtomicReference<Intent> intent = new AtomicReference<>(new Intent());
        intent.get().getExtras();
        startActivity(intent.get());


    }

    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater mi = getMenuInflater();
        mi.inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }












}
