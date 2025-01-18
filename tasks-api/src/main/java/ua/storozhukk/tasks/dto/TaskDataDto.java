package ua.storozhukk.tasks.dto;

import lombok.Getter;
import lombok.Setter;
import ua.storozhukk.tasks.data.TaskLanguage;

@Getter
@Setter
public class TaskDataDto {

    private String id;

    private String name;

    private String description;

    private TaskLanguage language;

    private String authorID;

    private String taskFilesPath;
}
