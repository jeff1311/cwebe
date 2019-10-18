package com.ljf.cwebe;

import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ljf.cwebe.dao.mapper")
public class CwebeApplication {

    public static void main(String[] args) {
        SpringApplication.run(CwebeApplication.class, args);
    }

}
