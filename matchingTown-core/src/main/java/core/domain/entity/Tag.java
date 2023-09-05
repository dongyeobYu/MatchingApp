package core.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Tag {

    @Id @Column(name = "TAG_ID")
    private Long id;

    @Column(name = "TAG_NAME")
    private String name;

    /**
     * TODO : Add Column
     * */

    /**
     *  mappedBy -> Member 테이블에 Tag 와 매핑 되었음을 의미
     * */
    @OneToOne(mappedBy = "Tag")
    private Member member;

}
