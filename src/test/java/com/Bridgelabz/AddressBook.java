package com.Bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    public static void main(String[] args) {

        //Creating Address Book
        List<String> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();

        list.add("Srushti");
        list.add("Mane");
        list.add("Dapodi");
        list.add("Pune");
        list.add("Maharashtra");
        list.add("456874");
        list.add("785423645");
        list.add("abcd@gmail.com");

        list1.add("Komal");
        list1.add("Mane");
        list1.add("Narhe");
        list1.add("Pune");
        list1.add("Maharashtra");
        list1.add("564215");
        list1.add("78954612");
        list1.add("efgh@gmail.com");

        System.out.println(list);
        System.out.println(list1);
    }
}
