package tps;
import javax.security.auth.login.LoginException;

import net.dv8tion.jda.JDA;
import net.dv8tion.jda.JDABuilder;

public class BotOMatic {
	public static void main(String[] args) {
		JDA jda = null;
		
		try {
			jda = new JDABuilder().setBotToken("MTc5OTkwMDg2MTQwNjkwNDMy.ChZmkA.EBzlH81byYdUtMYQeLdMYLT03o8").buildBlocking();
			jda.addEventListener(new DiscordMessageListener());
		} catch (LoginException | IllegalArgumentException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}


}

