package ua.storozhukk.tasks.service;

import ua.storozhukk.tasks.data.TaskData;
import ua.storozhukk.tasks.dto.TaskDataDto;

public interface TaskDataService {

    TaskData get(String id);

    TaskData create(TaskDataDto taskData);

    TaskData update(String id, TaskDataDto taskData);

    void delete(String id);
}
