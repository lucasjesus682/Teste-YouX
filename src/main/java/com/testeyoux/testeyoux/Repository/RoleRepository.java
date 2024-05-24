package com.testeyoux.testeyoux.Repository;

import com.testeyoux.testeyoux.Entity.Erole;
import com.testeyoux.testeyoux.Entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByUsername(Erole name);
}
