package tps;

import java.util.ArrayList;
import java.util.List;

import net.dv8tion.jda.entities.Role;
import net.dv8tion.jda.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.hooks.ListenerAdapter;
import net.dv8tion.jda.managers.GuildManager;

public class GuildMemberListener extends ListenerAdapter{
	List<Role> roleList = new ArrayList<>();
	
	@Override
	public void onGuildMemberJoin(GuildMemberJoinEvent e){
		super.onGuildMemberJoin(e);
		
		GuildManager gm = new GuildManager(e.getGuild());
		roleList = gm.getGuild().getRoles();
		for(Role r : roleList){
			System.out.println(r.getName());
		}
		gm.addRoleToUser(e.getUser(),roleList.get(4));
	}
	
}
