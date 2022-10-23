package com.xiaofu.jpa.mapsId;

import com.xiaofu.jpa.mapsId.sharePrimaryKey.entity.Employee;
import com.xiaofu.jpa.mapsId.sharePrimaryKey.entity.EmployeeInfo;
import com.xiaofu.jpa.mapsId.sharePrimaryKey.repository.EmployeeInfoRepository;
import com.xiaofu.jpa.mapsId.sharePrimaryKey.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author Administrator
 * @Date 2022/10/23 20:26
 * @Version 1.0
 */
@SpringBootTest
public class TestMapsId {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private EmployeeInfoRepository infoRepository;

    @Test
    public void test() {
        Employee employee = new Employee();
        EmployeeInfo employeeInfo = new EmployeeInfo();
        employeeInfo.setInformation("hello world");
        employee.setInfo(employeeInfo);
        employee.setName("hello");
        employeeRepository.save(employee);

    }

}
