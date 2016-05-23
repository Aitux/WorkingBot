package tps;

import java.io.File;
import java.util.List;
import java.util.function.Consumer;

import net.dv8tion.jda.JDA;
import net.dv8tion.jda.Permission;
import net.dv8tion.jda.entities.Guild;
import net.dv8tion.jda.entities.Message;
import net.dv8tion.jda.entities.PermissionOverride;
import net.dv8tion.jda.entities.Role;
import net.dv8tion.jda.entities.User;
import net.dv8tion.jda.managers.ChannelManager;
import net.dv8tion.jda.managers.PermissionOverrideManager;
import net.dv8tion.jda.utils.InviteUtil.AdvancedInvite;

public class TxtChannel implements net.dv8tion.jda.entities.TextChannel{
	
	private String id;
	
	public TxtChannel(String id){
		this.id = id;
	}
	
	@Override
	public boolean checkPermission(User arg0, Permission arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public PermissionOverrideManager createPermissionOverride(User arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PermissionOverrideManager createPermissionOverride(Role arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Guild getGuild() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public List<AdvancedInvite> getInvites() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JDA getJDA() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ChannelManager getManager() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PermissionOverride getOverrideForRole(Role arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PermissionOverride getOverrideForUser(User arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PermissionOverride> getPermissionOverrides() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getPosition() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<PermissionOverride> getRolePermissionOverrides() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTopic() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PermissionOverride> getUserPermissionOverrides() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Message sendFile(File arg0, Message arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void sendFileAsync(File arg0, Message arg1, Consumer<Message> arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Message sendMessage(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Message sendMessage(Message arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void sendMessageAsync(String arg0, Consumer<Message> arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendMessageAsync(Message arg0, Consumer<Message> arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendTyping() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getAsMention() {
		// TODO Auto-generated method stub
		return null;
	}

}
