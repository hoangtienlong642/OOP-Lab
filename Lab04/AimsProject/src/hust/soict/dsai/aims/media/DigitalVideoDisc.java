package hust.soict.dsai.aims.media;
public class DigitalVideoDisc extends Disc implements Playable{
    private String director;
    private int length;
    
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    
    public DigitalVideoDisc(String id, String title, float cost) {
		super(id, title, cost);
	}
	
	public DigitalVideoDisc(String id, String title, int length, float cost) {
		super(id, title, cost);
		this.length = length;
	}
	
	public DigitalVideoDisc(String id, String title, String category, int length, float cost ) {
		super(id, title, category, cost);
		this.length = length;
	}
	
	public DigitalVideoDisc(String id, String title, String category, int length, String director, float cost) {
		this(id, title, category, length, cost);
		this.director = director;
	}

	public boolean Search(String string){

        int count = 0;

        String sTitle[] = title.split(" ");
        String getTitle[] = string.split(" ");
        for(int i = 0;  i < getTitle.length; i++){
            for(int j = 0; j < sTitle.length; j++){
                if(sTitle[j].equalsIgnoreCase(getTitle[i])){
                    count++;
                }
            }
        }

        if(count == sTitle.length)
            return true;
        return false;
    }
    // public void printDetail() {
    //     System.out.format("DVD detail:\n"
    //                         + "Title: %s\n"
    //                         + "Category: %s\n"
	// 						+ "Director: %s\n"
	// 						+ "Length: %d\n"
    //                         + "Cost: %.2f$\n\n", title, category,director,length, cost);
    // }

    public void play() {
        // TODO Auto-generated method stub
        System.out.println("Playing DVD: " + this.getTitle());
	    System.out.println("DVD length: " + this.getLength());
    }
}