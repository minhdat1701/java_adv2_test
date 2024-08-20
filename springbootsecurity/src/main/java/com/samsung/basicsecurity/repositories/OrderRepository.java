package com.samsung.basicsecurity.repositories;

import com.samsung.basicsecurity.repositories.models.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Orders, Long> {
}
