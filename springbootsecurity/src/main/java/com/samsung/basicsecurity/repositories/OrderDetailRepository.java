package com.samsung.basicsecurity.repositories;

import com.samsung.basicsecurity.repositories.models.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository<OrderDetails, Long> {
}
