package com.mycompany;

import java.util.ArrayList;

/**
 * Created by kornel on 25.05.17.
 */
public class PeselSet {
    ArrayList<String> ListOfPesel = new ArrayList<String>();


    public boolean add (String p){
        Pesel pesel = new Pesel(p);

        if (pesel.isCorrect() && !ListOfPesel.contains(p)) {
            ListOfPesel.add(p);
            return true;
        }
        else
            return false;
    }


}
