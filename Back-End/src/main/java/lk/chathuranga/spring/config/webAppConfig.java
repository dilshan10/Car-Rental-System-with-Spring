package lk.chathuranga.spring.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//@ComponentScan(basePackageClasses = {CustomerController.class, AppWideExceptionHandler.class})
@ComponentScan(basePackages = "lk.chathuranga.spring")
@Configuration
@EnableWebMvc
public class webAppConfig {
}
