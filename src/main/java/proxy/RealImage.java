package proxy;

public class RealImage implements Image{
    private String filename;

    public RealImage(String filename){
        this.filename = filename;

    }

    @Override
    public void display() {
        System.out.println("Displaying the:" + filename);
    }
    public void loadFromDisk(){
        System.out.println("The file:" + filename + "is loading from the disk");
    }
}
