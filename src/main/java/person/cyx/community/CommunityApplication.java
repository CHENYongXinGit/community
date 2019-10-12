package person.cyx.community;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * CommunityApplication
 * @author chenyongxin
 * @date 2019/09/27
 * */
@SpringBootApplication
@MapperScan("person.cyx.community.mapper")
public class CommunityApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommunityApplication.class, args);
    }

}
