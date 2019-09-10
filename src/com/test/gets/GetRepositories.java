package com.test.gets;

import java.io.IOException;
import java.text.MessageFormat;

import org.eclipse.egit.github.core.Repository;
import org.eclipse.egit.github.core.service.RepositoryService;

public class GetRepositories {
	/*
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		final String userName = "bharanikumar2007";
		RepositoryService repService = new RepositoryService();
		repService.getClient().setCredentials("bharanikumar2007", "karuna@143");
		for (Repository repo : repService.getRepositories())
			System.out.println(repo.getName() + " @" + repo.getCreatedAt());
	}
}