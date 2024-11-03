package whu.edu;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import whu.edu.mapper.UserMapper;
import whu.edu.pojo.User;

import java.util.List;

@SpringBootTest //springboot整合单元测试的注解
class SpringbootMybatisQuickstartApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testListUser() {
        List<User> userlist = userMapper.list();

        userlist.stream().forEach(System.out::println);
    }

}
