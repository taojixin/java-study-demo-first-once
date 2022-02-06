package domain;

import service.Status;

public class Programmer extends Employee{
	private int memberld;
	private Status status = Status.FREE;//状态 FREE空闲 BUSY已加入开发团队 VOCATION正在休假
	private Equipment equipment;
//构造方法
	public Programmer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Programmer(int id, String name, int age, double salary,Equipment equipment) {
		super(id, name, age, salary);
		this.equipment = equipment;
	}
//get set方法
	public int getMemberld() {
		return memberld;
	}
	public void setMemberld(int memberld) {
		this.memberld = memberld;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public Equipment getEquipment() {
		return equipment;
	}
	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}
	
	//
	@Override
	public String toString() {
		return getDetails() + "\t程序员" + "\t" + status +"\t\t\t" + equipment.getDescription();
	}
	public String getTeamBaseDetails() {
		return memberld + "/" + getId() + "\t" + getName() + "\t" + getAge() + "\t" + getSalary();
	}
	public String getDetailsForTeam() {
		return getTeamBaseDetails() + "\t程序员";
	}
}