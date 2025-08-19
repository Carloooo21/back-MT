package com.example.registro.Repositorio;

import com.example.registro.Entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface usuarioRepositorio extends JpaRepository<Usuario, Long> {


}
