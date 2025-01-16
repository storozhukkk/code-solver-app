package ua.storozhukk.tasks.data;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
public class TaskData {

    //TODO objectID
    private String id;

    private String name;

    private String description;

    private TaskLanguage language;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaskData taskData = (TaskData) o;
        return Objects.equals(id, taskData.id) &&
                Objects.equals(description, taskData.description) &&
                language == taskData.language;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, language);
    }
}
