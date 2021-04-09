package com.ibm.MySqlDemo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.MySqlDemo.entity.User;

public interface UserRepository extends JpaRepository<User,Integer>{

}
