package com.bit.springbootdemo.mapper;

import com.bit.springbootdemo.dto.MemberDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {
    void join (MemberDto memberDto);

    int memberCnt(MemberDto memberDto);

    MemberDto login(MemberDto memberDto);
}
