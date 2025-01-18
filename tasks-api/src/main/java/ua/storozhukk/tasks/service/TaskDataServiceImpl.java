package ua.storozhukk.tasks.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ua.storozhukk.tasks.data.TaskData;
import ua.storozhukk.tasks.repository.TaskDataRepository;

@Service
@RequiredArgsConstructor
public class TaskDataServiceImpl implements TaskDataService {

    private final TaskDataRepository taskRepository;

    @Override
    public TaskData get(String id) {
        return null;
    }

    @Override
    public TaskData create(TaskData taskData) {
        return null;
    }

    @Override
    public TaskData update(TaskData taskData) {
        return null;
    }

    @Override
    public void delete(String id) {
    }

}
