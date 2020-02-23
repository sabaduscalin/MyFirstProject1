
package com.company;

public class Main {
    public static void main(String[] args) {
        {
            // write your code here
            //1. Printati "Hello" in consola, iar pe rand nou, printati numele vostru.
            System.out.println("Hello");
            System.out.println("Calin.Sabadus");
            // 2. Printati rezultatul sumei a doua numere(orice numere)
            int a = 2;
            int b = 4;
            int sum = a + b;
            System.out.println(sum);
            //3. Printati rezultatul impartirii a doua numere
            float x = 21;
            int y = 4;
            float tot = x / y;
            System.out.println(tot);
            // Printati rezultatul urmatoarelor operatiuni:
            //
            //a. -5 + 8 * 6
            int d = -5;
            int e = 8;
            int f = 6;
            int rez = d + e * f;
            System.out.println(rez);
            // b. (55+9) % 9
            int w = 55;
            int q = 9;
            int cat = w + q;
            int suma = cat % +q;
            System.out.println(suma);
            //c. 20 + -3*5 / 8
            int t = 20;
            int u = -3;
            int i = 5;
            int o = 8;
            int dog = t + u * i / o;
            System.out.println(dog);
            //d. 5 + 15 / 3 * 2 - 8 % 3
            int m = 15;
            int n = 3;
            int v = 2;
            int cant = (i + m / n * v - o % +n);
            System.out.println(cant);
            int l = 1;
            int k = 2;
            boolean j = l < k;
            System.out.println(j);
            float h = 10000000;
            float g = h + k;
            boolean p = g > k;
            System.out.println(h);
            System.out.println(k);
            System.out.println(p);
            for (int we = 0; we < 5; we++) {
                System.out.println("printeaza de 5 ori");
            }
//Afisaza numerele de la 1 la 10 pe rand diferit
            for (int we = 1; we <= 10; we++) {
                System.out.println(we);
            }
        }
    }
}


