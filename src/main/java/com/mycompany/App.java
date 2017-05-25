package com.mycompany;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

//        MyList<NobleMan> list = new MyList<NobleMan>();
//
//        list.add(new NobleMan("ala", 1993));
//        list.add(new NobleMan("ma", 1993));
//        list.add(new NobleMan("kota", 1993));
//
//        for(int i = 0; i < list.getSize(); i++) {
//            NobleMan nobleMan = list.get(i);
//            System.out.println(nobleMan.getName());
//        }
        PeselSet ListOfMyPesels = new PeselSet();
        System.out.println(ListOfMyPesels.add("94031704035"));
        System.out.println(ListOfMyPesels.add("94031704035"));


    }
}
