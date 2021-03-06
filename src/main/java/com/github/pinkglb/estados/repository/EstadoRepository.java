package com.github.pinkglb.estados.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.github.pinkglb.estados.modelo.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Long> {
	@Query("SELECT t FROM Estado t ORDER BY t.regiao ASC, t.populacao DESC")
	List<Estado> carregarEstados();
	
	@Query("SELECT t FROM Estado t ORDER BY t.populacao DESC")
	List<Estado> carregarEstadosPopulacao();
	
	@Query("SELECT t FROM Estado t ORDER BY t.regiao")
	List<Estado> carregarEstadosRegiao();
	
	@Query("SELECT t FROM Estado t ORDER BY t.area DESC")
	List<Estado> carregarEstadosArea();
}
