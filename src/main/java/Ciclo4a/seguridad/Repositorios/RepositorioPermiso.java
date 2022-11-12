package Ciclo4a.seguridad.Repositorios;

import Ciclo4a.seguridad.Modelos.Permiso;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface RepositorioPermiso extends MongoRepository<Permiso,String> {
}
