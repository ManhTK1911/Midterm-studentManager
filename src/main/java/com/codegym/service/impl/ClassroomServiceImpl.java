package com.codegym.service.impl;

import com.codegym.model.Classroom;
import com.codegym.repository.ClassroomRepository;
import com.codegym.service.ClassroomService;
import org.springframework.beans.factory.annotation.Autowired;

public class ClassroomServiceImpl implements ClassroomService {

    @Autowired
    private ClassroomRepository classroomRepository;
    @Override
    public Iterable<Classroom> findAll() {
        return classroomRepository.findAll();
    }

    @Override
    public Classroom findById(Long id) {
        return classroomRepository.findOne(id);
    }

    @Override
    public void save(Classroom classroom) {
        classroomRepository.save(classroom);
    }

    @Override
    public void remove(Long id) {
        classroomRepository.delete(id);
    }
}
