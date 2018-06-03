package register.model;

public class Worker {
	private String 工号;
	private String 密码;
	private String 角色;
	public String get工号() {
		return 工号;
	}
	public void set工号(String 工号) {
		this.工号 = 工号;
	}
	public String get密码() {
		return 密码;
	}
	public void set密码(String 密码) {
		this.密码 = 密码;
	}
	public String get角色() {
		return 角色;
	}
	public void set角色(String 角色) {
		this.角色 = 角色;
	}
	public String toString() {
		return "工号："+get工号()+"<br>密码"+get密码()+"<br>角色"+get角色();
	}
}
