package com.felix.vaadintesttask.repository;

import com.felix.vaadintesttask.model.Num;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NumRepository extends JpaRepository<Num, Long> {
}
