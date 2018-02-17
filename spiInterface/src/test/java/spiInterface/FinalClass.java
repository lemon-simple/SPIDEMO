package spiInterface;

import java.util.Date;

//1.final修饰class,避免子类破坏(比如增加对成员变量的访问方法)
public final class FinalClass {
	// 2.final 修饰成员变量
	private final long id;
	private final String name;

	private final Date date;

	public FinalClass(long id, String name, Date date) {
		this.id = id;
		this.name = name;
		this.date = date;
	}
	// 3.不暴露修改成员变量的方法如setXXX方法

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Date getDate() {
		Date dateCopy=new Date();
		dateCopy.setTime(date.getTime());
		return dateCopy;
	}

	@Override
	public String toString() {
		return "FinalClass [id=" + id + ", name=" + name + ", date=" + date + "]";
	}

	public static void main(String[] args) {

		FinalClass fc = new FinalClass(1l, "zs", new Date());
		System.out.println(fc);

		Date d = fc.getDate();
		d.setYear(1234);
		System.out.println(fc);
	}

}
