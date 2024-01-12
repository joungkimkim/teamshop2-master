package com.shop.repository;

import com.shop.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MemberRepository extends JpaRepository<Member,Long> {

    Member findByEmail(String email);

    @Query(value = "SELECT * FROM member where member_id=?", nativeQuery = true)
    Member findByMemberId(@Param("id") Long id);
}
