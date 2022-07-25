package com.Bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class AddressBook {
    public static void main(String[] args) {

        //Creating Address Book
        List<String> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();

        //Details Of First Person

        list.add("Srushti");
        list.add("Mane");
        list.add("Dapodi");
        list.add("Pune");
        list.add("Maharashtra");
        list.add("456874");
        list.add("785423645");
        list.add("abcd@gmail.com");

        System.out.println(list);


        //Details Of Second Person

        list1.add("Komal");
        list1.add("Mane");
        list1.add("Narhe");
        list1.add("Pune");
        list1.add("Maharashtra");
        list1.add("564215");
        list1.add("78954612");
        list1.add("efgh@gmail.com");

        System.out.println(list1);

        //Details Of Third Person
        list2.add("Ruchika");
        list2.add("Jadhav");
        list2.add("Vasai");
        list2.add("Thane");
        list2.add("Maharashtra");
        list2.add("56468");
        list2.add("78954658");
        list2.add("efghlop@gmail.com");

        System.out.println(list2);

        //Details Of Fourth Person
        list3.add("Rasika");
        list3.add("Mule");
        list3.add("Panji");
        list3.add("Goa");
        list3.add("Maharashtra");
        list3.add("564312");
        list3.add("789502020");
        list3.add("efghpiuy@gmail.com");

        System.out.println(list3);

        //To ensure there is no duplicate entry of the same person

        list.retainAll(list1);
        System.out.println(list);

        list1.retainAll(list2);
        System.out.println(list1);

        list2.retainAll(list3);
        System.out.println(list2);

        list3.retainAll(list);
        System.out.println(list3);


    }
}
