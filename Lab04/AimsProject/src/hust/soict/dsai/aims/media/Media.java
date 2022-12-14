package hust.soict.dsai.aims.media;

public class Media {
    protected String title;
    protected String category;
    protected float cost;
    protected String id;
	
	public Media(String title ){
		this.title = title;
	}

    public Media(String id, String title, float cost) {
		this.id = id;
		this.title = title;
		this.cost = cost;
	}
	
	public Media(String id, String title, String category, float cost) {
		this(id, title, cost);
		this.category = category;
	}
    
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public float getCost() {
        return cost;
    }
    public void setCost(float cost) {
        this.cost = cost;
    }
    public String getId() {
		return id;
	}

    public boolean isMatch (String key ){
        if (key.equals(this.title)) return true;
        else return false;
    }
    
    public boolean isMatch2 (String key ){
        if (key.equals(this.id)) return true;
        else return false;
    }
    public String toString() {
        return "Media detail:\n"
        + "ID: " + id
        + "\nTitle: " + title 
        + "\nCategory: " + category 
        + "\nCost: "+cost + "\n"; 
    }
    public void printDetail() {
        System.out.println(this.toString());
    }
    public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if( obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Media other = (Media) obj;
		if (this.title != other.title){
			return false;
		};
		return true;
	}
}