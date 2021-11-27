package mail;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public enum MailCode {
    HAPPY_BIRTHDAY("happy_birthday.txt"), GREETINGS("greetings.txt");

    private final String filename;

    MailCode(String filename) {
        this.filename = filename;
    }

    public String generateText(){
        String data = "";
        File text_file = new File(filename);
        Scanner sc = null;
        try {
            sc = new Scanner(text_file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (sc.hasNextLine()){
            String line = sc.nextLine();
            data+=line+"\n";
        }
        return data;
    }
}
