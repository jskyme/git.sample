package cn.jskyme.office.git.entity;

import java.net.URL;

public class GitHome {
	private String code;
	private String name;
	private URL homeUrl;

	public GitHome(String code, String name) {
		this.code = code;
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public URL getHomeUrl() {
		return homeUrl;
	}

	public void setHomeUrl(URL homeUrl) {
		this.homeUrl = homeUrl;
	}

}
