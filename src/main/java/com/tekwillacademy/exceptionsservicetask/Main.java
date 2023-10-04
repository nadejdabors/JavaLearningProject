package com.tekwillacademy.exceptionsservicetask;

public class Main {
    public static void main(String[] args) {
        //System.out.println(ArithmeticOperationService.divideIntNoExceptionHandling(9,0));
        System.out.println(ArithmeticOperationService.divideIntWithExceptionHandling(9,0));
       // System.out.println(TextManager.getTheTextLength(null));
        System.out.println(TextManager.getTheTextLengthWithTryCatchFinally(null));
        System.out.println(TextManager.getTheTextLengthWithTryCatchFinally("Elena"));
    }
}
