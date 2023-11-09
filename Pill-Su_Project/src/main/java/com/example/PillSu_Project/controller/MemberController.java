package com.example.PillSu_Project.controller;


import com.example.PillSu_Project.dto.MemberForm;


import com.example.PillSu_Project.entity.Member;

import com.example.PillSu_Project.repository.MemberRepository;
//import com.example.PillSu_Project.sevice.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class MemberController {
    @Autowired // 스프링 부트가 미리 생성해 놓은 객체를 가져다가 자동 연결71231
    private MemberRepository memberRepository;

//    @Autowired
//    private MemberService memberService;

    @GetMapping("/joins/join")
    public String memberJoin() {
        return "joins/join";
    }

    @PostMapping("/joins/new")
    public String createMember(MemberForm form) {
         //1. 디티오 > 엔티티 변환
        Member member = form.toEntity() ;
        System.out.println(member.toString());

        // 2. 리포지토리에게 엔티티를 DB로 저장하게 한다
        Member saved = memberRepository.save(member);
        System.out.println(saved.toString());
        return " ";

    }
}
