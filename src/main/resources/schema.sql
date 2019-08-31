CREATE TABLE `parking_boy` (

`employeeId` varchar2(36) NOT NULL,

`name` varchar(10) NULL,

PRIMARY KEY (`employeeId`) 

);



CREATE TABLE `parking_lot` (

`parkingLotId` varchar2(36) NOT NULL,

`availablePositionCount` int(3) NULL,

`capatity` int(3) NULL,

`parkingBoyId` varchar2(36) NULL,

PRIMARY KEY (`parkingLotId`) 

);