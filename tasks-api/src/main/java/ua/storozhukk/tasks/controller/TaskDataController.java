package ua.storozhukk.tasks.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.storozhukk.tasks.dto.TaskDataDto;

@RequestMapping
@RestController("/api/v1/tasks")
public class TaskDataController {

    @GetMapping("/{id}")
    public TaskDataDto getTaskData(@PathVariable String id) {
        return null;
    }

    @PostMapping
    public TaskDataDto createTaskData(TaskDataDto taskDataDto) {
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteTaskData(@PathVariable String id) {
    }

    @PutMapping("/{id}")
    public TaskDataDto updateTaskData(@PathVariable String id, @RequestBody TaskDataDto taskDataDto) {
        return null;
    }
}
