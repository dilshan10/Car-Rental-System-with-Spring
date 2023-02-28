package lk.chathuranga.spring.config;


import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({JPAConfig.class})
@ComponentScan(basePackages = "lk.chathuranga.spring")
public class webRootConfig {
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}