package tws.repository;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import tws.entity.ParkingLot;

@Mapper
public interface ParkingLotMapper {

	@Select("select * from parking_lot")
	List<ParkingLot> selectAll();
	
	@Select("select * from parking_lot where parking_boy_id = #{parkingBoyId}")
	List<ParkingLot> selectByParkingBoyId(@Param("parkingBoyId")int parkingBoyId);
	
	@Insert("insert into parking_lot values(#{pakingLot.parkingLotId},#{pakingLot.availablePositionCount},#{pakingLot.capatity},#{pakingLot.parkingBoyId})")
	void insert(@Param("parkingLot") ParkingLot parkingLot);
}
