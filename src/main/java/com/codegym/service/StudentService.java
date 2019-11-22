package com.codegym.service;

import com.codegym.model.Classroom;
import com.codegym.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface StudentService {
    Page<Student> findAll(Pageable pageable);
    Iterable<Student> findAllByClassRoom(Classroom classRoom);
    Page<Student> findAllByClassRoom(Classroom classRoom, Pageable pageable);
    Page<Student> findAllByLastName(String lastName, Pageable pageable);
    Student findById(Long id);
    void save(Student student);
    void remove(Long id);
}
