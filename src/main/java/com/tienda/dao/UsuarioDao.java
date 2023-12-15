package com.tienda.dao;

//import com.tienda.domain.Categoria;
import com.tienda.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Daniel
 */
public interface UsuarioDao extends JpaRepository<Usuario, Long> {

    //Se hace una búsqueda por username
    public Usuario findByUsername(String username);

    Usuario findByUsernameAndPassword(String username, String Password);

    Usuario findByUsernameOrCorreo(String username, String correo);

    boolean existsByUsernameOrCorreo(String username, String correo);

}
