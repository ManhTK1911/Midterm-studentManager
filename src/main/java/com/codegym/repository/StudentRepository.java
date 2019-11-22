package com.codegym.repository;

import com.codegym.model.Classroom;
import com.codegym.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface StudentRepository extends PagingAndSortingRepository<Student, Long> {
    Iterable<Student> findAllByClassRoom(Classroom classRoom);
    Page<Student> findAllByClassRoom(Classroom classRoom, Pageable pageable);
    Page<Student> findAllByLastName(String lastName, Pageable pageable);
}
