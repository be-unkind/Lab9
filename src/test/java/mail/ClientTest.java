package mail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    Client client;

    @BeforeEach
    void setUp() {
        client = new Client("Nastya", 18, Gender.FEMALE);
    }

    @Test
    void getName() {
        assertEquals("Nastya", client.getName());
    }

    @Test
    void getSex() {
        assertEquals(Gender.FEMALE, client.getSex());
    }
}