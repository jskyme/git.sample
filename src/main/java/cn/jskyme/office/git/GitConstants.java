package cn.jskyme.office.git;

import java.util.HashMap;
import java.util.Map;

import cn.jskyme.office.git.entity.GitHome;

public class GitConstants {
	public static Map<String, GitHome> GIT_HOME = new HashMap<String, GitHome>();

	public static Map<String, String> ignoreMap = new HashMap<String, String>();
	static {
		GIT_HOME.put("github", new GitHome("github", "https://github.com"));
		GIT_HOME.put("oschina", new GitHome("oschina", "https://git.oschina.net"));
	}
}
