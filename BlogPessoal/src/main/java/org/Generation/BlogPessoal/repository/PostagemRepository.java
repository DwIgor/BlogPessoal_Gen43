package org.Generation.BlogPessoal.repository;

import java.util.List;

import org.Generation.BlogPessoal.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {

		public List <Postagem> findAllByTituloContainIngnoreCase(String Titulo);
}
