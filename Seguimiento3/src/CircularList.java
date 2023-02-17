public class CircularList {
    private Turn head;
    private Turn currentTurn;
    public void addTurn(Turn turn){
        if(head == null){
            head = turn;
            head.setNext(head);
            head.setPrevious(head);
            currentTurn = head;
        }else{
            Turn tail = head.getPrevious();
            turn.setNext(head);
            head.setPrevious(turn);
            tail.setNext(turn);
            turn.setPrevious(tail);
        }
    }

    public void passTurn(){
        if(currentTurn == null){
            System.out.println("No hay turnos.");
            return;
        }
        if (currentTurn.getNext() != currentTurn){
            currentTurn.setNumberOfPasses(currentTurn.getNumberOfPasses() + 1);
            if(currentTurn.getNumberOfPasses() >= 3){
                if(currentTurn == head){
                    head.getPrevious().setNext(head.getNext());
                    head.getNext().setPrevious(head.getPrevious());
                    currentTurn = head;
                    System.out.println("El turno fue eliminado por haber sido padado 3 veces.");
                }else{
                    currentTurn.getPrevious().setNext(currentTurn.getNext());
                    currentTurn.getNext().setPrevious(currentTurn.getPrevious());
                    currentTurn = currentTurn.getNext();
                    System.out.println("El turno fue eliminado por haber sido pasado 3 veces.");
                }
            }
            currentTurn = currentTurn.getNext();
            System.out.println("El turno fue pasado.");
        }else {
            System.out.println("No hay turnos para pasar.");
        }
    }

    public void deleteTurn(){
        if(currentTurn == currentTurn.getNext()){
            currentTurn = null;
            head = null;
            //System.out.println("El usuario fue atendido. Se acabaron los turnos.");
        }else{
            if(currentTurn == head){
                head.setNext(head.getPrevious());
                head.setPrevious(head.getNext());
                head = head.getNext();
            }
            currentTurn.setNext(currentTurn.getPrevious());
            currentTurn.setPrevious(currentTurn.getNext());
            //System.out.println("El usuario fue añadido, se elimina el turno.");
        }
    }

    public void print(int numberCurrent){
        if(head == null){
            System.out.println("No hay turnos aún.");
        }else{
            System.out.println("Turno " + currentTurn.getNumber());
        }
    }

}
