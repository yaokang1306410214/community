package learn.community.mapper;

import learn.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Insert("INSERT INTO USER (ACCOUNT_ID,NAME,TOKEN,GMT_CREATE,GMT_MODIFIED) VALUES (#{accountId},#{name},#{token},#{gmtCreate},#{gmtModified})")
    void inert(User user);

    @Select("SELECT * FROM USER WHERE USER TOKEN = #{token}")
    User findByToken(@Param("token") String token);
}
