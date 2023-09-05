package core.domain.dto;

import core.domain.entity.Member;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberDto {

    private Long id;
    private String name;

    public Member MemberDto(Member member){
        this.id = member.getId();
        this.name = member.getName();

        return member;
    }
}
