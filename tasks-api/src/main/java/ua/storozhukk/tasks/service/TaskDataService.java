package ua.storozhukk.tasks.service;

import ua.storozhukk.tasks.data.TaskData;

public interface TaskDataService {

    TaskData get(String id);

    TaskData create(TaskData taskData);

    TaskData update(TaskData taskData);

    void delete(String id);
}
