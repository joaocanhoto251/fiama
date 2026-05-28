package com.example.biolab.Controller;

import com.example.biolab.entities.Usuario;
import com.example.biolab.repositories.Usuariorepositories;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("usuario")
public class Usuariocontroller {
    private final Usuariorepositories usuariorepositories;

    public Usuariocontroller(Usuariorepositories usuariorepositories) {
        this.usuariorepositories = usuariorepositories;
    }

    @PostMapping
    public Usuario criarusuario(@RequestBody Usuario u) {
        Usuario usuario = new Usuario(u.getNome(), u.getEmail());
        usuariorepositories.save(usuario);
        return usuario;
    }
    @GetMapping
    public List<Usuario> mostrarUsuario(){
     List<Usuario> listaUsuarios = usuariorepositories.findAll();
        return listaUsuarios;
    }
}