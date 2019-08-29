package tws.entity;

import java.util.ArrayList;
import java.util.List;

public class ParkingBoy {

	private int employeeId;
	private String name;

	private List<Integer> parkingLots = new ArrayList<Integer>();
	
	public ParkingBoy() {
		
	}
	
	public ParkingBoy(int employeeId,String name) {
		this.employeeId = employeeId;
		this.name = name;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Integer> getParkingLots() {
		return parkingLots;
	}

	public void setParkingLots(List<Integer> parkingLots) {
		this.parkingLots = parkingLots;
	}
}
