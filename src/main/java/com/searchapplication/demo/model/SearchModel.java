package com.searchapplication.demo.model;



import javax.validation.constraints.NotEmpty;
import java.io.Serializable;


public class SearchModel implements Serializable{

	@NotEmpty
	private String keyword;
	@NotEmpty
	private String url;
	
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SearchModel [keyword=");
		builder.append(keyword);
		builder.append(", url=");
		builder.append(url);
		builder.append("]");
		return builder.toString();
	}
		

}
