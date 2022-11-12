package Ciclo4a.seguridad.Repositorios;

import Ciclo4a.seguridad.Modelos.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositorioUsuario extends MongoRepository<Usuario,String> {
}

