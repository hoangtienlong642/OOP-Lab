package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Carts {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if (this.qtyOrdered == MAX_NUMBERS_ORDERED){
            System.out.println("This order is almost full!");
        } else {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc " + disc.getTitle() + " has been added.");
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList){
        if (this.qtyOrdered == MAX_NUMBERS_ORDERED){
            System.out.println("This order is almost full!");
        } else {
            for (int i = 0 ; i< dvdList.length ; i++){
            itemsOrdered[qtyOrdered] = dvdList[i];
            qtyOrdered++;
            System.out.println("The disc " + dvdList[i].getTitle() + " has been added.");
            }
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){
        if (this.qtyOrdered == MAX_NUMBERS_ORDERED){
            System.out.println("This order is almost full!");
        } else {
            itemsOrdered[qtyOrdered] = dvd1;
            qtyOrdered++;
            System.out.println("The disc " + dvd1.getTitle() + " has been added.");
            
            itemsOrdered[qtyOrdered] = dvd2;
            qtyOrdered++;
            System.out.println("The disc " + dvd2.getTitle() + " has been added.");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        int count = 0, index = 0;
        if(this.qtyOrdered == 0){
            System.out.println("Empy! Nothing in your order list.");
        }
        else{
            for(int i = 0; i < this.qtyOrdered; i++){
                if(itemsOrdered[i] == disc){
                    index = i;
                    count++;
                    break;
                }
            }
            if(count == 0){
                System.out.println("There isn't any item that you want to delete.");
            } else{
                for(int i = index; i < this.qtyOrdered; i++){
                    itemsOrdered[i] = itemsOrdered[i+1];
                }
                qtyOrdered = qtyOrdered-1;
                System.out.println("The disc " + disc.getTitle() + " has been deleted.");
            }
            
        }
    }

    public float totalCost(){
        float total = 0.0f;
        if(this.qtyOrdered == 0){
            System.out.println("Empy! Nothing in your order list.");
        }
        else {
            for(int i = 0; i < this.qtyOrdered; i++){
                total += itemsOrdered[i].getCost();
            }
        }
        return total;
    }
    
    public void printCart (){
        System.out.println("***********************CART***********************");
        System.out.println("\nOrdered Items:");
        for (int i = 0; i < qtyOrdered; i++){
            itemsOrdered[i].printDetail();
        }
        System.out.println("Total cost: " +totalCost());
        System.out.println("**************************************************");
    }

    public void search(String title){
        int k = 0;
        for (int i = 0; i < qtyOrdered; i++){
            if (itemsOrdered[i].isMatch(title)) {
                itemsOrdered[i].printDetail();
                k++;
            }
        }
        if (k==0) System.out.println("Not found");
    }
    public void search(int id){
        int k=0;
        for (int i = 0; i < qtyOrdered; i++){
            if (itemsOrdered[i].isMatch(id)) {
                itemsOrdered[i].printDetail();
                k++;
            }
        }
        if (k==0) System.out.println("Not found");
    }
}
