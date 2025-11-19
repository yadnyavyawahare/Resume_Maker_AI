package com.example.resume.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.resume.model.Resume;
import com.example.resume.repository.ResumeRepository;

@Service
public class ResumeService {

    @Autowired
    private ResumeRepository resumeRepository;

    public Resume save(Resume resume) {
        return resumeRepository.save(resume);
    }

    public List<Resume> findAll() {
        return resumeRepository.findAll();
    }
}


