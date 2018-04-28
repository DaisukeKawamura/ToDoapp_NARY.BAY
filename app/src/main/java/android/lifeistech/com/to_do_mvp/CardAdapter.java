package android.lifeistech.com.to_do_mvp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kawamuradaisuke on 2018/04/24.
 */


public class CardAdapter extends ArrayAdapter<Card> {
    List<Card> mCards;



    public CardAdapter(Context context, int layoutResourceId, List<Card> object){
        super(context, layoutResourceId, object);

        mCards = object;
    }

    @Override
    public int getCount(){
        return mCards.size();
    }


    @Override
    public Card getItem(int position){
        return mCards.get(position);
    }



//    public static class Viewholder{
//
//        TextView titleText;
//        CheckBox checkBox;
//
//        public Viewholder(View view) {
//            titleText = (TextView)view.findViewById(R.id.textView);
//            checkBox = (CheckBox)view.findViewById(R.id.checkBox);
//        }



    @Override
    public View getView( int position, View convertView, final ViewGroup parent){

//        final Viewholder viewholder;

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.card, null);
//            viewholder = new Viewholder(convertView);
//            convertView.setTag(viewholder);
//        } else{
//            viewholder = (Viewholder) convertView.getTag();　　　
        }

        final Card item =getItem(position);


        if (item != null){
           final TextView textView = (TextView)convertView.findViewById(R.id.textView);
           textView.setText(item.titleText);
           textView.setText(item.getTitleText());

           final CheckBox checkBox = (CheckBox) convertView.findViewById(R.id.checkBox);

           checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
           {
               @Override
               public void onCheckedChanged (CompoundButton compoundButton,boolean b){
                   if (checkBox.isChecked()){
                       Toast.makeText(getContext(),"completed",Toast.LENGTH_LONG).show();
                       item.setCheck(true);
                   }else {
                       item.setCheck(false);
                   }
               }
           });
        }


        return convertView;
    }

}
