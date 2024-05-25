package com.testeyoux.testeyoux.Repository;

import com.testeyoux.testeyoux.Entity.Admins;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdminsRepository extends JpaRepository<Admins, Long> {
    Optional<Admins> findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
}
