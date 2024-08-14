package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {

    ArrayList<String> bagels = new ArrayList<String>();

    public boolean order(String bagel){
        if(bagel.isEmpty()){
            return false;
        }
        return true;
    }
}
