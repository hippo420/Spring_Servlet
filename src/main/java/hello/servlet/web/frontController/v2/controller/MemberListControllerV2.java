package hello.servlet.web.frontController.v2.controller;

import hello.servlet.domain.Member;
import hello.servlet.domain.MemberRepository;
import hello.servlet.web.frontController.MyView;
import hello.servlet.web.frontController.v1.ControllerV1;
import hello.servlet.web.frontController.v2.ControllerV2;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

public class MemberListControllerV2 implements ControllerV2 {

    private MemberRepository memberRepository = MemberRepository.getInstance();
    @Override
    public MyView process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Member> memberList = memberRepository.findAll();
        request.setAttribute("memberList",memberList);

        return new MyView("/WEB-INF/views/members.jsp");
    }
}
