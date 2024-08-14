package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {

    ArrayList<String> bagels = new ArrayList<String>();
    ArrayList<String> orderedBagels = new ArrayList<>();
    int capacity;

    Basket(){
        bagels.add("bagelOne");
        bagels.add("bagelTwo");
        bagels.add("bagelThree");
        capacity = 5;
    }

    public boolean order(String bagel){
        if(!bagels.contains(bagel)){
            return false;
        }
        orderedBagels.add(bagel);
        return true;
    }

    public boolean remove(String bagel){
        if(orderedBagels.contains(bagel)){
            orderedBagels.remove(bagel);
            return true;
        }
        return false;
    }

    public boolean full(){
        if(orderedBagels.size() >= capacity){
            return true;
        }
        return false;
    }
}
