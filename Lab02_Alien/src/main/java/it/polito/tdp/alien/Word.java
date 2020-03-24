package it.polito.tdp.alien;

import java.util.LinkedList;
import java.util.List;

public class Word {

	private String alienWord;
	private String translation;
	
	List<String> paroleAliene = new LinkedList<>();
	
	public Word(String alienWord, String translation) {
		this.alienWord = alienWord;
		this.translation = translation;
	}

	public Word(String alienWord) {
		this.alienWord = alienWord;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alienWord == null) ? 0 : alienWord.hashCode());
		result = prime * result + ((paroleAliene == null) ? 0 : paroleAliene.hashCode());
		result = prime * result + ((translation == null) ? 0 : translation.hashCode());
		return result;
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
		if (alienWord == null) {
			if (other.alienWord != null)
				return false;
		} else if (!alienWord.equals(other.alienWord))
			return false;
		if (paroleAliene == null) {
			if (other.paroleAliene != null)
				return false;
		} else if (!paroleAliene.equals(other.paroleAliene))
			return false;
		if (translation == null) {
			if (other.translation != null)
				return false;
		} else if (!translation.equals(other.translation))
			return false;
		return true;
	}

	public void setTranslation(String translation2) {
		this.translation = translation2;
	}

	public String getTranslation() {
		return this.translation;
	}
	
	
	
	
}
