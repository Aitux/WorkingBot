package tps;

import net.dv8tion.jda.events.ShutdownEvent;
import net.dv8tion.jda.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.events.message.priv.PrivateMessageReceivedEvent;
import net.dv8tion.jda.hooks.ListenerAdapter;

public class DiscordMessageListener extends ListenerAdapter{

	
	@Override
	public void onGuildMessageReceived(GuildMessageReceivedEvent e) {
		// TODO Auto-generated method stub
		super.onGuildMessageReceived(e);
		DiscordStream stream = new DiscordStream(e.getChannel());
		if(e.getMessage().getContent().equals("!insulteMoi")){
			stream.printToDiscord(e.getAuthor().getUsername() + " il semblerait que tu aimes te faire insulter ma salope !");
		}
	/*	if(e.getAuthor().getUsername().equals("norbana")){
			e.getMessage().deleteMessage();
			stream.printToDiscord(e.getAuthor().getUsername() + " __vous n'avez pas le droit à la parole ici !__");
			stream.setPrivate(e.getAuthor().getPrivateChannel());
			stream.printPrivate("Veuillez ne pas troubler l'ordre sur le serveur sous peine de banissement !");
		}*/
		
	}



	@Override
	public void onShutdown(ShutdownEvent event) {
		// TODO Auto-generated method stub
		super.onShutdown(event);
	}

	@Override
	public void onPrivateMessageReceived(PrivateMessageReceivedEvent e) {
		// TODO Auto-generated method stub
		super.onPrivateMessageReceived(e);

		DiscordStream stream = new DiscordStream(e.getChannel(), true);
		if(!e.getAuthor().isBot()){
			if(e.getMessage().getContent().equals("!coquin")) stream.printPrivate("https://www.instagram.com/p/BFXjc5QIV9Z/?taken-by=nickygile");
			//stream.printPrivate("Je n'aime pas que l'on me parle en privé ca me gène :S");
		}
	}

}
