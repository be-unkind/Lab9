package proxy;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        String file_name = "morpheus.png";
        ProxyImage img = new ProxyImage(file_name);
        img.display();

    }
}
