
import java.util.*;

public class MainClass {

    public static int sub(List<Integer> v, int n, int a) {

        int counter = 0;


        for (Integer val : v) {
            if (val == a) {
                counter++;
            }
        }

        return counter;
    }

    public static void main(String[] args) {

        System.out.println("Incepe...");

        int n, a,result = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Citire n...");

        do {
            n = sc.nextInt();
        }
        while (!(n <= 100 && n > 0));

        System.out.println("Citire a");

        do {
            a = sc.nextInt();

        }
        while (!(a > -10000 && a < 10000));

        System.out.println("Adaugare valori: ");

        List<Integer> v;
        v = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            do {
                v.add(sc.nextInt());
            }
            while (!(v.get(i) > -10000 && v.get(i) < 10000));
        }
        result = sub(v, n, a);

        System.out.println(result);


    }

}
