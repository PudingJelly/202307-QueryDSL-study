package com.example.study.repository;

import com.example.study.entity.Member;

import java.util.List;

public interface MemberRopositoryCustom {

    List <Member> findByName(String name);

}
