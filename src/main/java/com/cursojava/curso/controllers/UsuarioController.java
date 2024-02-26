package com.cursojava.curso.controllers;

import com.cursojava.curso.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class UsuarioController {

    @RequestMapping(value = "/usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id) {
        Usuario usuario = new Usuario();
        usuario.setId(1L);
        usuario.setNombre("Cristian");
        usuario.setApellido("Campos");
        usuario.setEmail("cristiancampos@example.com");
        usuario.setTelefono("123456789");
        return usuario;
    }

    @RequestMapping(value = "/usuario/{id}")
    public List<Usuario> getUsuarioLista(@PathVariable Long id) {
        List<Usuario> usuarios = new ArrayList<>();

        Usuario usuario = new Usuario();
        usuario.setId(2L);
        usuario.setNombre("Emanuel");
        usuario.setApellido("Campos");
        usuario.setEmail("cristiancampos@example.com");
        usuario.setTelefono("123456789");

        Usuario usuario2 = new Usuario();
        usuario2.setId(3L);
        usuario2.setNombre("Juan");
        usuario2.setApellido("Perez");
        usuario2.setEmail("juanperez@example.com");
        usuario2.setTelefono("555555555");

        Usuario usuario3 = new Usuario();
        usuario3.setId(4L);
        usuario3.setNombre("Marina");
        usuario3.setApellido("Lopez");
        usuario3.setEmail("marinalopez@example.com");
        usuario3.setTelefono("333333333");

        Usuario usuario4 = new Usuario();
        usuario4.setId(5L);
        usuario4.setNombre("Pedro");
        usuario4.setApellido("Ramirez");
        usuario4.setEmail("pedroramirez@example.com");
        usuario4.setTelefono("999999999");

        // Agregar usuarios a la lista
        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        usuarios.add(usuario4);
        return usuarios;
    }

    @RequestMapping(value = "/usuario2")
    public Usuario editar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Cristian");
        usuario.setApellido("Campos");
        usuario.setEmail("cristiancampos@example.com");
        usuario.setTelefono("123456789");
        return usuario;
    }

    @RequestMapping(value = "/usuario3")
    public Usuario eliminar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Cristian");
        usuario.setApellido("Campos");
        usuario.setEmail("cristiancampos@example.com");
        usuario.setTelefono("123456789");
        return usuario;
    }

    @RequestMapping(value = "/usuario4")
    public Usuario buscar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Cristian");
        usuario.setApellido("Campos");
        usuario.setEmail("cristiancampos@example.com");
        usuario.setTelefono("123456789");
        return usuario;
    }
}
