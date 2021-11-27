package mail;

public class IdGenerator {
    static int id;

    public static int generate(){
        id += 1;
        return id;
    }
}
