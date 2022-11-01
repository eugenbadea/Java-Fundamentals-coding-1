



import java.util.ArrayList;
import java.util.Scanner;
public class AlgExtra1 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(2);
        numbers.add(10);
        numbers.add(9);
        numbers.add(1);

        //Se da o lista de numere
        //Trebuie sa adunam toate numerele din lista
        //Insa sa le adunam numai pe acelea care sunt mai mari decat toate numerele din dreapta
        //Exemplu 2 - nu este eligibil de adunare
        // 10 este eligibil de adunare
        // 9 este eligibil de adunare


         int numarDeComparat = numbers.get(0);
         int suma = 0;
         for (int i= 0;i < numbers.size() - 1;i++ ) {
             boolean toBeAdded = true;
             for(int k = 1;k<= numbers.size();k++) {
                 if( numbers.get(i)< numbers.get(k)) {
                     toBeAdded = false;
                 }
             }
             if(toBeAdded) {
                 suma = suma + numbers.get(i);
             }
         }
        System.out.println(suma);
    }
}
