package br.com.devsuperior.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.devsuperior.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
