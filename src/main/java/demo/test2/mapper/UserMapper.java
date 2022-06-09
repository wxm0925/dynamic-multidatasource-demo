package demo.test2.mapper;

import demo.test2.pojo.User;

/**
* @author wen_xm
* @description 针对表【user】的数据库操作Mapper
* @createDate 2022-06-09 10:31:09
* @Entity demo.pojo.User
*/
public interface UserMapper {

    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

}
