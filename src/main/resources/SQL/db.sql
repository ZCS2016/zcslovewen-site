CREATE SCHEMA `zcslovewen-site` ;

CREATE TABLE `zcslovewen-site`.`price_cal` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT 'id',
  `last_elec_num` FLOAT NULL COMMENT '本人-上次电表',
  `this_elec_num` FLOAT NULL COMMENT '本人-本次电表',
  `elec_price` FLOAT NULL COMMENT '电费单价',
  `last_water_num` FLOAT NULL COMMENT '隔壁-上次水表',
  `this_water_num` FLOAT NULL COMMENT '隔壁-本次水表',
  `water_price` FLOAT NULL COMMENT '水费单价',
  `balance` FLOAT NULL DEFAULT 2.5 COMMENT '其他-走廊电费-水物业差额',
  `final_price` FLOAT NULL COMMENT '交易金额',
  `time` DATETIME NULL COMMENT '交易时间',
  PRIMARY KEY (`id`));

INSERT INTO `zcslovewen-site`.`price_cal`
(`id`,`last_elec_num`,`this_elec_num`,`elec_price`,`last_water_num`,`this_water_num`,`water_price`,`balance`,`final_price`,`time`)
VALUES
(1,1,1,1,1,1,1,1,1,NOW());