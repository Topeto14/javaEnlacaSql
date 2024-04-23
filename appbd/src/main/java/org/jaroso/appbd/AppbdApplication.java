package org.jaroso.appbd;

import org.jaroso.appbd.entitis.Empleado;
import org.jaroso.appbd.repositories.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppbdApplication implements CommandLineRunner {
	@Autowired

	EmpleadoRepository empleadoRepository;

	public static void main(String[] args) {

		SpringApplication.run(AppbdApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Empleado emp1 = new Empleado();
		emp1.setEdad(24);
		emp1.setApellido("jaroso");
		emp1.setNombre("Joaquin");
		empleadoRepository.save(emp1);
	}
}
