package com.example.PillSu_Project.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;

import java.sql.Date;



@Entity //(name="member")
@NoArgsConstructor
@DynamicInsert
public class Member
    {
        @Id
        @Column

        private String member_Email;
        @Column
        private String member_Password;
        @Column
        private String member_Name;
        @Column
        private String member_Contact_Number;
        @Column
        private String member_Address_City;
        @Column
        private String member_Address_District;
        @Column
        private String member_Address_Town;
        @Column
        private String member_Address_Detail;
        @Column
        private Integer member_Gender;
        @Column
        private Date member_Birth_Date;

        public Member(String member_Email, String member_Password, String member_Name, String member_Contact_Number, String member_Address_City, String member_Address_District, String member_Address_Town, String member_Address_Detail, Integer member_Gender, Date member_Birth_Date) {
            this.member_Email = member_Email;
            this.member_Password = member_Password;
            this.member_Name = member_Name;
            this.member_Contact_Number = member_Contact_Number;
            this.member_Address_City = member_Address_City;
            this.member_Address_District = member_Address_District;
            this.member_Address_Town = member_Address_Town;
            this.member_Address_Detail = member_Address_Detail;
            this.member_Gender = member_Gender;
            this.member_Birth_Date = member_Birth_Date;
        }

        @Override
        public String toString() {
            return "member{" +
                    "member_Email='" + member_Email + '\'' +
                    ", member_Password='" + member_Password + '\'' +
                    ", member_Name='" + member_Name + '\'' +
                    ", member_Contact_Number='" + member_Contact_Number + '\'' +
                    ", member_Address_City='" + member_Address_City + '\'' +
                    ", member_Address_District='" + member_Address_District + '\'' +
                    ", member_Address_Town='" + member_Address_Town + '\'' +
                    ", member_Address_Detail='" + member_Address_Detail + '\'' +
                    ", member_Gender=" + member_Gender +
                    ", member_Birth_Date=" + member_Birth_Date +
                    '}';
        }
    }
