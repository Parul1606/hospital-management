package com.simpleproject.hospital_management.controller;

import com.simpleproject.hospital_management.model.Doctor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/doctor/apis")
public class DoctorController {


    //spring boot application - takes input in the form of JSON(js object notation)-  it is like the key value pair
    //POST MAPPING

    //why we are saving that data using hashmap? -> b'coz rn we havent connected with the mysql db that's why we are using hashmap to store the data.
    //here we are storing data inside hashmap which is in memory
    Map<Integer, Doctor> doctorMapDb = new HashMap<>();
    //101 -> {101, ajay,ajay@gmail.com,cardio,32}
    //102 -> {102, vijay,vijay@gmail.com,cardio,38}
    //103 -> {103, sanjay,sanjay@gmail.com,cardio,37}

    @PostMapping("/save")
    public String saveDoctor(Doctor doctor){
        doctorMapDb.put(doctor.getId(), doctor);
        System.out.println("doctor data is saved : " + doctorMapDb);
        return "Doctor saved successfully";
    }
}
