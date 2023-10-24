package com.azy.service.impl;

import com.azy.entity.Employee;
import com.azy.mapper.EmployeeMapper;
import com.azy.service.EmployeeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
