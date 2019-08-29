package tws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import tws.entity.ParkingBoy;
import tws.entity.ParkingLot;
import tws.repository.ParkingBoyMapper;
import tws.repository.ParkingLotMapper;

@RestController
@RequestMapping("parkingboys")
public class ParkingBoyController {

	@Autowired
	ParkingBoyMapper parkingBoyMapper;
	@Autowired
	ParkingLotMapper parkingLotMapper;
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<ParkingBoy> queryList(){
		return parkingBoyMapper.selectAll();
	}
	
	@GetMapping("/{id}/parkinglots")
	public ResponseEntity<ParkingBoy> queryParkingLotList(@PathVariable Integer id){
		if (id == null) {
			return ResponseEntity.badRequest().build();
		}
		ParkingBoy parkingBoy = parkingBoyMapper.selectById(id);
		if (parkingBoy == null) {
			return ResponseEntity.notFound().build();
		}
		List<ParkingLot> parkingLots = parkingLotMapper.selectByParkingBoyId(id);
		if (parkingLots.size() != 0) {
			parkingBoy.setParkingLots(parkingLots);
		}
		return ResponseEntity.ok(parkingBoy);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ParkingBoy createParkingBoy(@RequestBody ParkingBoy parkingBoy) {
		parkingBoyMapper.insert(parkingBoy);
		return parkingBoy;
	}
	
}
