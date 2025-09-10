package com.sp.portfolio.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.sp.portfolio.entites.Client;


public interface ClientRepositories extends JpaRepository< Client, Integer> {

}
