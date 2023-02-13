import java.util.Scanner;
public class Main {
    private static Scanner input = new Scanner(System.in);
    private static LinkedList linkedList;

    public static void main(String[] args) {
        initLinkedList();
    }
    public static void initLinkedList(){
        System.out.println("Ingrese el nombre del jugador.");
        String name = input.next();
        System.out.println("Ingrese la cantidad de preguntas que quiere responder.");
        int totalQuestionsChosed = input.nextInt();
        linkedList = new LinkedList(name, totalQuestionsChosed);
        //linkedList.print();
        linkedList.answerQuestion();
    }

}