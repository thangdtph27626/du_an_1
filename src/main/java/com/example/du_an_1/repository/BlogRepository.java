package com.example.du_an_1.repository;

import com.example.du_an_1.model.Blogs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blogs, String> {
}
