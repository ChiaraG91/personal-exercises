import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ToDoListTest {


    @Test
    void filtraEventiFuturi() throws Exception {
        OffsetDateTime now = OffsetDateTime.now();
        OffsetDateTime afterTwoDays = now.plusDays(2);

        Task task1 = new Task("Compiti",OffsetDateTime.parse("2024-03-01T13:00:00Z"));
        Task task2 = new Task("spesa",OffsetDateTime.parse("2024-02-01T13:00:00Z"));

        ToDoList toDoList = new ToDoList();

        toDoList.addToList(task1);
        toDoList.addToList(task2);

        ArrayList<Task> eventiFuturi = new ArrayList<>();

        assertEquals(toDoList.getToDoList().size(), eventiFuturi.size());

    }
}