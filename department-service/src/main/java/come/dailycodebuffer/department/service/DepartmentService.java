package come.dailycodebuffer.department.service;

import come.dailycodebuffer.department.entity.Department;
import come.dailycodebuffer.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("Inside saveDepartment method of department service");
        return  departmentRepository.save(department);
    }

    public Department findDepartmentById(Long departmentId){
        log.info("Find by id method of department service");
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
