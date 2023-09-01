package api.test;

import entity.Member;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

    @GetMapping("/")
    public String test(){
        Member member = new Member();
        member.setId(1L);
        member.setName("YES");

        return member.toString();
    }
}
