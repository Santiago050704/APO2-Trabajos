import java.util.Scanner;
public class Main {
    private Scanner input;
    private static LinkedList linkedList;

    public Main(){
        input = new Scanner(System.in);
    }
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println("Ingrese el nombre del jugador.");
        String name = main.input.next();
        System.out.println("Ingrese la cantidad de preguntas que va a responder.");
        int totalQuestionsChosed = main.input.nextInt();
        linkedList = new LinkedList(name, totalQuestionsChosed);
        main.linkedList.print();
    }

}