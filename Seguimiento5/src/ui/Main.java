import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
//import BST;
public class Main {
    private static Scanner input = new Scanner(System.in);
    static BST tree = new BST();

    public static void main(String[] args) {
        System.out.println("Enter the names in alphabetical order.");
        String names = input.nextLine();
        String[] arrayNames = names.split(" ");
        ArrayList<String> listNames = new ArrayList<String>();
        Collections.addAll(listNames, arrayNames);
        tree.activatePassToTree(listNames);
        System.out.print("The reverse order of the names entered is: "); tree.inOrder();
        System.out.print("\nThe depth of the binary tree is: " + tree.obtainDepth());
    }

}