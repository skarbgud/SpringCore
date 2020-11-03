package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
// @ComponentScan 디폴트는 해당 클래스가 있는 위치의 패키지를 다 스캔한다.
// 권장방법 -> 프로젝트의 최상단에 두어서 모든 컴포넌트들을 스캔
/* 컴포넌트 스캔 기본 대상
    @Component: 컴포넌트 스캔에서 사용
    @Controller: 스프링 MVC 컨트롤러에서 사용
    @Service: 스프링 비즈니스 로직에 사용
    @Repository: 스프링 데이터 접근 계층 사용
    @Configuration: 스프링 설정 정보 사용
 */
@ComponentScan(
        // basePackages: 탐색할 패키지의 시작 위치를 지정한다.
        basePackages = "hello.core.member",
        // AppConfig도 @Component이기 때문에 제외한다 (@Configuration이 붙은것 제외)
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {

}
