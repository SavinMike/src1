package com.savin.Task2;

/**
 * Created with IntelliJ IDEA.
 * User: acer
 * Date: 30.01.13
 * Time: 18:26
 * To change this template use File | Settings | File Templates.
 */
import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner cin=new Scanner(System.in);
        GenerateNumber newGame=new GenerateNumber();
        int yourNumber;
        int count=0;
        boolean flag=true;
        all:
        while (flag){

            System.out.println("Попытка №"+count+" Введите число:");
            try {
                yourNumber=cin.nextInt();
                switch (newGame.ask(yourNumber)){
                    case -1:
                       System.out.println("Ваше число меньше");
                        break;
                    case 1:
                        System.out.println("Ваше число больше");
                        break;
                    case 0:
                        System.out.println("Победа");
                        return;/// break all;
                }
                count++;

            }
            catch (NumberFormatException e){
                System.out.println("Нужно ввести число");
                cin.nextLine();
                continue;
            }
            if(count==8){
                flag=false;
                System.out.println("Вы проиграли. Загаданное число = "+newGame.getNumber());
            }

        }
    }
}
