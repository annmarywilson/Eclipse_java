import java.io.IOException;
import java.util.Properties;

import javax.mail.*;
import javax.mail.internet.*;
import javax.mail.internet.MimeMessage.RecipientType;
public class Mailattach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String to="akhilraj@opentrends.net";
		String from="mailer@opentrends.net";
		String host="192.168.2.5";
		Properties p=System.getProperties();
		p.setProperty("mail.smtp.host", host);
		Session s=Session.getDefaultInstance(p);
		try {
			MimeMessage mess=new MimeMessage(s);
			mess.setFrom(new InternetAddress(from));
			mess.setRecipient(RecipientType.TO,new InternetAddress(to));
			mess.setSubject("Test Mail with attraction");
			
			
			
			Multipart mp=new MimeMultipart();
			MimeBodyPart msg=new MimeBodyPart();
			msg.setText("This is a test message with attachment");
			MimeBodyPart att=new MimeBodyPart();
			String atachment="src/att.jpeg";
			att.attachFile(atachment);
			mp.addBodyPart(msg);
			mp.addBodyPart(att);
			mess.setContent(mp);
			
			Transport.send(mess);
			System.out.println("Messsage sent succesfully");
			}
		catch(MessagingException ex) {
			ex.printStackTrace();
		}
		catch(IOException i) {
			i.printStackTrace();
		}
	}

}
