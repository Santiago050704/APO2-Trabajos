
import java.util.Scanner;
public class Punto6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el primer número.");
        int A = input.nextInt();
        System.out.println("Ingrese el segundo número.");
        int B = input.nextInt();
        int a = A;
        System.out.println(MCD(a,A,B));
    }

    public static int MCD(int a, int A, int B){
        if(B != 0 && A%B == 0){
            System.out.print("El MCD es ");
            return B;
        } else if (A == 0) {
            System.out.print("El MCD es ");
            return B;
        } else if (B == 0) {
            System.out.print("El MCD es ");
            return A;
        }else return MCD(a=A, A=B, B=a%B);
    }
}
