package hust.soict.dsai.test.media;
import hust.soict.dsai.aims.media.*;


public class TestPassingParameter {
    
    public static void main(String[] args){
        Media jungleDVD = new Media("Jungle");
        Media cinderellaDVD = new Media("Cinderella");

        swap (jungleDVD, cinderellaDVD);
        System.out.println("jungle DVD title: " + jungleDVD.getTitle());
        System.out.println("cinderella DVD title: " + cinderellaDVD.getTitle());

        changeTitle (jungleDVD, cinderellaDVD.getTitle());
        System.out.println("jungle DVD title: " + jungleDVD.getTitle());
    }    

    public static void swap (Object o1, Object o2) {
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
    }

    public static void changeTitle (Media dvd, String title) {
        String oldtitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new Media(oldtitle);
    }
}
