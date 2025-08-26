package hello2.hello_spring2.repository;

import hello2.hello_spring2.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {

    //JPOL select m from Member m wehere m.name = ?
    @Override
    Optional<Member> findByName(String name);
}
