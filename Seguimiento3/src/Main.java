import java.util.Scanner;
public class Main {

    private static Scanner input = new Scanner(System.in);

    private static int numberTurn = 1;
    static CircularList circular = new CircularList();

    public static void main(String[] args) {
        int option = 0;
        do{
            option = getOptionMenu();
            excecuteOption(option);

        }while(option != 0);
        input.close();
    }

    public static int getOptionMenu(){
        int option = 0;
        System.out.println("¿Qué desea hacer?");
        System.out.println(
                "1. Dar turno. \n" +
                        "2. Mostrar turno actual. \n" +
                        "3. Pasar turno. \n" +
                        "4. Seguir."
        );
        option = input.nextInt();
        return option;
    }

    public static void excecuteOption(int option){
        switch (option){
            case 1:
                System.out.println("Dar turno.");
                circular.addTurn(new Turn(numberTurn));
                numberTurn++;
                System.out.println("El turno se añadió correctamente.");
                break;

            case 2:
                System.out.println("Mostrar turno actual.");
                System.out.print("El turno actual es: "); circular.print(numberTurn);
                break;

            case 3:
                System.out.println("Pasar turno.");
                circular.passTurn();
                //System.out.println("El turno fue pasado.");
                break;

            case 4:
                System.out.println("Seguir.");
                circular.deleteTurn();
                System.out.println("El usuario fue atendido.");
                break;

            default:
                System.out.println("Opción no válida.");
                break;
        }
    }


}