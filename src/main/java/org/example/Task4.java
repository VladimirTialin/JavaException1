package org.example;
/*
Разработайте программу, которая выбросит Exception,
когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
*/
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        emptyString(scanner);
    }
    public static void emptyString(Scanner scanner){
        System.out.print("Ваш текст: ");
        String msg=scanner.nextLine();
        if(msg.isEmpty())throw new RuntimeException("Ввведена пустая строка!");
        else if(msg.isBlank()) throw new RuntimeException("Строка содержит только пробелы!");
        else System.out.println(msg);
    }
}

