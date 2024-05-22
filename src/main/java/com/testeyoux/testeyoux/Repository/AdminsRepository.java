package com.testeyoux.testeyoux.Repository;

import com.testeyoux.testeyoux.Entity.Admins;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminsRepository extends JpaRepository<Admins, Long> {

}
