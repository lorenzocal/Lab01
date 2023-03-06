package it.polito.tdp.Lab01.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Parole {
	
	private List<String> parole;
		
	public Parole() {
		this.parole = new ArrayList<String>();
	}
	
	public void addParola(String p) {
		parole.add(p);
	}
	
	public void removeParola(String p) {
		parole.remove(p);
	}
	
	public List<String> getElenco() {
		Collections.sort(this.parole);
		return this.parole;
	}
	
	public void reset() {
		this.parole.clear();
	}
	
	public String toString() {
		String s1 = "";
		for (String s : this.parole) {
			s1 = s1 + s + "\n";
		}
		return s1;
	}

}