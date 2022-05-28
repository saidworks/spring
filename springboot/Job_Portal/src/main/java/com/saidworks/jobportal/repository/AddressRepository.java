package com.saidworks.jobportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saidworks.jobportal.model.Address;

public interface AddressRepository extends JpaRepository<Address, String> {

}
