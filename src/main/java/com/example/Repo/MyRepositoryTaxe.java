
package com.example.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.Model.Taxe;

@Repository
public interface MyRepositoryTaxe  extends JpaRepository<Taxe, Integer> {
    // You can add custom query methods here if needed
}