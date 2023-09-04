package repository;

import dto.MemberDto;
import entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

    List<Member> findMemberByNameList(String name);

    Member findMemberByName(String name);
}
