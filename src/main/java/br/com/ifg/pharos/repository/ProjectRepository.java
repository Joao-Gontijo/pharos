package br.com.ifg.pharos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ifg.pharos.model.Project;

public interface ProjectRepository extends JpaRepository<Project, Long>{

}
