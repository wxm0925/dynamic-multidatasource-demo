package demo.test.service;

import demo.test.config.DS;
import demo.test.config.DataSourceEnum;
import demo.test.config.DynamicDataSourceHolder;
import demo.test.mapper.StudentsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wenxiangmin
 * @ClassName StudentService.java
 * @Description TODO
 * @createTime 2022年06月08日 22:08:00
 */
@Service
@DS(value = DataSourceEnum.TEST)
public class StudentService {
    @Autowired
    private StudentsMapper studentMapper;


    public Object getStudent(Long stuId) {
        return studentMapper.selectByPrimaryKey(stuId);
    }
}
