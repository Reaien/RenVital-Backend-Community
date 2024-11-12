package com.example.renvitalbackend.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.renvitalbackend.Entities.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{

}
