package register.model;

public class Book {
	private String 书号;
	private String 书名;
	private String 作者;
	private String 出版社;
	private String 入库时间;
	private String 是否借出;
	
	public String get书号() {
		return 书号;
	}
	
	public void set书号(String 书号) {
		this.书号 = 书号;
	}
	
	public String get书名() {
		return 书名;
	}

	public void set书名(String 书名) {
		this.书名 = 书名;
	}

	public String get作者() {
		return 作者;
	}

	public void set作者(String 作者) {
		this.作者 = 作者;
	}

	public String get出版社() {
		return 出版社;
	}

	public void set出版社(String 出版社) {
		this.出版社 = 出版社;
	}

	public String get入库时间() {
		return 入库时间;
	}

	public void set入库时间(String 入库时间) {
		this.入库时间 = 入库时间;
	}

	public String get是否借出() {
		return 是否借出;
	}

	public void set是否借出(String 是否借出) {
		this.是否借出 = 是否借出;
	}
	public String toString(){
		return "书号:"+get书号()+"<br>书名:"+get书名()+"<br>作者:"+get作者()+"<br>出版社:"+get出版社()+"<br>入库时间:"+get入库时间()+"<br>是否借出:"+get是否借出();
	}
}
