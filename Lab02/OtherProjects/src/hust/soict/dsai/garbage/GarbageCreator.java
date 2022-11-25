package hust.soict.dsai.garbage;

public class GarbageCreator {
    String filename = "test.exe"; 
    byte[] inputBytes = {0}; 
    long startTime, endTime; 
    inputBytes = Files.readAllBytes(Paths.get(filename)); 
    startTime = System.currentTimeMillis(); 
    StringBuilder outputStringBuilder = new StringBuilder();
    for (byte b : inputBytes) {
        outputStringBuilder.append((char)b); 
    } 
    endTime = System.currentTimeMillis(); 
    System.out.println(endTime - startTime); 

}
