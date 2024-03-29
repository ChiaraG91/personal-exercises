package com.esercizio.taskbusinesslogic.controllers;

import com.esercizio.taskbusinesslogic.entities.Task;
import com.esercizio.taskbusinesslogic.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping("/addtask")
    public ResponseEntity<Task> addTask(@RequestBody Task task){
         Task taskEx = taskService.addTask(task);
        return ResponseEntity.ok().body(taskEx);
    }

    @GetMapping("/showlist")
    public ResponseEntity<List<Task>> showTaskList(){
        List<Task> allTasks= taskService.getAllTasks();
        return ResponseEntity.ok().body(allTasks);
    }

    @GetMapping("/showtask/{id}")
    public ResponseEntity<Optional<Task>> showTask(@PathVariable Long id){
        Optional<Task> taskOptional = taskService.getTask(id);
        return ResponseEntity.ok().body(taskOptional);
    }

    @DeleteMapping("/deletetask")
    public ResponseEntity<Optional<Task>> deleteTask(@RequestParam Long id){
        Optional<Task> taskDaCancellare = taskService.deleteTask(id);
        if(taskDaCancellare.isPresent()){
            return ResponseEntity.ok().body(taskDaCancellare);
        }
        return ResponseEntity.notFound().build();

    }

    @PutMapping("/updatetask/{id}")
    public ResponseEntity<Task> updateTaskCompletion(@RequestBody Task task,@PathVariable Long id){
        Optional<Task> taskOPT = taskService.updateTask(id,task);
        if(taskOPT.isPresent()){
            return ResponseEntity.ok().body(taskOPT.get());
        }
        return ResponseEntity.notFound().build();
    }




}
