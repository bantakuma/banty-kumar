package com.capgemini.bean;
public class Employee {
	public int id;
	public String name;
	public float sal;
	public String desig;
	public String ins; 

	public String getIns() {
		return ins;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + ", desig=" + desig + ", ins=" + ins + "]";
	}
	public void setIns(String ins) {
		this.ins = ins;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public Employee(int id, String name, float sal, String desig) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.desig = desig;
		
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	}


