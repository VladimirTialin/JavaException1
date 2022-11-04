package org.example;

public class Task3 {
    public static void main(String[] args){
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            try{
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }
    }
    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
/* КОММЕТАРИЙ
public static void main(String[] args) throws Exception {
   try {
       int a = 90;
       int b = 3;
       System.out.println(a / b);
       printSum(23, 234);
       int[] abc = { 1, 2 };
       abc[3] = 9;
   } catch (Throwable ex) {
       System.out.println("Что-то пошло не так...");
   } catch (NullPointerException ex) {
       System.out.println("Указатель не может указывать на null!");
   } catch (IndexOutOfBoundsException ex) {
       System.out.println("Массив выходит за пределы своего размера!");
   }
}
public static void printSum(Integer a, Integer b) throws FileNotFoundException {
   System.out.println(a + b);
}

1. В методе printSum исключение вообще нужно убрать, оно лишнее, и сама функция не связана
с работой с файлами
2. public static void main(String[] args) throws Exception.... - класс проверяемых исключений,
его использование приведет к обработке всех возникающих исключений ниже класса  Exception,
в итоге мы так и не поймем, какая именно ошибка обрабатывается...
3. Throwable - является суперклассом всех ошибок и исключений. Его не стоит обработывать,т.к.
он будет обрабатывать все исключения и ошибки
также нам не будет известно, какую именно ошибку выкидывает приложение
И если мы обрабатываем Throwable, тогда смысл в обработке исключений нижнего уровня пропадает
и можно этим исключения уже не обрабатывать
4. NullPointerException - dозникает, когда приложение пытается использовать null в случае,
 когда требуется какой-то объект, по условию данной задачи, эта ошибка не будет возникать, т.к.
у нас массив имеет 2 значения, данная ошибка возможна, когда наш массив равен null;Так, что я удалил, то исключение
5. IndexOutOfBoundsException - индекс находится вне диапазона массива, единственное исключение, которое можно оставить
в коде,исходя из условий задачи, т.к. в задача массиву с индексом 3 пытаются присвоить значение 9, но изначально массив
имеет размер в 2 значения, а так как массив это статический объект,то мы его не можем расширить и присвоить значение за пределами
размера массива.
В ЦЕЛОМ Я БЫ ВООБЩЕ НЕ ПИСАЛ ТАКОЙ КОД.
*/
}
