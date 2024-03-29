package com.esercizio.taskbusinesslogic.services;

import com.esercizio.taskbusinesslogic.entities.Task;
import com.esercizio.taskbusinesslogic.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public Task addTask(Task task){
        Task newTask = taskRepository.save(task);
        return newTask;
    }


    public List<Task> getAllTasks() {
        List<Task> taskList = taskRepository.findAll();
        return taskList;
    }

    public Optional<Task> getTask(Long id) {
        Optional<Task> taskOptional = taskRepository.findById(id);
        return taskOptional;
    }
    public Optional<Task> updateTask(Long id, Task task){
        Optional<Task> taskDaAggiornare = taskRepository.findById(id);
        if (taskDaAggiornare.isPresent()){
            taskDaAggiornare.get().setTitle(task.getTitle());
            taskDaAggiornare.get().setDescription(task.getDescription());
            taskDaAggiornare.get().setDueDate(task.getDueDate());
            taskDaAggiornare.get().setCompleted(task.isCompleted());
            taskRepository.save(taskDaAggiornare.get());
        } else {
            return Optional.empty();
        }
        return taskDaAggiornare;
    }


    public Optional<Task> deleteTask(Long id){
        Optional<Task> taskDaCancellare = taskRepository.findById(id);
        if(taskDaCancellare.isPresent()){
            taskRepository.delete(taskDaCancellare.get());
            return taskDaCancellare;
        }else{
            return Optional.empty();
        }

    }

    public long calculateTimeRemaining(Task task) {
        LocalDate dueDate = task.getDueDate();
        LocalDate currentDate = LocalDate.now();
        if (dueDate.isBefore(currentDate)) {
            return 0;
        } else {
            return ChronoUnit.DAYS.between(currentDate, dueDate);
        }
    }

    public void markTasksAsLate() {
        List<Task> tasks = taskRepository.findAll();
        LocalDate currentDate = LocalDate.now();

        for (Task task : tasks) {
            if (!task.isCompleted() && task.getDueDate().isBefore(currentDate))
            {
                task.setLate(true);
                taskRepository.save(task);
            }
        }
    }


}
