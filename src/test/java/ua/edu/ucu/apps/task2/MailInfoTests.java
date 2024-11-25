package ua.edu.ucu.apps.task2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MailInfoTests {

    @Test
    public void testMailInfoGenerateBirthdayMail() {
        Client client = Client.builder()
                               .name("Oleksa")
                               .age(18)
                               .sex("Male")
                               .email("khita.pn@ucu.edu.ua.com")
                               .build();

        MailCode birthdayMailCode = new BirthdayMailCode();
        MailInfo mailInfo = new MailInfo(client, birthdayMailCode);

        String expected = "Hello Oleksa! Happy 18th birthday!";
        assertEquals(expected, mailInfo.generate());
    }
}
