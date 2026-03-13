package dio.my_rest_api.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import dio.my_rest_api.handler.CampoObrigatorioException;
import dio.my_rest_api.model.Usuario;

@Repository
public class UsuarioRepository {
    public void save(Usuario usuario) {
        if(usuario.getLogin()==null)
            throw new CampoObrigatorioException("Login");
        if(usuario.getPassword()==null)
            throw new CampoObrigatorioException("Password");
        if(usuario.getId()==null)
            System.out.println("SAVE - recebendo o usuario na camada de repositorio");
        else
            System.out.println("UPDATE - recebendo o usuario na camada de repositorio");

        System.out.println(usuario);
    }
    public void deleteById(Integer id) {
        System.out.println(String.format("DELETE/id - recebendo o id %d para excluir um usuario", id));
        System.out.println(id);
    }
    public List<Usuario> findAll() {
        System.out.println("LIST - listando os usuarios do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("carlos","password"));
        usuarios.add(new Usuario("henrique","masterpass"));
        return usuarios;
    }
    public Usuario findById(Integer id) {
        System.out.println(String.format("FIND/id - recebendo o id %d para localizar um usuario", id));
        return new Usuario("carlos","password");
    }
    public Usuario findByUsername(String username) {
        System.out.println(String.format("FIND/username - recebendo o username %s para localizar um usuario", username));
        return new Usuario("carlos","password");
    }
} 