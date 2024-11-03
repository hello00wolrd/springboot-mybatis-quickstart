package whu.edu.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import whu.edu.pojo.User;

import java.util.List;

@Mapper//在运行时，会自动生成该接口的实现类对象，交给IOC容器进行管理
public interface UserMapper {
    //查询全部用户信息
    @Select("select * from user")
    public List<User> list();
}
