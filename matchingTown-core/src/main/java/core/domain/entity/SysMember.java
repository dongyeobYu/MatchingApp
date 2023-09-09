package core.domain.entity;

import jakarta.persistence.*;

import static jakarta.persistence.FetchType.*;

@Entity
@Table(name = "SYS_MEMBER")
public class SysMember {

    @Id @Column(name = "SYS_MEMBER_ID")
    private Long id;

    /**
     *  TODO : Add Column
     * */

    @OneToOne(mappedBy = "sysMember", fetch = LAZY)
    private Member member;
}
