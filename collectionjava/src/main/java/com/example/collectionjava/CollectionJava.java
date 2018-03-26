package com.example.collectionjava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by SHREE on 27/03/2018.
 */

public class CollectionJava {
    public static void main(String[] args) {
        //List
        ArrayList<String> list=new ArrayList<String>();
        list.add("Java");
        list.add("html");
        list.add("php");
        for(String obj:list)
            System.out.println("ArrayList "+obj);


        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        hm.put(1,"Css");
        hm.put(2,"Kotlin");
        hm.put(3,"Java");
        hm.put(4,"html");
        hm.put(5,"php");
        hm.put(6,"php");
        System.out.println("HashMap "+hm);


        HashSet<String> set=new HashSet<String>();
        set.add("Java");
        set.add("Kotlin");
        set.add("css");
        set.add("html");
        set.add("php");
        System.out.println("HashSet "+set);
    }

}
