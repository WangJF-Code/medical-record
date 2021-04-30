package com.nickel.medicalrecord;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan({"com.nickel.medicalrecord.repository"})
@SpringBootApplication
public class MedicalRecordApplication {

    public static void main(String[] args) {
        SpringApplication.run(MedicalRecordApplication.class, args);
    }

}
