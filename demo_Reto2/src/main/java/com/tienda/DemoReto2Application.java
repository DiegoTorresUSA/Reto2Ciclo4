package com.tienda;

import com.tienda.repository.crud.AccessoryCrudRepository;
import com.tienda.repository.crud.UserCrudRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoReto2Application implements CommandLineRunner{
    @Autowired
    private UserCrudRepository userRepo;
    @Autowired
    private AccessoryCrudRepository accesoryCrud;

	public static void main(String[] args) {
		SpringApplication.run(DemoReto2Application.class, args);
	}
        @Override
    public void run(String... args) throws Exception {
            
        userRepo.deleteAll();
        accesoryCrud.deleteAll();
    }
}
