public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private String id;
    private static int nbDigitalVideoDiscs = 0;

    public String getCount(){
        nbDigitalVideoDiscs++;
        id = String.format("%d",nbDigitalVideoDiscs);
        return id;
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
    public float getCost() {
        return cost;
    }
    public void setCost(float cost) {
        this.cost = cost;
    }
    
    public DigitalVideoDisc(String title) {
        this.title = title;
        this.id = getCount();
    }
    public DigitalVideoDisc(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.id = getCount();
    }
    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
        this.id = getCount();
    }
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        this.id = getCount();
    }
    public boolean isMatchTitle (String key ){
        if (key == this.title) return true;
        else return false;
    }
    public boolean isMatchID (String key ){
        if (key == this.id) return true;
        else return false;
    }
    public void printDetail() {
        System.out.format("Disc detail:\n"
                            + "ID: %d\n"
                            + "Title: %s\n"
                            + "Category: %s\n"
                            + "Director: %s\n"
                            + "Length: %d page(s)\n"
                            + "Cost: %.2f$\n\n",id, title, category, director, length, cost);
    }
    
}
