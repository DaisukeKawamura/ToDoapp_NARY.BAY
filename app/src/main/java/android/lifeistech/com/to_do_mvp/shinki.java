package android.lifeistech.com.to_do_mvp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class shinki extends AppCompatActivity {

    EditText titleEditText;
    EditText contentEditText;


    SharedPreferences pref;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shinki);

        titleEditText = (EditText)findViewById(R.id.editText);
        contentEditText = (EditText)findViewById(R.id.editText2);

        pref = getSharedPreferences("pref_memo",MODE_PRIVATE);

    }
    public void kanryo(View v){

        String titleText = titleEditText.getText().toString();
        String contentText = contentEditText.getText().toString();


        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("titleText",titleText);
        intent.putExtra("contentText",contentText);
        startActivity(intent);

    }


}
