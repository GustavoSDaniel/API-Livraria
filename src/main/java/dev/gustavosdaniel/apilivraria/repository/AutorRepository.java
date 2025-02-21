package dev.gustavosdaniel.apilivraria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import dev.gustavosdaniel.apilivraria.model.Autor;

public interface AutorRepository extends JpaRepository<Autor, Long> { //TODAS ENTIDADES QUE FOR FAZER AGUMA INTERAÇÃO COM BANCO TEM QUE TER O REPOSITORY


}
