import java.io.InvalidObjectException;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) throws InvalidObjectException {

        try {

            Task task1 = new Task("Compiti",OffsetDateTime.parse("2024-03-01T13:00:00Z"));
            Task task2 = new Task("spesa",OffsetDateTime.parse("2024-02-01T13:00:00Z"));
            Task task3 = new Task("meeting",OffsetDateTime.parse("2024-04-01T13:00:00Z"));

            ToDoList toDoList = new ToDoList();

            toDoList.addToList(task1);
            toDoList.addToList(task2);
            toDoList.addToList(task3);
            System.out.println();
            toDoList.stampaListaTask();
            System.out.println();
            toDoList.removeFromList(task1);
            System.out.println();
            toDoList.stampaListaTask();
            System.out.println();
            toDoList.checkTask(task2);
            System.out.println();
            task2.stampaInfoTask();
            System.out.println();
            toDoList.filtraEventiFuturi();
            System.out.println();
            toDoList.stampaDettaglio();

        } catch (Exception e){
            throw new InvalidObjectException(e.getMessage());
        }


    }
}