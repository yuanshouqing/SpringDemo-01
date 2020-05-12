package com.test.study.service.impl;

import com.test.study.bean.Department;
import com.test.study.mapper.DepartmentMapper;
import com.test.study.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author Kindy
 * @Description:
 * @date
 */
@Service
public class DepartmentImpl   implements DepartmentService {


    @Autowired
    private DepartmentMapper  departmentMapper;


    @Override
    @Cacheable(cacheNames = {"emp"})
    public Department getDeptById(Integer id) {
        System.out.println("查询数据库了。。。。。");
        return departmentMapper.getDeptById(id);
    }
}
