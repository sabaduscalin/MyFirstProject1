
        package lab2;
import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
            String myName;
            myName = ("Hello\nCalin.Sabadus");
            System.out.println(myName);
            // 2. Printati rezultatul sumei a doua numere(orice numere)
            System.out.println("Rezultatul este : " + sum(2, 4));
            //3. Printati rezultatul impartirii a doua numere
            System.out.println("Rezultatul este : " + impartire(21, 4));
            // Printati rezultatul urmatoarelor operatiuni:
            //a. -5 + 8 * 6
            System.out.println("Rezultatul este : " + tot(-5, 8, 6));
            // b. (55+9) % 9
            System.out.println("Rezultatul este : " + total(55, 9));
            //c. 20 + -3*5 / 8
            System.out.println("Rezultatul este : " + net(20, -3, 5, 8));
            //d. 5 + 15 / 3 * 2 - 8 % 3
            System.out.println("Rezultatul este : " + tot(5, 15, 3, 2, 8, 3));
            // 2. Scrieti care o metoda java pentru fiecare din urmatoarele operatii matematice: adunare, scadere, inmultire, impartire.
            System.out.println("Rezultatul  este: " + rez(2, 3));
            System.out.println("Rezultatul  este: " + egal(6, 3));
            System.out.println("Rezultatul  este: " + imp(66, 9));
            System.out.println("Rezultatul este : " + inmultire(123456, 654321));
            // Scrieti o metoda java, care sa afiseze urmatorul model:
            System.out.println("   j    a   v     v  a\n   j   a a   v  v   a a\nj  j  aaaaa   v v  aaaaa\n jj  a     a   v  a     a");
            //Scrieti o metoda java, care sa primeasca 3 parametrii de tip numar, si sa returneze media numerelor.
            System.out.println("Media este " + media(10, 8, 4));
            //5.Scrieti o metoda java, care sa afiseze urmatorul model:
            System.out.println("  +'''''+\n[ | o o | ]\n  |  ^  |\n  | ,_, |\n  +_____+");
            //6.Scrieti o metoda java, care sa returneze restul impartirii a doua numere
            System.out.println(impartire(21, 3));
            //7.Scrieti o metoda java, care sa primeasca ca si parametru un numar, care sa
            // reprezinte temperatura in Fahrenheit, si sa returneze temperatura
            // in Celsius. Formula de calcul este: C = 5/9 * (F -32)
            double fahranheit, formula, celsius;
            fahranheit = 120;
            celsius = ((fahranheit - 32) * 5 / 9);
            System.out.println("120 F repreinta "+ celsius+" C");
            //8.Scrieti o metoda java, care sa primeasca ca si parametru un numar real,
            // care sa reprezinte distanta in inch, si sa returneze distanta in metrii
            double inch, metri, rate;
            rate = 0.02540000;
            inch = 100;
            System.out.println();
            metri = rate * inch;
            System.out.println("100 inch este egal cu "+ metri +" metri");
            //9.Scrieti o metoda java, care primeste distanta (in metrii) si timpul (ca si 3 numere: ore, minute, secunde)
            // , si afiseaza viteza, in metrii pe secunda, kilometrii pe ora si mile pe ora. (Indiciu: 1 mila = 1609 metrii)
        }
        public static double impartire(double a, double b) {
            double impartire = a / b;
            return impartire;
        }
        public static double media(double a, double b, double c) {
            double media = (a + b + c) / 3;
            return media;
        }
        public static double tot(double a, double b, double c, double d, double e, double f) {
            double tot = a + b / c * d - e * f;
            return tot;
        }
        public static int net(int a, int b, int c, int d) {
            int net = a + b * c / d;
            return net;
        }
        public static int total(int a, int b) {
            int total = (a + b) % b;
            return total;
        }
        public static int tot(int a, int b, int c) {
            int tot = a + b * c;
            return tot;
        }
        public static int suma(int a, int b) {
            int suma = a + b;
            return suma;
        }
        public static int sum(int a, int b) {
            int sum = a + b;
            return sum;
        }
        public static int rez(int a, int b) {
            int rez = a + b;
            return rez;
        }
        public static int egal(int a, int b) {
            int egal = a - b;
            return egal;
        }
        public static double imp(double a, double b) {
            double imp = a / b;
            return imp;
        }
        public static long inmultire(long a, long b) {
            long inmultire = a * b;
            return inmultire;
        }
    }


