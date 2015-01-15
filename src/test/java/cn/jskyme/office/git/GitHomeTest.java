package cn.jskyme.office.git;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.junit.After;
import org.junit.Before;

public class GitHomeTest {

	@Before
	public void setUp() {
	}

	public static Test suite() {
		return new TestSuite(GitHomeTest.class);
	}

	public void testGitHom_GitHub() {
		String gitPro="https://github.com/jskyme/shopizer.git";
		// assertTrue( true );
	}

	@After
	public void tearDown() {

	}
}
