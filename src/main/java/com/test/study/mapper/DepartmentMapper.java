package com.test.study.mapper;

import com.test.study.bean.Department;
import org.apache.ibatis.annotations.*;


/**
 * @author Kindy
 * @Description:
 * @date
 */
//@Mapper
public interface DepartmentMapper {

    @Select("select  *  from   department  where   id=#{id}")
    public Department getDeptById(Integer id);

    @Delete("delete  from   department  where  id=#{id}")
    public    int   deleteDeptById(Integer  id);


    @Options(useGeneratedKeys = true,keyProperty = "id")   //该注解可以将自增主键添加到对象中
    @Insert("insert  into  department(departmentName)  values(#{departmentName})")
    public   int   insertDept(Department  department);

    @Update("update  department  set  departmentName=#{departmentName}  where  id =#{id}")
    public  int  updateDept(Department  department);

}
