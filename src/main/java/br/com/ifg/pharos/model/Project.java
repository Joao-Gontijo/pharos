package br.com.ifg.pharos.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String projectName;
	private String gitUri;
	private String localPath;
	private String jiraUri;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getGitUri() {
		return gitUri;
	}

	public void setGitUri(String gitUri) {
		this.gitUri = gitUri;
	}

	public String getLocalPath() {
		return localPath;
	}

	public void setLocalPath(String localPath) {
		this.localPath = localPath;
	}

	public String getJiraUri() {
		return jiraUri;
	}

	public void setJiraUri(String jiraUri) {
		this.jiraUri = jiraUri;
	}

}
