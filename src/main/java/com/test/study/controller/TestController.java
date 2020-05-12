package com.test.study.controller;

import com.test.study.bean.Department;
import com.test.study.bean.Employee;
import com.test.study.mapper.DepartmentMapper;
import com.test.study.mapper.EmployeeMapper;
import com.test.study.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Kindy
 * @Description:
 * @date
 */

@RestController
public class TestController {


    @Autowired
    DepartmentService departmentService;


    @Autowired
    DepartmentMapper departmentMapper;

    @Autowired
    EmployeeMapper employeeMapper;


    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    StringRedisTemplate stringRedisTemplate;


    /**
     * @Description:根据id查询数据 请求路径：http://localhost:8080/dept/1
     * @author Kindy
     * @date 2020/5/11
     */
    @GetMapping(value = "/dept/{id}")
    public Department getDepartmntById(@PathVariable("id") Integer id) {
        return departmentService.getDeptById(id);
    }


    /**
     * @Description:请求路径：http://localhost:8080/insert?departmentName=人事部
     * @author Kindy
     * @date 2020/5/11
     */
    @GetMapping(value = "/insert")
    public Department insertData(Department department) {
        departmentMapper.insertDept(department);

        return department;
    }


    /**
     * @Description:根据id获取员工
     * @author Kindy
     * @date 2020/5/11
     */
    @GetMapping(value = "/Emp/{id}")
    public Employee getEmp(@PathVariable("id") Integer id) {
        System.out.println("调用啦‘’‘’‘’‘’");
        return employeeMapper.getEmpById(id);

    }


    /**
     * @Description:
     * @author Kindy
     * @date 2020/5/12
     */
    @GetMapping(value = "redis/mylist")
    public String redisTest() {
        stringRedisTemplate.opsForValue().append("mylist", "yuanshouqing");
        String mylist = stringRedisTemplate.opsForValue().get("mylist");

        return mylist;
    }


}
