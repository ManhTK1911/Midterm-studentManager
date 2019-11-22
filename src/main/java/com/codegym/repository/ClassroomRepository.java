package com.codegym.repository;

import com.codegym.model.Classroom;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ClassroomRepository extends PagingAndSortingRepository<Classroom, Long> {
}
