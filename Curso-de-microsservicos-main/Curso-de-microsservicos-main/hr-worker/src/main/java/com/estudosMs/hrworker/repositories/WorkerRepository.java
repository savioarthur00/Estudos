package com.estudosMs.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudosMs.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
