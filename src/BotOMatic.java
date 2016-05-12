import java.util.ArrayList;
import java.util.List;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.MessageBuilder;
import net.dv8tion.jda.entities.User;
import net.dv8tion.jda.entities.impl.JDAImpl;

public class BotOMatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JDAImpl jda = new JDAImpl(true);
		MessageBuilder mb = new MessageBuilder();
		List<User> connected = new ArrayList<>();
		try {
			jda.login("MTc5OTkwMDg2MTQwNjkwNDMy.ChZmkA.EBzlH81byYdUtMYQeLdMYLT03o8");
		} catch (LoginException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		connected = jda.getUsers();
		System.out.println(connected.toString());
		/*	jda.addListener(new ListenerAdapter() {

			@Override
			public void onPrivateMessageReceived(PrivateMessageReceivedEvent event) {
				// TODO Auto-generated method stub
				super.onPrivateMessageReceived(event);

				mb.appendString("HelloWorld");
				mb.build();
			}

		});

	}*/
	}
}
