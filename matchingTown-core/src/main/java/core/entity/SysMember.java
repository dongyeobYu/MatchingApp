package core.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "SYS_MEMBER")
public class SysMember {

    @Id @Column(name = "SYS_MEMBER_ID")
    private Long id;

    /**
     *  TODO : Add Column
     * */

    @OneToOne(mappedBy = "sysMember")
    private Member member;
}
