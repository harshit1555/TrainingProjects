
package com.example.model;

public class Alien {

	private int aId;
	private String aNAme;
	private String lang;
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getaNAme() {
		return aNAme;
	}
	public void setaNAme(String aNAme) {
		this.aNAme = aNAme;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	@Override
	public String toString() {
		return "Alien [aId=" + aId + ", aNAme=" + aNAme + ", lang=" + lang + "]";
	}
	
}
