package com.practise.core.logic;

public class PrimeOrNot {

    static void numberIsPrimeOrNot(int num){
        int i;
        boolean prime = true;
        for(i=2 ; i<=(num/2);i++)
        {
            if((num%i)==0)
            {
                prime = false;
            }
        }
        if(prime?true : false)
            System.out.println("Prime");
        else
            System.out.println("Not prime");
    }

    static void primeBtwnTwoNumbers(int low , int high)
    {
        while(low <high)
        {
            boolean prime = true;

            for(int i=2 ; i<=(low/2) ; i++){
                if(low%i == 0)
                {
                    prime=false;
                    break;
                }
            }
            if(prime && low!=0 && low!=1)
            {
                System.out.println(low);
            }

            low++;
        }
    }

    public static void main(String[] args) {
        numberIsPrimeOrNot(2);
        primeBtwnTwoNumbers(0,3);
    }
}
