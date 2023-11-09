package com.example.PillSu_Project.dto;


//import com.example.PillSu_Project.entity.MemberEntity;


import com.example.PillSu_Project.entity.Member;
import com.example.PillSu_Project.entity.Product;
import org.springframework.data.relational.core.sql.In;

import java.sql.Date;

public class ProductForm
{
    private String product_ID;
    private String product_Name;
    private Integer product_Price;
    private String product_Description;
    private String product_Image1;
    private String product_Image2;
    private  String product_Image3;


    public ProductForm(String product_ID, String product_Name, Integer product_Price, String product_Description, String product_Image1, String product_Image2, String product_Image3) {
        this.product_ID = product_ID;
        this.product_Name = product_Name;
        this.product_Price = product_Price;
        this.product_Description = product_Description;
        this.product_Image1 = product_Image1;
        this.product_Image2 = product_Image2;
        this.product_Image3 = product_Image3;

    }




    public Product toEntity()
    {
        return new Product(product_ID,product_Name,product_Price,product_Description,product_Image1,product_Image2,product_Image3);
     }
}
