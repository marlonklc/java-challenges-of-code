package com.spoj.divsum;

import java.util.Scanner;
import java.util.Vector;

public class Main {

    static Vector fatoresPrimos = new Vector();
    static Vector divisores = new Vector();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int input1 = scanner.nextInt();
            int input2 = scanner.nextInt();
            fatoresPrimos.clear();
            divisores.clear();
            divisores.add(1); // sempre o 1 vai ser divisor

            System.out.println(input1 + input2);

            listaPessoas.size()

            //decompoeFatoresPrimos(input);
            //contraDivisores(input);
            //somaDivisores();
            //System.err.println(input);
            //strategyWork(input);
            //strategy2(input);


        }
    }

    private static void somaDivisores() {
        int sum = 0;
        for (Object o : divisores) {
            sum += (int) o;
        }

        System.out.println(sum);
    }

    private static void encontraDivisores(int input) {
        for (Object o : fatoresPrimos) {
            int size = divisores.size();
            for (int x = 0; x < size; x++) {
                //System.out.println("divisores(" + x + ") -> " +divisores.get(x));
                //System.out.println("fator " +o);
                int result = (int) o * (int) divisores.get(x);
                if (result < input && !divisores.contains(result)) {
                    divisores.add(result);
                    //System.out.println(" resultado -> " + result);
                }
            }
        }
    }

    public static void decompoeFatoresPrimos(int input) {
        int factor = 2;
        while (input> 1) {
            if (input % factor == 0) {
                //System.out.println(input + " / " + factor);
                fatoresPrimos.add(factor);
                input /= factor;
            } else {
                factor++;
            }
        }
    }
}
