package mail;

import lombok.Getter;

import java.util.ArrayList;

@Getter
public class MailBox {

    private MailSender sender;
    private ArrayList<MailInfo> infos;

    public void MailBox(){
        infos=new ArrayList<MailInfo>();
        sender = new MailSender();
    }

    public void addInfo(MailInfo maiInfo){
        infos.add(maiInfo);
    }

    public void sendMail(){
        for (MailInfo info: infos){
            sender.sendMail(info);
        }
        infos=new ArrayList<MailInfo>();
    }
}
