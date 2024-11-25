package ua.edu.ucu.apps.task2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MailBoxTests {

    @Test
    public void testAddMailInfo() {
        MailBox mailBox = new MailBox();

        Client client = Client.builder()
                               .name("Oleksa")
                               .age(18)
                               .sex("Male")
                               .email("khita.pn@ucu.edu.ua.com")
                               .build();

        MailInfo mailInfo = new MailInfo(client, new BirthdayMailCode());
        mailBox.addMailInfo(mailInfo);
    }

    @Test
    public void testSendAll() {
        MailBox mailBox = new MailBox();

        Client client1 = Client.builder()
                                .name("Bozhena")
                                .age(19)
                                .sex("Female")
                                .email("say.pn@ucu.edu.ua.com")
                                .build();
        Client client2 = Client.builder()
                                .name("Oleksa")
                                .age(18)
                                .sex("Male")
                                .email("khita.pn@ucu.edu.ua.com")
                                .build();

        MailInfo mailInfo1 = new MailInfo(client1, new BirthdayMailCode());
        MailInfo mailInfo2 = new MailInfo(client2, new BirthdayMailCode());

        mailBox.addMailInfo(mailInfo1);
        mailBox.addMailInfo(mailInfo2);

        mailBox.sendAll();

        assertEquals(2, mailBox.getInfos().size());
    }
}
