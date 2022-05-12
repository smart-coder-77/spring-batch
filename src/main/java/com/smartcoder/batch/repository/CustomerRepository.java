package com.smartcoder.batch.repository;

import com.smartcoder.batch.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * @author Choudhury Subham on 12-05-2022
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer , Serializable> {
}
