package com.ibrahim.conferencedemo.repositories;

import com.ibrahim.conferencedemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
