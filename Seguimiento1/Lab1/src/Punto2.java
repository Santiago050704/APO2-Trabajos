import java.util.Scanner;
public class Punto2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Vamos a ver si funciona acá...");
        System.out.println("Ingrese una palabra.");
        String str = input.next();
        System.out.println(reverseString(str));
    }
    public static String reverseString(String str){
        if(str.length() == 1){
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}
