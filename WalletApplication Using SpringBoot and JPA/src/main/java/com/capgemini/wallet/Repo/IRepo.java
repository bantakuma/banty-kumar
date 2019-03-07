package com.capgemini.wallet.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.wallet.Customer;
public interface IRepo extends JpaRepository<Customer, String> {


}
