package hello2.hello_spring2;
import hello2.hello_spring2.repository.JdbcMemberRepository;
import hello2.hello_spring2.repository.MemberRepository;
import hello2.hello_spring2.repository.MemomryMemberRepository;
import hello2.hello_spring2.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    DataSource dataSource;

    @Autowired
    public SpringConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
//        return new MemomryMemberRepository();
        return new JdbcMemberRepository(dataSource);
    }
}
