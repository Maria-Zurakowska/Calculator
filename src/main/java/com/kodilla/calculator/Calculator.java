package com.kodilla.calculator;

class Calculator {

    public static int addAToB (int a, int b){
        return a+b;
    }

    public static int subtractAFromB (int a, int b){
        return a-b;
    }

    public static void main(String[] args) {
        int a = 20;
        int b = 10;

        System.out.println(addAToB(a,b));
        System.out.println(subtractAFromB(a,b));

    }

}

