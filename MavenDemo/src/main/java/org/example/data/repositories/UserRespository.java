package org.example.data.repositories;

import org.example.data.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRespository extends JpaRepository<User, Long> {
}
