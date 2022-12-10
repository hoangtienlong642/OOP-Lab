package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
    private List<String> authors = new ArrayList<String>();

    public Book(String id, String title, float cost) {
		super(id, title, cost);
	}
	
	public Book(String id, String title, String category, float cost) {
		super(id, title, category, cost);
	}
	
	public Book(String id, String title, String category, float cost, ArrayList<String> authors) {
		super(id, title, category, cost);
		if(authors.size() != 0) {
			this.authors = authors;
		}else {
			System.out.println("Authors list is empty!");
		}
	}
	

	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
    public void addAuthor(String authorName){
        if(!(authors.contains(authorName))){
            authors.add(authorName);
        }
    }
    public void removeAuthor(String authorName){
        if(authors.contains(authorName)){
            authors.remove(authorName);
        }
    }
	// public void printDetail() {
    //     System.out.format("Book detail:\n"
    //                         + "Title: %s\n"
    //                         + "Category: %s\n"
	// 						+ "Authors:\n", title, category);

	// 	for (int i =0; i<= authors.size(); i++){
	// 		String author = authors.get(i);
	// 		System.out.println(author);
	// 	}
	// 	System.out.format( "Cost: %.2f$\n\n", cost);
								
    // }
}