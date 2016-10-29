package tps;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.JDA;
import net.dv8tion.jda.JDABuilder;
import net.dv8tion.jda.events.ShutdownEvent;
import net.dv8tion.jda.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.managers.AccountManager;
import net.dv8tion.jda.utils.AvatarUtil;


public class BotOMatic {
	public static void main(String[] args) {

		Properties prop = new Properties();
		File f = new File("C:\\Users\\simon\\Documents\\properties.txt");
		try {
			FileInputStream fl = new FileInputStream(f);
			prop.load(fl);
		} catch (IOException e1) {
			e1.printStackTrace();
			System.exit(0);
		}	
		try {
			final JDA jda = new JDABuilder().setBotToken(prop.getProperty("token")).setBulkDeleteSplittingEnabled(false)
					.buildBlocking();
			jda.addEventListener(new DiscordMessageListener() {
				public void onGuildMessageReceived(GuildMessageReceivedEvent e) {
					super.onGuildMessageReceived(e);
					if (e.getMessage().getContent().contains("!shutdown")) {
						jda.shutdown();
					}
					if (e.getMessage().getContent().contains("!update")) {
						if (e.getAuthor().getId().equals(prop.getProperty("sudoId"))) {
							AccountManager ac = jda.getAccountManager();
							if (e.getMessage().getContent().contains("Data")) {
								File img = new File(prop.getProperty("imgPath"));
								ac.setGame("Funny Tricks");
								ac.setUsername("Administrateur");
								try {
									ac.setAvatar(AvatarUtil.getAvatar(img));
									System.out.println("Image updated");
								} catch (UnsupportedEncodingException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
								ac.update();
								System.out.println("Data updated");
							} else if (e.getMessage().getContent().contains("stream")) {
								ac.setStreaming("I'm Working on... me", "https://www.twitch.tv/aitux");
							} else if (e.getMessage().getContent().contains("reset")) {
								ac.setStreaming(null, null);
							}
						}
					}
				}

				@Override
				public void onShutdown(ShutdownEvent event) {
					super.onShutdown(event);

				}
			});
		} catch (LoginException | IllegalArgumentException | InterruptedException e) {
			e.printStackTrace();
			System.exit(0);
		}
	}

}
