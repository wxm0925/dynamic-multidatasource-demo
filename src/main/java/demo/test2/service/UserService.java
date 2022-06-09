package demo.test2.service;

import demo.test.config.DS;
import demo.test.config.DataSourceEnum;
import demo.test.config.DynamicDataSourceHolder;
import demo.test2.mapper.UserMapper;
import demo.test2.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wenxiangmin
 * @ClassName UserService.java
 * @Description TODO
 * @createTime 2022年06月09日 10:31:00
 */
@Service
@DS(value = DataSourceEnum.TEST2)
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User getUserById(Long id){
        return userMapper.selectByPrimaryKey(id);
    }
}
