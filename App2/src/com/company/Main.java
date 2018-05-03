package com.company;

import java.util.*;

import static java.lang.Math.pow;

public class Main {

    public static int f( int a)
    {
        int b = a;
        int counter, sum = 0;
        LinkedList<Integer> var = new LinkedList<Integer>();

        for(int div = 2; div < (a/2 + 1); div++ )
        {

            counter = 0;
            if (b > 1) {

                while(b % div == 0) {

                    counter++;
                    b = b / div;
                }
                if(counter > 0)
                {
                    var.add(counter);
                }

            }
        }

        Iterator<Integer> listItr = var.iterator();
//        do
//        {
//
//            sum += listItr.next();
//        }
//        while(listItr.hasNext());

        while(listItr.hasNext())
        {
            sum += listItr.next();
        }


            return sum;


    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a;

        do {
            System.out.println("Introduceti un numar de doua cifre: ");
            a = sc.nextInt();
        }
        while(!(a > 1 && a < 100));

        int b = a, numCount = 0;
        while(b > 0)
        {

            numCount++;
            b = b / 10;
        }

        System.out.println(f(a));
        System.out.println(numCount);

        b=a;
        int i = 1, count = 0;
        while(i < numCount + 1)
        {
            int c = 0;
            i++;
            if( f(b) < 1)
            {
                count++;
            }
            c = b % 10;
            b /=10;
            c = (int) (c* pow(10,numCount - 1));
            b = b + c;
        }

        if(count == numCount)
        {
            System.out.println("DA");
        }
        else
        {
            System.out.println("NU");
        }

    }
}
