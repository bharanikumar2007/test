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
		for (Repository repo : repService.getRepositories(userName))
			System.out.println(repo.getName() + " @" + repo.getCreatedAt());
	}
}