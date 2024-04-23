package org.jaroso.appbd.repositories;

import org.jaroso.appbd.entitis.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepository extends JpaRepository<Empleado,Long> {

}
