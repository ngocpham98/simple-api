package com.ecommerce.repository;

import com.ecommerce.entity.AuthenticationToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface TokenRepository extends JpaRepository<AuthenticationToken, Long> {
}
