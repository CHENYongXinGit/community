package person.cyx.community.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import person.cyx.community.model.User;

/**
 * @program: community
 * @description
 * @author: chenyongxin
 * @create: 2019-09-28 14:28
 **/
@Mapper
public interface UserMapper {

    @Insert("insert into user (name,account_id,token,gmt_create,gmt_modified) values (#{name},#{accountId},#{token},#{gmtCreate},#{gmtModified})")
    void insert(User user);

}
