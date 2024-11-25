package ua.edu.ucu.apps.task2;

public class Main {
    public static void main(String[] args) {
        Client client = Client.builder()
                .name("Oleksa")
                .age(25).email("khita.pn@ucu.edu.ua").build();

        MailInfo mailInfo = new MailInfo(client, client1 -> "Hello " + client1.getEmail());
        MailSender mailSender = new MailSender();
        mailSender.sendMail(mailInfo);
    }
}
