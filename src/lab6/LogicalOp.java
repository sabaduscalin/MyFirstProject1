package lab6;
import java.util.*;
public class LogicalOp {
    private List<Integer> myList;
    //Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze, pe rand,
// toate valorile din lista, fiecare pe rand nou.
    public void printList(List<Integer> myList) {
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }
    //Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru sa fie o lista de numere,
    // si celalalt un numar (real sau intreg). Metoda sa adauge numarul primit ca si parametru
    // la final de lista.
    public void finalList(List<Integer> myList, int x) {
        myList.add(x);
        System.out.println(myList);
    }
    //Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru de tip Lista,
    // iar celalalt un numar intreg. Sa se parcurga lista si sa afiseze,
    // pe rand, toate valorile din lista, fiecare pe rand nou, pornind de la numarul
    // intreg primit ca si parametru
    public void stepBystep(List<Integer> myList, int x) {
        for (int i = x; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }
    //Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze,
    // pe rand, toate valorile din lista, dar invers(de la capat la inceput).
    public void invers(List<Integer> myList) {
        for (int i = myList.size() - 1; i >= 0; i--) {
            System.out.println(myList.get(i));
        }
    }
    //Scrieti o metoda Java, care sa primeasca trei parametrii: unul de tip Lista de String-uri,
// unul de tip intreg, si unul de tip String. Metoda sa adauge parametrul de tip String in
// lista primita, iar parametrul de tip intreg reprezinta pozitia la care sa fie pus acel String.
    public void trei(List<String> myList2, int x, String y) {
        myList2.add(x, y);
        for (int i = 0; i < myList2.size(); i++)
            System.out.println(myList2.get(i));
    }
    //Scrieti o metoda Java, care sa primeasca doi parametrii.
// Primul dintre ei va fi o Lista, iar metoda sa ia al doilea parametru si
// sa il adauge pe prima pozitie din lista.
    public void doiParametri(List<Integer> myList, int x) {
        myList.add(0, x);
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }
    //Scrieti o metoda Java care sa primeasca parametru o Lista, si sa afiseze ce valori are lista,
// si ce pe ce pozitie. (Ex: “Pe pozitia 1 valoare este 4”).
    public void valori(List<Integer> myList) {
        for (int i = 0; i < myList.size(); i++) {
            // System.out.println(myList);
        }
    }
    //Scrieti o metoda Java care sa primeasca o Lista si sa returneze cel mai mare numar din ea.
    public List returList(List<Integer> myList) {
        int mare = Integer.MAX_VALUE;
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i) > mare) {
                mare = myList.get(i);
            }
        }
        System.out.println(" ");
        return null;
    }
    //Scrieti o metoda Java care sa schimbe pozitia a doua elemente intr-o Lista,
    public void schimba(List<Integer> myList) {
        myList.set(0, 555);
        myList.set(6, 11);
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }
    //Scrieti o metoda Java care sa primeasca o Lista si sa returneze
// o alta lista, care sa contina doar numerele pare din lista primita.
    public List pare(List<Integer> myList) {
        for (int i = 0; i <= myList.size(); i++) {
            if (i % 2 == 0) {
                System.out.println(myList.get(i));
            }
        }
        return null;
    }
}
