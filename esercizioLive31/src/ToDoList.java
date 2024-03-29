import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

public class ToDoList {

    List<Task> toDoList;

    public ToDoList() {
        this.toDoList = new ArrayList<>();
    }

    public List<Task> getToDoList() {
        return toDoList;
    }
    public void setToDoList(List<Task> toDoList) {
        this.toDoList = toDoList;
    }

    public void addToList(Task task) throws Exception {
        if (!toDoList.contains(task)) {
            toDoList.add(task);
        } else {
            throw new Exception("Il task è già presente");
        }

    }

    public void removeFromList(Task task) {
        toDoList.remove(task);
        System.out.println("Il task è stato rimosso");
    }

    public void stampaListaTask() {
        System.out.println();
        System.out.println("Lista dei task:");
        for (Task task : toDoList) {
            task.stampaInfoTask();
        }

    }

    public void checkTask(Task task) {
        task.setCompleted(true);
    }

    public ArrayList<Task> filtraEventiFuturi() {
        OffsetDateTime now = OffsetDateTime.now();
        OffsetDateTime afterTwoDays = now.plusDays(2);
        ArrayList<Task> eventiFuturi = new ArrayList<>();
        for (Task task : toDoList) {
            if (task.getExpiration().isAfter(now) && task.getExpiration().isBefore(afterTwoDays)) {
                eventiFuturi.add(task);
                task.stampaInfoTask();

            }
        }
        return eventiFuturi;
    }

    public void stampaDettaglio(){
        for(Task task : toDoList){
            System.out.println(task.getDescription());
        }
    }
}
