package com.dinesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import com.dinesh.modal.Project;
@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer>{

	public Project findById(int id);

}
