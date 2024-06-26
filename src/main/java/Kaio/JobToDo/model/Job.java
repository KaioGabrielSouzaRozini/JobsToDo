package Kaio.JobToDo.model;


import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Job implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String data;
    @Column(nullable = false, updatable = false)
    private String jobCode;

    public Job() {
    }

    public void setJobCode(String jobCode) {
        this.jobCode = jobCode;
    }

    public Job(Long id, String name, String description, String data, String jobCode) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.data = data;
        this.jobCode = jobCode;
    }
    public String getJobCode() {
        return jobCode;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Job{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}