package com.hamdibouallegue.datarestdemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hamdibouallegue.datarestdemo.models.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
