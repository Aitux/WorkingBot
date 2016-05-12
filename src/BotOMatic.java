import javax.security.auth.login.LoginException;

import net.dv8tion.jda.JDABuilder;
public class BotOMatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JDABuilder jda = new JDABuilder();
		jda.setBotToken("MTc5OTkwMDg2MTQwNjkwNDMy.ChZmkA.EBzlH81byYdUtMYQeLdMYLT03o8");
		try {
			jda.buildAsync();
		} catch (LoginException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
