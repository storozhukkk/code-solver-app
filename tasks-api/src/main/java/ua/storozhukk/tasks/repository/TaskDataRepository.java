package ua.storozhukk.tasks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.storozhukk.tasks.data.TaskData;

import java.util.UUID;

@Repository
public interface TaskDataRepository extends JpaRepository<UUID, TaskData> {
}
