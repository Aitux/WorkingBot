package tps;

import net.dv8tion.jda.entities.TextChannel;
import net.dv8tion.jda.events.message.MessageReceivedEvent;
import net.dv8tion.jda.hooks.ListenerAdapter;

public class DiscordMessageListener extends ListenerAdapter{

	public void onMessageReceived(MessageReceivedEvent e){
		StringBuilder builder = new StringBuilder();
		boolean isPrivate = e.isPrivate();
		if(!isPrivate){
			System.out.printf("[%s][%s]\t%s: %s\n", e.getGuild().getName(), e.getTextChannel().getName(),
             e.getAuthor().getUsername(), e.getMessage().getContent());
			if(e.getMessage().getContent().equals("!insulteMoi")){
			DiscordStream stream = new DiscordStream(e.getTextChannel());
			stream.printToDiscord(e.getAuthor().getUsername() + " il semblerait que tu aimes te faire insulter ma salope !");
			}
			
			if(e.getAuthor().getUsername().equals("norbana")){
				DiscordStream stream = new DiscordStream(e.getTextChannel());
				stream.printToDiscord("Tu n'as pas le droit à la parole ici minus !");
			}
			

		}else{
			 System.out.printf("[PM]\t%s: %s\n", e.getAuthor().getUsername(), e.getMessage().getContent());
			 
		}
	}

	
}
