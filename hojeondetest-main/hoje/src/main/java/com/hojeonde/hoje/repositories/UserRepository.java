package com.hojeonde.hoje.repositories;

import com.hojeonde.hoje.models.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
