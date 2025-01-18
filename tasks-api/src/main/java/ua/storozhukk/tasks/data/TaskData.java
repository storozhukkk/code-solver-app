package ua.storozhukk.tasks.data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;
import java.util.UUID;

import static jakarta.persistence.GenerationType.UUID;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class TaskData {

    @Id
    @GeneratedValue(strategy = UUID)
    private UUID id;

    private String name;

    private String description;

    private TaskLanguage language;

    private UUID authorID;

    /** path to project directory, where tests are stored */
    private String taskFilesPath;

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
