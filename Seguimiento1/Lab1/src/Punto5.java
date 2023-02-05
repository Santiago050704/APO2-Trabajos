import java.util.Scanner;
public class Punto5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el dividendo.");
        int a = input.nextInt();
        System.out.println("Ingrese el divisor.");
        int b = input.nextInt();
        int i = 0;
        System.out.println(div(a, b, i));
    }

    public static int div(int a, int b, int i){
        if(a < b){
            System.out.print("El resultado de la división es " + i + " y su residuo es ");
            return a;
        } else if (b == 0) {
            System.out.print("La división entre 0 no está definida.");
            return -1;
        }else return div(a-b, b, i+1);
    }
}
