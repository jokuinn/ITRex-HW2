package com.reut.homework.task4;

import com.reut.homework.task4.Exception.ListException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomListGenerator {

    private final Random random = new Random();
    private final List<Integer> list = new ArrayList<>();
    private final List<Integer> numList = new ArrayList<>();

    public void getList() throws ListException{
        System.out.println("Список из трех чисел:");
        for (int i = 1; i <=3; i++){
            int number = random.nextInt(9) + 1;
            list.add(number);
            System.out.println(i + " число = " + number);
        }
        listValidator();
    }
    public void listValidator() throws ListException {
        for (int number : list) {
            if (number % 2 == 0) {
                numList.add(number);
                throw new ListException("В листе есть четное число/числа.", numList, number);
            }
        }
    }
}
