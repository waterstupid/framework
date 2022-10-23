package com.xiaofu.jpa.mapsId.sharePrimaryKey.repository;

import com.xiaofu.jpa.mapsId.sharePrimaryKey.entity.Employee;
import org.springframework.data.repository.CrudRepository;

/**
 * @Author Administrator
 * @Date 2022/10/23 20:27
 * @Version 1.0
 */
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
