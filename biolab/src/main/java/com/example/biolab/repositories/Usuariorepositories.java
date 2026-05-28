package com.example.biolab.repositories;

import com.example.biolab.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Usuariorepositories extends JpaRepository<Usuario,Long> {
}
