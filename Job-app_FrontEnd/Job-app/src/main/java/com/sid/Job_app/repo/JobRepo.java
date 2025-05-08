package com.sid.Job_app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import  com.sid.Job_app.model.JobPost;


@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer> {

	List<JobPost> findByPostProfileContainingOrPostDescContaining(String postProfile, String postDesc);


}
