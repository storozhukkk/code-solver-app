package ua.storozhukk.tasks.service;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ua.storozhukk.tasks.data.TaskData;
import ua.storozhukk.tasks.dto.TaskDataDto;
import ua.storozhukk.tasks.repository.TaskDataRepository;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TaskDataServiceImpl implements TaskDataService {

    private final TaskDataRepository taskRepository;

    @Override
    public TaskData get(String id) {
        return getOrThrow(id);
    }

    @Override
    public TaskData create(TaskDataDto taskData) {
        return null;
    }

    @Override
    public TaskData update(String id, TaskDataDto taskDataDto) {
        TaskData taskData = taskRepository.findById(UUID.fromString(id)).orElseThrow(
                () -> new EntityNotFoundException("Task with id " + id + " not found"));
        taskData.setName(taskDataDto.getName());
        taskData.setDescription(taskDataDto.getDescription());
        taskData.setLanguage(taskDataDto.getLanguage());
        taskData.setTaskFilesPath(taskDataDto.getTaskFilesPath());
        return taskRepository.save(taskData);
    }

    @Override
    public void delete(String id) {
        TaskData taskData = getOrThrow(id);
        taskRepository.delete(taskData);
    }

    private TaskData getOrThrow(String id) {
        return taskRepository.findById(UUID.fromString(id)).orElseThrow(
                () -> new EntityNotFoundException("Task with id " + id + " not found"));
    }
}
