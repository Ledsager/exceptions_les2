package org.example;

/*
Если необходимо, исправьте данный код:
try {
   int d = 0;
   double catchedRes1 = intArray[8] / d;
   System.out.println("catchedRes1 = " + catchedRes1);
} catch (ArithmeticException e) {
   System.out.println("Catching exception: " + e);
}

Исправленный код:
public static void ErrorDivision(int[] intArray){
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
 */

/*
Если необходимо, исправьте данный код:
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

Исправленный код:
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b){
        System.out.println(a + b);
    }
 */

/*
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить
у пользователя ввод данных.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str =getNullInUser();
    }


    public static float getFloatInUser() {
        Scanner scanner = new Scanner(System.in);
        boolean hasInput = false;
        Float indexs = 0.0F;
        while (!hasInput) {
            System.out.print("Введите число(разделитель запятая): ");
            if (scanner.hasNextFloat()) {
                indexs = scanner.nextFloat();
                hasInput = true;
            } else {
                System.out.println("Вы ввели не число, попробуйте еще раз");
                scanner.next();
            }
        }
        scanner.close();
        return indexs;
    }
    /*
    Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
    Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
     */
    public static String getNullInUser() {
        Scanner scanner = new Scanner(System.in);
        String str = "";

        System.out.print("Введите строку: ");
        str = scanner.nextLine();
        if (str.isEmpty()) try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("пустые строки вводить нельзя");
        }

        scanner.close();
        return str;

    }
}
