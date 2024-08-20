package com.samsung.basicsecurity.repositories;

import com.samsung.basicsecurity.repositories.models.Catalogs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CatalogsRepository extends JpaRepository<Catalogs, Long> {
}
