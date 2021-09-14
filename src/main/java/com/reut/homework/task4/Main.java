package com.reut.homework.task4;

import com.reut.homework.task4.Exception.ListException;

public class Main {

    public static void main(String[] args) {
        start();
        finish();
    }

    public static void start(){
        try {
            new RandomListGenerator().getList();
        } catch (ListException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getNumber() + " - четное число" + "\n" + e.getList());
            start();
        }
    }
    public static void finish(){
        System.out.println("Три числа сгенерированы успешно!");
    }

}
