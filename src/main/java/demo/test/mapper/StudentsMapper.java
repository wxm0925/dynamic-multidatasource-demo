package demo.test.mapper;

import demo.test.pojo.Students;
import org.apache.ibatis.annotations.Param;

/**
 * @author wenxiangmin
 * @ClassName StudentMapper.java
 * @Description TODO
 * @createTime 2022年06月08日 22:10:00
 */
/**
 * @author wen_xm
 * @description 针对表【students】的数据库操作Mapper
 * @createDate 2022-06-08 22:37:28
 * @Entity generator.pojo.Students
 */
public interface StudentsMapper {

    Students selectByPrimaryKey(@Param("stuId") Long stuId);

}
