package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberApp {

    public static void main(String[] args) {
//        AppConfig appConfig = new AppConfig();
//        MemberService memberService = appConfig.memberService();
//        MemberService memberService = new MemberServiceImpl();
        //스프링의 컨테이너임 ( 얘가 모든것을 관리함 @Bean이라는것을 다 관리함)
        //AppConfig에있는 환경설정을 가지고 안에있는 @Bean 붙은것들을 스프링 컨테이너에 객채생성해서 다 넣어줌
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);

        Member member = new Member(1l, "Ahnminyoung", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1l);
        System.out.println("member = " + member.getName());
        System.out.println("findMember ::"+ findMember.getName());
    }
}
