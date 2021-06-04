package com.street.controller;

import com.street.entity.District;
import com.street.entity.Street;
import com.street.helper.Helper;
import com.street.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping(value = "/seed/generate")
public class SeedController {
    @Autowired
    DistrictService districtService;
    @RequestMapping(method = RequestMethod.POST)
    public String seed(){
        District district1 = new District("Long Bien");
        district1.addStreet(new Street("Nguyen Hoang", Calendar.getInstance().getTimeInMillis()- Helper.random(10,20)*365*86400000,"Con duong dai dep",Helper.random(0,2),district1));
        district1.addStreet(new Street("Nguyen Van Cu", Calendar.getInstance().getTimeInMillis()- Helper.random(10,20)*365*86400000,"Con duong lich su",Helper.random(0,2),district1));
        District district2 = new District("Hoan Kiem");
        district2.addStreet(new Street("Hang Ngang", Calendar.getInstance().getTimeInMillis()- Helper.random(10,20)*365*86400000,"Con duong lich su",Helper.random(0,2),district2));
        district2.addStreet(new Street("Hang Dao", Calendar.getInstance().getTimeInMillis()- Helper.random(10,20)*365*86400000,"Con duong lich su",Helper.random(0,2),district2));
        District district3 = new District("Ba Dinh");
        district3.addStreet(new Street("Hoang Dieu", Calendar.getInstance().getTimeInMillis()- Helper.random(10,20)*365*86400000,"Con duong lich su",Helper.random(0,2),district3));
        district3.addStreet(new Street("Lieu Giai", Calendar.getInstance().getTimeInMillis()- Helper.random(10,20)*365*86400000,"Con duong lich su",Helper.random(0,2),district3));
        District district4 = new District("Cau Giay");
        district4.addStreet(new Street("Nguyen Phong Sac", Calendar.getInstance().getTimeInMillis()- Helper.random(10,20)*365*86400000,"Con duong lich su",Helper.random(0,2),district4));
        district4.addStreet(new Street("Tran Duy Hung", Calendar.getInstance().getTimeInMillis()- Helper.random(10,20)*365*86400000,"Con duong lich su",Helper.random(0,2),district4));
        District district5 = new District("Dong Da");
        district5.addStreet(new Street("Giang Vo", Calendar.getInstance().getTimeInMillis()- Helper.random(10,20)*365*86400000,"Con duong lich su",Helper.random(0,2),district5));
        district5.addStreet(new Street("Xa Dan", Calendar.getInstance().getTimeInMillis()- Helper.random(10,20)*365*86400000,"Con duong lich su",Helper.random(0,2),district5));
        List<District> districts = Arrays.asList(district1, district2, district3, district4,district5);
        districtService.saveAll(districts);
        return   "ok";
    }

}
