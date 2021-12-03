package br.com.ifg.pharos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ifg.pharos.model.Project;
import br.com.ifg.pharos.repository.ProjectRepository;

@RestController
public class ProjectController {

	@Autowired
	private ProjectRepository projectRepository;

	@GetMapping("/projects")
	public List<Project> lista() {
		List<Project> listaProjetos = projectRepository.findAll();
		return listaProjetos;
	}
}
