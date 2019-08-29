package tws.entity;

import java.util.ArrayList;
import java.util.List;

public class ParkingBoy {

	private int employeeId;
	private String name;

	private List<ParkingLot> parkingLots = new ArrayList<ParkingLot>();
	
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

	public List<ParkingLot> getParkingLots() {
		return parkingLots;
	}

	public void setParkingLots(List<ParkingLot> parkingLots2) {
		this.parkingLots = parkingLots2;
	}
}
