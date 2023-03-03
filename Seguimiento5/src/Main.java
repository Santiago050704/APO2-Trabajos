import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
//import BST;
public class Main {
    private static Scanner input = new Scanner(System.in);
    static BST tree = new BST();

    public static void main(String[] args) {
        System.out.println("Ingrese los nombres en orden alfabético.");
        String names = input.nextLine();
        String[] array = names.split(" ");
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, array);
        addArray(list);
    }

    public static void addArray(ArrayList<String> list){
        ArrayList<String> arrLeft = new ArrayList<String>();
        ArrayList<String> arrRight = new ArrayList<String>();
        int midPoint = list.size()/2;
        if(midPoint == 0){
            return;
        }
        for(int i = 0; i < midPoint; i++){
            arrLeft.add(list.get(i));
            addArray(arrLeft);
        }
        for(int i = midPoint + 1; i <= list.size() - 1; i++){
            arrRight.add(list.get(i));
            addArray(arrRight);
        }
    }

    public static void passToTree(){

    }

}