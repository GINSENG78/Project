package Lesson4;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class ArrayExamples {

    public void stringArray() {
        String[] buttons = {"OK", "Cancel", "Login", "SingUp"};
//        buttons [2] = "Exit";
        int length = buttons.length;
//        System.out.println(buttons[2]);
//        System.out.println("length " + length);

//        for (int i = 0; i< buttons.length; i++){
//            System.out.println(buttons [i]);
//        }
//        for (String button : buttons) {
//            System.out.println(button);
//        }
    }

    public void stringArrayWithSize() {
        String[] array = new String[5];
        array[0] = "OK";
        array[0] = "Cancel";
        array[0] = "Login";
        array[0] = "SingUp";
        System.out.println("length: " + array.length);
    }

    public void integerArray() {
        int[] ids = {12, 3, 5, 8};
        System.out.println(ids[2]);


    }

    public void arrayListExample() {
        ArrayList<String> buttons = new ArrayList<String>();
        buttons.add("OK");
        buttons.add("Cancel");
        buttons.add("Login");
        buttons.add("Exit");
//        System.out.println(buttons.get(0));
                for (int i = 0; i< buttons.size(); i++){
                    System.out.println(buttons.get(i));
                }
//            System.out.println(buttons [i]);
//        for (String button : buttons) {
//            System.out.println(button);
//        }
//        System.out.println("The size of the list "+ buttons.size());
//        buttons.add("SignUp");
//        for (String button : buttons) {
//            System.out.println(button);
//        }
//
//        buttons.remove("Exit");
//        System.out.println();
//        for (String button: buttons){
//            System.out.println(button);
//
//        }
//        buttons.clear();
//        System.out.println(buttons.size());
//    }

    }

    public void arrayListSortingExample(){
        ArrayList<Integer>arrayList = new ArrayList<Integer>();
        arrayList.add(123);
        arrayList.add(1);
        arrayList.add(23);
        arrayList.add(98);
        Collections.sort(arrayList);
        for (Integer i: arrayList){
            System.out.println(i);
        }
    }

    public void hashMapExample(){
        HashMap<String,String> hashMap = new HashMap<String,String>();
        hashMap.put("John","Toronto");
        hashMap.put("Kate","Moscow");
        hashMap.put("Moshe","Tel-Aviv");
        System.out.println(hashMap);
        hashMap.get("Moshe");
        System.out.println(hashMap.get("Moshe"));
        hashMap.remove("John");
        System.out.println(hashMap.size());
    }

    public void hashSetExample(){
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("John");
        hashSet.add("Kate");
        hashSet.add("Moshe");
        System.out.println(hashSet);

        List<String> list = new ArrayList<String>(hashSet);
        Collections.sort(list);
        System.out.println(list);
    }




}
