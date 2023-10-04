package com.tekwillacademy.exceptionsservicetask;

public class ArithmeticOperationService {

    public static int divideIntNoExceptionHandling(int a, int b){
        return a/b;
    }
    public static int divideIntWithExceptionHandling(int a, int b){

        try {
            return a/b;
        }catch (ArithmeticException ex){
            System.out.println("An exception has occurred " + ex.getMessage());
            return 0;
        }

    }
}
