import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.mail.internet.MimeMessage.RecipientType;
import javax.print.attribute.standard.PrinterMessageFromOperator;
import javax.activation.*;
import javax.annotation.Generated;
public class MailDemo {

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
			mess.setSubject("Test Mail");
			System.out.println("Actual Message");
			mess.setText("This is a test message for mail sending");
			Transport.send(mess);
			System.out.println("Message sent succesfully");
		}
		catch(MessagingException m){
			m.printStackTrace();
		}
	}

}
