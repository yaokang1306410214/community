package learn.community.mapper;

import learn.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    @Insert("INSERT INTO USER (ACCOUNT_ID,NAME,TOKEN,GMT_CREATE,GMT_MODIFIED) VALUES (#{accountId},#{name},#{token},#{gmtCreate},#{gmtModified})")
    void inert(User user);
}
