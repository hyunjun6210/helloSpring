package hello2.hello_spring2;
import hello2.hello_spring2.repository.MemberRepository;
import hello2.hello_spring2.repository.MemomryMemberRepository;
import hello2.hello_spring2.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemomryMemberRepository();
    }
}
