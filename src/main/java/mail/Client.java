package mail;

import lombok.Getter;
import lombok.Setter;

import static mail.IdGenerator.generate;

@Getter
public class Client {

    private  int age;
    private String name;
    private int id;
    private Gender sex;


    public Client(String name, int age, Gender sex) {
        this.name = name;
        this.age = age;
        this.id = generate();
        this.sex = sex;
    }
}
