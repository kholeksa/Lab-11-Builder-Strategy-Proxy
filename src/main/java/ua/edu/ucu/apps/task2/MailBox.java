package ua.edu.ucu.apps.task2;

import java.util.*;
import lombok.Getter;

@Getter
public class MailBox {
    private ArrayList<MailInfo> infos;

    public MailBox() {
        this.infos = new ArrayList<>();
    }

    public void addMailInfo(MailInfo mailInfo) {
            this.infos.add(mailInfo);
        }

    public void sendAll() {
        for (MailInfo mailInfo : this.infos) {
            System.out.println(mailInfo.generate());
        }
    }
}
