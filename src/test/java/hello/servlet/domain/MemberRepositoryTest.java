package hello.servlet.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class MemberRepositoryTest {
    MemberRepository memberRepository = MemberRepository.getInstance();
    @AfterEach
    void clearRepository(){
        memberRepository.clearStore();
    }

    @Test
    @DisplayName("회원저장하기")
    void save(){
        Member member = new Member("gae1",20);
        Member savedMember = memberRepository.save(member);

        Member findMember = memberRepository.findById(savedMember.getId());
        Assertions.assertThat(findMember).isEqualTo(savedMember);
    }


    @Test
    @DisplayName("모든 회원 조회하기")
    void findAll(){
        Member m1 = new Member("gae1",20);
        Member m2 = new Member("gae2",20);

        memberRepository.save(m1);
        memberRepository.save(m2);

        List<Member> memberList= memberRepository.findAll();
        Assertions.assertThat(memberList.size()).isEqualTo(2);
        Assertions.assertThat(memberList).contains(m1,m2);
    }
}
