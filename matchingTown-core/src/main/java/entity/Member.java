package entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@ToString
@Table(name = "MEMBER")
public class Member {

    @Id @Column(name = "MEMBER_ID", nullable = false, length = 20)
    private Long id;

    @Column(name = "MEMBER_NAME", nullable = false)
    private String name;

    @Column(name = "PHONE_NUMBER")
    private String number;

    @Column(name = "MEMBER_LOC")
    private String location;

    @Column(name = "MAIL_ADDR")
    private String mailAddr;

    @OneToOne
    @JoinColumn(name = "TAG_ID")
    private Tag Tag;

    @OneToOne
    @JoinColumn(name = "SYS_MEMBER_ID")
    private SysMember sysMember;

    /**
     *  1: Yes -> 사용
     *  0: No  -> 미사용
     * */
    @Column(name = "USE_YN")
    private String useYN;

}
