package core.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.ToString;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import static jakarta.persistence.FetchType.*;

@Entity
@Getter
@ToString
@EntityScan
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

    @OneToOne(fetch = LAZY)
    @JoinColumn(name = "TAG_ID")
    private Tag Tag;

    @OneToOne(fetch = LAZY)
    @JoinColumn(name = "SYS_MEMBER_ID")
    private SysMember sysMember;

    /**
     *  1: Yes -> 사용
     *  0: No  -> 미사용
     * */
    @Column(name = "USE_YN")
    private String useYN;

}
