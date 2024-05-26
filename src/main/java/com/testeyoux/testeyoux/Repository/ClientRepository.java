package com.testeyoux.testeyoux.Repository;

import com.testeyoux.testeyoux.Entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
