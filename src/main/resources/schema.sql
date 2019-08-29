CREATE TABLE `parking_boy` (

`employee_id` int(10) NOT NULL,

`name` varchar(10) NULL,

PRIMARY KEY (`employee_id`) 

);



CREATE TABLE `parking_lot` (

`parking_lot_id` int(10) NOT NULL,

`available_position_count` int(3) NULL,

`capatity` int(3) NULL,

`parking_boy_id` int(10) NULL,

PRIMARY KEY (`parking_lot_id`) 

);
