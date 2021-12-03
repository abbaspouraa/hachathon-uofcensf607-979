package com.ENSF607.AnimalProject.repository;

import com.ENSF607.AnimalProject.model.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends PagingAndSortingRepository<User, Integer> {

//    Optional<User> findBylName(String name);
//    Optional<User> findByfName(String name);



//    List<User> findByRole(String role);

    List<User> findAll();
    User findByuserid(Long userid);
    User findByuseridAndPassword(Long userid, String pass);
    
    User findByfnameAndPassword(String fname, String pass);

//    Page<User> findAll(Pageable pageable);
}
