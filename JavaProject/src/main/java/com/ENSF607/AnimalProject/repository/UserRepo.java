package com.ENSF607.AnimalProject.repository;

import com.ENSF607.AnimalProject.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepo extends PagingAndSortingRepository<User, Long> {

//    Optional<User> findByuserId(Long aLong);

    Optional<User> findBylName(String name);
    Optional<User> findByfName(String name);



    List<User> findByRole(String role);

    List<User> findAll();

    Page<User> findAll(Pageable pageable);
}
