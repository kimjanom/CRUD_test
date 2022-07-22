package com.test.service;

import com.test.Repsitory.MemberRepository;
import com.test.dto.BookDto;
import com.test.dto.Member;
import com.test.dto.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import javax.persistence.EntityManager;
import javax.transaction.Transactional;
@Service
public class CRUDService {
//    SimpleJpaRepository
    @Autowired
    EntityManager em;
    @Autowired
    private MemberRepository memberRepository;
    @Transactional
    public void save(){

//        BookDto bookDto = new BookDto();
//        bookDto.setTitle("1");
//        bookDto.setWriter("1");
//        memberRepository.save(bookDto);
        Team team = new Team();
        team.setTeamName("test");
        em.persist(team);

        Member member = new Member();
        member.setMemberName("memberTest");
        //member객체에 team객체를 넣어 관계를 맺는다
        member.setTeam(team);
        em.persist(member);
//        em.createQuery()
    }
    @Transactional
    public void read(){

    }
}
