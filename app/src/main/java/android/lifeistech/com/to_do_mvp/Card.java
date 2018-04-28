package android.lifeistech.com.to_do_mvp;

import android.widget.CheckBox;

/**
 * Created by kawamuradaisuke on 2018/04/24.
 */

public class Card {

    public String titleText;
    Boolean check;


    public Card(String titleText) {
        this.titleText = titleText;
        this.check = check;

    }


    public String getTitleText(){

        return titleText;
    }


    public Boolean getCheck(){

        return check;
    }


    public void setCheck(Boolean check){
        this.check = check;
    }

}