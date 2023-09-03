package com.example.mygame;

import java.util.ArrayList;

public class RandomNumber {
    public RandomNumber(){}

    public static ArrayList<Integer> generate(int number) {

        ArrayList<Integer> tmp = new ArrayList<>();
        int count = 0;
        int value;
        boolean flag;

        while(count < number) {

            flag = false;
            value = (int) (Math.random() * 100);

            for(int i = 0; i < tmp.size(); i++) {
                if((Integer) tmp.get(i).intValue() == value) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                tmp.add(value);
                count++;
            }
        }
        return tmp;
    }

}
