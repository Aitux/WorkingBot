package tps;

import java.util.List;

import net.dv8tion.jda.entities.Guild;
import net.dv8tion.jda.entities.VoiceChannel;
import net.dv8tion.jda.entities.impl.VoiceChannelImpl;
import net.dv8tion.jda.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.events.message.priv.PrivateMessageReceivedEvent;
import net.dv8tion.jda.hooks.ListenerAdapter;
import net.dv8tion.jda.managers.ChannelManager;
import net.dv8tion.jda.managers.GuildManager;

public class DiscordMessageListener extends ListenerAdapter {

	List<VoiceChannel> voiceList;

	@Override
	public void onGuildMessageReceived(GuildMessageReceivedEvent e) {

		super.onGuildMessageReceived(e);
		boolean flag = false;
		DiscordStream stream = new DiscordStream(e.getChannel());
		GuildManager gm = new GuildManager(e.getGuild());
		setChannel(e, stream);
		if (!e.getAuthor().isBot()) {
			if (e.getMessage().getContent().contains("!moveTo")) {
				String channel = "";
				try{
				channel = e.getMessage().getContent().split("\\s+")[1];
				}catch(IndexOutOfBoundsException ex){
					channel = "179980434015387650";
					flag = true;
					stream.printToDiscord(
							"Je n'ai pas compris, veuillez vous assurer de suivre la syntaxe suivante: ```!moveTo channel``` :name_badge: Avec 1 seul espace.");
				}
				// stream.printToDiscord(e.getMessage().getContent());
				if (!channel.equals("")) {
					for (int i = 0; i < voiceList.size(); i++) {
						if (channel.equals(voiceList.get(i).getName())) {
							channel = voiceList.get(i).getId();
							flag = true;
						}
					}
					if (!flag)
						channel = "";
				} else {
					stream.printToDiscord(
							"Je n'ai pas compris, veuillez vous assurer de suivre la syntaxe suivante: ```!moveTo channel``` :name_badge: Avec 1 seul espace.");
					System.out.println("Channel = [" + channel + "]");
				}
				
				Guild g = e.getGuild();
				if (e.getGuild().getVoiceStatusOfUser(e.getAuthor()).inVoiceChannel()) {
					if (!channel.equals("")) {
						gm.moveVoiceUser(e.getAuthor(), new VoiceChannelImpl(channel, e.getGuild()));
					} else
						stream.printToDiscord(
								"Je n'ai pas compris, veuillez vous assurer de suivre la syntaxe suivante: ```!moveTo channel``` :name_badge: Avec 1 seul espace.");
				} else {
					stream.printToDiscord(
							"Vous devez être connecté à un Voice Channel pour pouvoir être move. :expressionless:");
				}
			}
			
			if(e.getMessage().getContent().contains("!clean")){
				
			}
		}

		/*
		 * if(e.getAuthor().getUsername().equals("norbana")){
		 * e.getMessage().deleteMessage();
		 * stream.printToDiscord(e.getAuthor().getUsername() +
		 * " __vous n'avez pas le droit à la parole ici !__");
		 * stream.setPrivate(e.getAuthor().getPrivateChannel());
		 * stream.printPrivate(
		 * "Veuillez ne pas troubler l'ordre sur le serveur sous peine de banissement !"
		 * ); }
		 */

	}



	@Override
	public void onPrivateMessageReceived(PrivateMessageReceivedEvent e) {
		// TODO Auto-generated method stub
		super.onPrivateMessageReceived(e);
		DiscordStream stream = new DiscordStream(e.getChannel(), true);
		if (!e.getAuthor().isBot()) {
			if (e.getMessage().getContent().equals("!coquin"))
				stream.printPrivate(":underage: https://www.instagram.com/highestheaven/ :underage:");
			stream.printPrivate("Je n'aime pas que l'on me parle en privé ca me gène :flushed:");
		}
	}
	
	private void setChannel(GuildMessageReceivedEvent e, DiscordStream stream) {
		voiceList = e.getGuild().getVoiceChannels();
	}

}
