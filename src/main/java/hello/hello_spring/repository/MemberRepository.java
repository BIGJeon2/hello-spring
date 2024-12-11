package hello.hello_spring.repository;

import hello.hello_spring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {

    Member save(Member member);
    Optional<Member> finById(Long id);
    Optional<Member> finByName(String name);
    List<Member> findAll();

}
