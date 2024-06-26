package Kaio.JobToDo.service;

import Kaio.JobToDo.model.Job;
import Kaio.JobToDo.repo.JobRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class JobService {
    private final JobRepo jobRepo;

    @Autowired
    public JobService(JobRepo jobRepo) {
        this.jobRepo = jobRepo;
    }

    public List<Job> findAllJobs(){
        return jobRepo.findAll();
    }

    public Job addJob(Job job){
        job.setJobCode(UUID.randomUUID().toString());
        return jobRepo.save(job);
    }

    public Job updateJob(Job job){
        return jobRepo.save(job);
    }

    public void deleteJob(Long id){
        jobRepo.deleteById(id);
    }
}
