package org.example;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println(onlyFloat(scn));
        scn.close();
    }
    public static float onlyFloat(Scanner scanner){
        while (true) {
            System.out.print("Введите дробное значение: ");
            String number=scanner.nextLine();
            number=number.replace(",",".");
            try{
                if(isStringInteger(number)){
                    throw new RuntimeException("\u001B[31mВы ввели целочисленное значение! Попробуйте еще раз!\u001B[0m");
                }
                else return Float.parseFloat(number);
            }catch (RuntimeException e){
                System.out.println("\u001B[31m"+e.getLocalizedMessage()+"\u001B[0m");
            }
        }
    }
    public static boolean isStringInteger(String number ){
        try{
            Integer.parseInt(number);
        }catch(Exception e ){
            return false;
        }
        return true;
    }
}
