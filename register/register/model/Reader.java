package register.model;

public class Reader {
	private String 图书证号;
	private String 登录密码;
	private String 姓名;
	private String 院系;
	private String 班级;
	private String 角色;
	public String get图书证号() {
		return 图书证号;
	}
	public void set图书证号(String 图书证号) {
		this.图书证号 = 图书证号;
	}
	public String get登录密码() {
		return 登录密码;
	}
	public void set登录密码(String 登录密码) {
		this.登录密码 = 登录密码;
	}
	public String get姓名() {
		return 姓名;
	}
	public void set姓名(String 姓名) {
		this.姓名 = 姓名;
	}
	public String get院系() {
		return 院系;
	}
	public void set院系(String 院系) {
		this.院系 = 院系;
	}
	public String get班级() {
		return 班级;
	}
	public void set班级(String 班级) {
		this.班级 = 班级;
	}
	public String get角色() {
		return 角色;
	}
	public void set角色(String 角色) {
		this.角色 = 角色;
	}
	public String toString() {
		return "图书证号："+get图书证号()+"<br>登录密码"+get登录密码()+"<br>姓名"+get姓名()+"<br>院系"+get院系()+"<br>班级"+get班级()+"<br>角色"+get角色();
	}
}
