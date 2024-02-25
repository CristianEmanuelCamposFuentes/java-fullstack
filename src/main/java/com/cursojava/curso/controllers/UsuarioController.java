package com.cursojava.curso.controllers;

import com.cursojava.curso.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UsuarioController {

    @RequestMapping(value = "/usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Cristian");
        usuario.setApellido("Campos");
        usuario.setEmail("cristiancampos@example.com");
        usuario.setTelefono("123456789");
        return usuario;
    }
    @RequestMapping(value = "/usuario2")
    public Usuario editar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Cristian");
        usuario.setApellido("Campos");
        usuario.setEmail("cristiancampos@example.com");
        usuario.setTelefono("123456789");
        return usuario;
    }
    @RequestMapping(value = "/usuario3")
    public Usuario eliminar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Cristian");
        usuario.setApellido("Campos");
        usuario.setEmail("cristiancampos@example.com");
        usuario.setTelefono("123456789");
        return usuario;
    }
    @RequestMapping(value = "/usuario4")
    public Usuario buscar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Cristian");
        usuario.setApellido("Campos");
        usuario.setEmail("cristiancampos@example.com");
        usuario.setTelefono("123456789");
        return usuario;
    }
}
