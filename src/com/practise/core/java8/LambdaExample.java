package com.practise.core.java8;

public class LambdaExample {
    public static void main(String[] args) {
        LambdaExample lambdaExample = new LambdaExample();

        MathOperation addition = (a,b)-> a+b;

        MathOperation substraction = (a,b)->a-b;



        System.out.println(lambdaExample.operation(10,5,addition));

        GreetingFunction greetingFunction = a->
        {
            System.out.println(a);
            return a;
        };

        GreetingFunction greetingFunction1 = (a)-> a;

        greetingFunction.sayMessage("harshad");
        String gf =greetingFunction1.sayMessage("hi");

        System.out.println("gf : " + gf);
    }

    @FunctionalInterface
    interface MathOperation{
        default void abc(){
            System.out.println("harshad");
        }
        static int def(int i){return i;}

        int operation(int a , int b);
    }
    @FunctionalInterface
    interface GreetingFunction{
        String sayMessage(String message);
        //String sayDont(int a);
    }



    public int operation(int a , int b ,MathOperation mathOperation){
        return mathOperation.operation(a,b);
    }
}