import java.util.ArrayList;
import java.util.Scanner;
public class Punto7 {
    public static final int[] money = {100000, 50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50};
    public static ArrayList<Integer> valor = new ArrayList<Integer>();
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el valor que desea alcanzar.");
        int value = input.nextInt();
        int sum = 0;
        int i = 0;
        int dif = value;
        System.out.println(getMoney(value, sum, i, dif));
    }

    public static ArrayList<Integer> getMoney(int value, int sum, int i, int dif){
        if(sum >= value){
            System.out.print("Los valores que permiten alcanzar el valor ingresado son: ");
            return valor;
        }
        if (dif >= money[i]){
            valor.add(money[i]);
            sum += money[i];
            dif -= money[i];
        }else{
            i++;
        }
        return getMoney(value, sum, i, dif);
    }
}
