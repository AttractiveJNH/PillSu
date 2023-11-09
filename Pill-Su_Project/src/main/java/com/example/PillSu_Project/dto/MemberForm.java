package com.example.PillSu_Project.dto;


//import com.example.PillSu_Project.entity.MemberEntity;


import com.example.PillSu_Project.entity.Member;

import java.sql.Date;

public class MemberForm
{
    private String member_Email;
    private String member_Password;
    private String member_Name;
    private String member_Contact_Number;
    private String member_Address_City;
    private String member_Address_District;
    private  String member_Address_Town;
    private  String member_Address_Detail;
    private  Integer member_Gender;
    private Date member_Birth_Date;

    public MemberForm(String member_Email, String member_Password, String member_Name, String member_Contact_Number, String member_Address_City, String member_Address_District, String member_Address_Town, String member_Address_Detail, Integer member_Gender, Date member_Birth_Date) {
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
        return "MemberForm{" +
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

    public Member toEntity()
    {
        return new Member(member_Email,member_Password,member_Name,member_Contact_Number,member_Address_City,member_Address_District,member_Address_Town,member_Address_Detail,member_Gender,member_Birth_Date);
    }
}
