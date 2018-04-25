package com.company;

import java.util.*;

public class Main {

    public static int f(int a)
    {
        int b = a;
        int counter, sum = 0;
        LinkedList<Integer> var = new LinkedList<Integer>();

        for(int div = 2; div < (a/2); div++ )
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
        do
        {

            sum = sum + listItr.next();
        }
        while(listItr.hasNext());

        return sum;
    }

    public static void main(String[] args) {

        int a = 90;

        System.out.println("functia returneaza: " + f(a));
        //Daca functia e corecta returneaza 4 pt 90;
    }
}
