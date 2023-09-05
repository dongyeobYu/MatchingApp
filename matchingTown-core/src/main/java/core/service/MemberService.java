package core.service;

import core.entity.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import core.repository.MemberRepository;

@Service
@RequiredArgsConstructor
public class MemberService {

    private MemberRepository memberRepository;

    public Long join(Member member) {

        memberRepository.save(member);

        return member.getId();
    }

}
