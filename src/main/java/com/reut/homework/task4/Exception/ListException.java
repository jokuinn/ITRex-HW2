package com.reut.homework.task4.Exception;


import java.util.List;

public class ListException extends Exception {
    private final int number;
    private final List<Integer> list;

    public int getNumber(){
        return number;
    }

    public List<Integer> getList() {
        return list;
    }

    public ListException(String message, List<Integer> list, int numb){
        super(message);
        number = numb;
        this.list = list;
    }
}
