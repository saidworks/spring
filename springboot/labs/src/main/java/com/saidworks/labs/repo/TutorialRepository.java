package com.saidworks.labs.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saidworks.labs.models.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
	List<Tutorial> findByPublished(boolean published);
}
