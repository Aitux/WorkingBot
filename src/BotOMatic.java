import java.util.ArrayList;
import java.util.List;
import javax.security.auth.login.LoginException;
import net.dv8tion.jda.entities.User;
import net.dv8tion.jda.entities.impl.JDAImpl;

public class BotOMatic {

	public static void main(String[] args) {
		JDAImpl jda = new JDAImpl(true);
		List<User> connected = new ArrayList<>();
		try {
			jda.login("MTc5OTkwMDg2MTQwNjkwNDMy.ChZmkA.EBzlH81byYdUtMYQeLdMYLT03o8");
		} catch (LoginException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}	
		connected = jda.getUsersByName("Aitux");
		System.out.println(connected.size());
	}
}
