import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner mensaje = new Scanner(System.in);

        System.out.println("Dime varios nombre de colores");
        System.out.println("Cuantos me vas a decir?");

        int numColores = mensaje.nextInt();

        //String colores[10];

        ArrayList<String> colores = new ArrayList<String>();

        for (int i = 1; i <= numColores; i++) {
            String color = mensaje.nextLine();
            //int aux = i + 1;
            //colores[i] = color;
            System.out.println("Introduce el color número " + i + " : ");
            //String color = input.next();
            colores.add(color);
        }

        System.out.println("Me has dicho " + numColores + " colores ");

        for (int i = 0; i < colores.size() ; i++) {
            System.out.printf(colores.toString());
        }
    }
}