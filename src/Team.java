import java.util.ArrayList;
import java.util.List;

public class Team {
	private List<Player> players=new ArrayList<Player>();
	private String name;
	
	
	
	
	public Team(String name) {
		this.name = name;
	}
	
	
	public void describe() {
		System.out.println("\n---------------------------------------\nTeam Name: "+name);
		for(Player player:players)
			player.describe();
	}
	
	
	public void addPlayer(Player player) {
		players.add(player);
	}
	
	
	public void removePlayer(String playerName) {
		for(Player player:players) {
			if(player.getName().equals(playerName)) {
				players.remove(player);
			}
		}
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}
	
	
	
	
	
	
	
	
	
	
}
