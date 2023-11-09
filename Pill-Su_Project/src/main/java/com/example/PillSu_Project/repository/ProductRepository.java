package com.example.PillSu_Project.repository;

import com.example.PillSu_Project.entity.Member;
import com.example.PillSu_Project.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, String>
{

}
