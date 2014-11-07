package questpack;

import java.util.Dictionary;

public class Quest {

	private String name;
	private String description;
	private boolean completed;
	private Reward reward;
	private Dictionary<K, V> objectives;
	public Quest(String name, String description, boolean completed,
			Reward reward, Dictionary<K, V> objectives) {
		super();
		this.name = name;
		this.description = description;
		this.completed = completed;
		this.reward = reward;
		this.objectives = objectives;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isCompleted() {
		return completed;
	}
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
	public Reward getReward() {
		return reward;
	}
	public void setReward(Reward reward) {
		this.reward = reward;
	}
	public Dictionary<K, V> getObjectives() {
		return objectives;
	}
	public void setObjectives(Dictionary<K, V> objectives) {
		this.objectives = objectives;
	}
	
	
}
