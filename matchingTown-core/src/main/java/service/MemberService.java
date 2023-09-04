package service;

import dto.MemberDto;
import entity.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import repository.MemberRepository;

@Service
@RequiredArgsConstructor
public class MemberService {

    private MemberRepository memberRepository;

    public Long join(Member member) {

        memberRepository.save(member);

        return member.getId();
    }

}
