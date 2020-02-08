
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Book extends JFrame {
	
	 ArrayList <Book> A=new ArrayList <Book>();
		private String isbn;
		private String title;
		private String author;
		private int edition;
		private int publishedYear;
		private boolean borrowed;
        
	public Book() {
	
	}
	public void setIsbn(String ISBN) {
		isbn=ISBN;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setTitle(String Title) {
		title=Title;
	}
	public String getTitle() {
		return title;
	}
	public void setAuthor(String Author) {
		author=Author;
	}
	public String getAuthor() {
		return author;
	}
	public void setEdition(int Edition) {
		edition=Edition;
	}
	public int getEdition() {
		return edition;
	}
	public void setPublishedYear(int PublishedYear) {
		publishedYear=PublishedYear;
	}
	public int getPublishedYear() {
		return publishedYear;
	}
	public void setBorrowed(boolean Borrowed) {
		borrowed=Borrowed;
	}
	public boolean getBorrowed() {
		return borrowed;
	}
	
}
