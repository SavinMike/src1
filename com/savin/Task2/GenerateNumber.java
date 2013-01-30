package com.savin.Task2;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: acer
 * Date: 30.01.13
 * Time: 18:55
 * To change this template use File | Settings | File Templates.
 */

public class GenerateNumber {
    private int number;
    GenerateNumber (){
        Random r=new Random();
        this.number=r.nextInt(100);
    }
    public int getNumber(){
        return number;
    }
    public int ask(int CurrentNumber){

        if(CurrentNumber>number){
            return 1;
        }
        else if (CurrentNumber==number)
            return 0;
        else
            return -1;
    }

}
