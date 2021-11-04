package com.devsuperior.dsvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.dsvendas.dto.saleSuccessDTO;
import com.devsuperior.dsvendas.dto.saleSumDTO;
import com.devsuperior.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale,Long> {
	
	@Query("SELECT new com.devsuperior.dsvendas.dto.saleSumDTO(obj.seller, SUM(obj.amount)) "
			+ " From Sale AS obj GROUP BY obj.seller")
	List<saleSumDTO> ammountGroupedBySeller();
	
	@Query("SELECT new com.devsuperior.dsvendas.dto.saleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) "
			+ " From Sale AS obj GROUP BY obj.seller")
	List<saleSuccessDTO> successGroupedBySeller();

}
