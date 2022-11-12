package Ciclo4a.seguridad.Repositorios;

import Ciclo4a.seguridad.Modelos.PermisosRoles;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositorioPermisosRoles extends MongoRepository<PermisosRoles,String>{
}
