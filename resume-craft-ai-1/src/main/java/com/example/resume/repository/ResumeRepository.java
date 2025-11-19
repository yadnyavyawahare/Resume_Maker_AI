package com.example.resume.repository;

import com.example.resume.model.Resume;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ResumeRepository extends JpaRepository<Resume, Long> {

	}
