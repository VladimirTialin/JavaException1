package org.example;

public class Task2 {
    public static void main(String[] args) {
//УСЛОВИЕ ЗАДАЧИ
// Если необходимо, исправьте данный код
        /*
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
        1. Данный фрагмент кода не несет никакого смысла, какое бы число не делили на 0, всегда будет исключение
        2. Также виден фрагмен кода с массивом intArray[8]/ Судя по названию он содержит целочисленные значения,
        но нет фрагмента кода с его инициализацией, т.е. не известно какие значения он содержит, его длина,
        возможно массив вообще пустой....Если учитывать все вышеизложенное по данному пункту, то необходимо
        обработать исключения IndexOutOfBoundsException и NullPointerException;
        3. int d = 0 у нас является целочисленным значение, а если учитывать что и массив и d целочисленные,
        то double catchedRes1 будет выводить всегда целочисленные значения, необходимо привести одно из указанных значений
        к типу double, либо строку int d = 0 заменить на double d = любому число, кроме 0;Но в данному случае приводить к типу double
        не нужно,т.к. всегда будет исключение...
        Возможно этот фрагмент кода написан в качестве теста, но всем известно, что делить на 0 нельзя:)
        ТАКОЙ БЫ КОД Я ЯВНО НЕ ПИСАЛ БЫ
         */
        //int [] intArray= null;
        int [] intArray= {6,7,8,3,0,-1,34,5,32,1,2,3,5,6};
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException | NullPointerException | IndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        }

    }
}
