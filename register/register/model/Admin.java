package register.model;

public class Admin {
	private String 用户名;
	private String 管理密码;
	public String get用户名() {
		return 用户名;
	}
	public void set用户名() {
		this.用户名=用户名;
	}
	public String get管理密码() {
		return 管理密码;
	}
	public void set管理密码() {
		this.管理密码=管理密码;
	}
	public String toString() {
		return "用户名："+get用户名()+"<br>管理密码"+get管理密码();
	}
}
