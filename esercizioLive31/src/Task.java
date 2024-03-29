import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Task {

    private String description;
    private boolean completed;
    private OffsetDateTime expiration;

    public Task(String description, OffsetDateTime expiration) {
        this.description = description;
        this.completed = false;
        this.expiration = expiration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public OffsetDateTime getExpiration() {
        return expiration;
    }

    public void setExpiration(OffsetDateTime expiration) {
        this.expiration = expiration;
    }

    @Override
    public String toString() {
        return "Task{" +
                "description='" + description + '\'' +
                ", completed=" + completed +
                ", expiration=" + expiration +
                '}';
    }

    public void stampaInfoTask(){
        System.out.println("Task: " + description + " - " + completed + " - " + expiration.format(DateTimeFormatter.ofPattern("dd/MM/yyyy-HH:mm")));
    }
}
