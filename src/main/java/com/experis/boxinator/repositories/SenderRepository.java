package com.experis.boxinator.repositories;

import com.experis.boxinator.models.Sender;
import com.experis.boxinator.models.enums.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SenderRepository extends JpaRepository<Sender, Long> {
    Optional<Sender> findByEmail(String email);
    Optional<Sender> findByRole(Role role);
}
