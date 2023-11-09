package com.example.PillSu_Project.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;


@Entity //(name="category")
@NoArgsConstructor
public class Category
    {

        @Id
        @GeneratedValue
        private Integer category_ID;
        @Column
        private Integer product_Category1;
        @Column
        private Integer product_Category2;
        @Column
        private Integer product_Category3;
        @Column
        private Integer product_Category4;
        @Column
        private String product_ID;

        public Category(Integer category_ID, Integer product_Category1, Integer product_Category2, Integer product_Category3, Integer product_Category4, String product_ID) {
            this.category_ID = category_ID;
            this.product_Category1 = product_Category1;
            this.product_Category2 = product_Category2;
            this.product_Category3 = product_Category3;
            this.product_Category4 = product_Category4;
            this.product_ID = product_ID;
        }
    }
