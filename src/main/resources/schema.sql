CREATE TABLE `parking_boy` (

`employeeId` int(10) NOT NULL,

`name` varchar(10) NULL,

PRIMARY KEY (`employeeId`) 

);



CREATE TABLE `parking_lot` (

`parkingLotId` int(10) NOT NULL,

`availablePositionCount` int(3) NULL,

`capatity` int(3) NULL,

`parkingBoyId` int(10) NULL,

PRIMARY KEY (`parkingLotId`) 

);
