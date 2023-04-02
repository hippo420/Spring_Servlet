package hello.servlet.domain;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Member {
    private Long Id;
    private String username;
    private int age;

    public Member(){

    }
    public Member(String username, int age) {
        this.username = username;
        this.age = age;
    }
}
