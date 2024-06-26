package Kaio.JobToDo.repo;

import Kaio.JobToDo.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepo extends JpaRepository<Job, Long> {
}
