package com.example.PillSu_Project.controller;


import com.example.PillSu_Project.dto.ProductForm;

import com.example.PillSu_Project.entity.Product;
import com.example.PillSu_Project.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class productController
{
    @Autowired // 스프링 부트가 미리 생성해 놓은 객체를 가져다가 자동 연결
    private ProductRepository productRepository;


    @GetMapping("/Product/productAdd")
    public String productAddition()
    {
        return "Product/productAdd";
    }

    @PostMapping("/product/addition")
    public String addProduct(ProductForm form)
    {
         //1. 디티오 > 엔티티 변환
        Product product = form.toEntity();
        System.out.println(product.toString());


        // 2. 리포지토리에게 엔티티를 DB로 저장하게 한다
        Product add = productRepository.save(product);
        System.out.println(add.toString());
        return "";
    }
}
