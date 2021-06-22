package com.example.blog.repository;

import java.util.Optional;

import com.example.blog.model.ERole;
import com.example.blog.model.Role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(ERole name);
}