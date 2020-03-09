package com.compliment.server.repository;

import com.compliment.server.entity.Compliment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComplimentRepository extends JpaRepository<Compliment, Long> {
}
