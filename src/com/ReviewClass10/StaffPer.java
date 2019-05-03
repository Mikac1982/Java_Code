package com.ReviewClass10;

public abstract class StaffPer {
    String name;
	String address;
	int salary;
	String vehicleType;
	String hireType;
	int telNum;
	
	public StaffPer(String name, String address, int salary, String vehicleType, String hireType, int telNum) {
		super();
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.vehicleType = vehicleType;
		this.hireType = hireType;
		this.telNum = telNum;
	}
	public abstract String getVehicleType();
	public abstract String getName();
	public abstract String getAddress();
	public abstract double getSalary();
	public abstract int getNum();
	public void getInfo() {
	
		System.out.println(name+" "+address+" "+salary+" "+vehicleType);
	}
}
class Secretary extends StaffPer{
	
    public Secretary(String name, String address, int salary, String vehicleType, String hireType, int telNum) {
		super(name, address, salary, vehicleType, hireType, telNum);
	}

	@Override
	public String getVehicleType() {
		return super.vehicleType;
	}

	@Override
	public String getName() {
		return super.name;
	}

	@Override
	public String getAddress() {
		return super.address;
	}

	@Override
	public double getSalary() {
		return super.salary;
	}

	@Override
	public int getNum() {
		return super.telNum;
	}
}
class Profesors extends StaffPer{
	
	 public Profesors(String name, String address, int salary, String vehicleType, String hireType, int telNum) {
		super(name, address, salary, vehicleType, hireType, telNum);
		
	}

	@Override
		public String getVehicleType() {
			return super.vehicleType;
		}

		@Override
		public String getName() {
			return super.name;
		}

		@Override
		public String getAddress() {
			return super.address;
		}

		@Override
		public double getSalary() {
			return super.salary;
		}

		@Override
		public int getNum() {
			return super.telNum;
		}
	
	
}










