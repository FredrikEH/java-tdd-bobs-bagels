package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {

    ArrayList<String> bagels = new ArrayList<String>();

    Basket(){
        bagels.add("bagelOne");
        bagels.add("bagelTwo");
        bagels.add("bagelThree");
    }

    public boolean order(String bagel){
        if(!bagels.contains(bagel)){
            return false;
        }
        return true;
    }
}
