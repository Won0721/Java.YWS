package day20.homework.controller;

import java.util.ArrayList;
import java.util.Objects;

import lombok.Data;
@Data
public class Word {
	private String title;
	private ArrayList<String> meanings;
	public Word(String title, String meaning) {
		meanings = new ArrayList<>();
		this.title = title;
		this.meanings.add(meaning);  
	}
	
	public Word(String title) {
		this.title = title;
		this.meanings = new ArrayList<>();
	}
	
	public Word(Word w) {
		this.title = w.title;
		this.meanings = (ArrayList<String>) w.meanings.clone();
	}
	
	public void print() {
		System.out.println();
		System.out.println("[단어 출력]");
		System.out.println("======================");
		System.out.println("영어 : "+ title);
		System.out.println("뜻");
		for(int i = 0; i<meanings.size(); i++) {
			System.out.println((i+1) + ". " + meanings.get(i));
		}
		
		
	}
	
	public void addMeaning(String meaning) {
		meanings.add(meaning);
	}
	
	public void removeMeaning(int num) {
		meanings.remove(num-1);
	}
	
	public void updateMeaning(int num, String meaning) {
		meanings.set(num-1, meaning);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Word other = (Word) obj;
		return Objects.equals(meanings, other.meanings) && Objects.equals(title, other.title);
	}

	@Override
	public int hashCode() {
		return Objects.hash(meanings, title);
	}

	
	
	
	
	
}
