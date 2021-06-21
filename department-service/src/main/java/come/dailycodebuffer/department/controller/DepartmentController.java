package come.dailycodebuffer.department.controller;

import come.dailycodebuffer.department.entity.Department;
import come.dailycodebuffer.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        log.info("Inside saveDepartment method of DepartmentContoller");
        return  departmentService.saveDepartment(department);
    }
    @GetMapping("/{id}")
    public  Department findDepartmentByID(@PathVariable("id") Long departmentId){
        log.info("Inside findDepartmentByID method of DepartmentController");
        return departmentService.findDepartmentById(departmentId);
    }
//    @GetMapping("/")
//    public Department findAllDepartments(Department department){
//        return departmentService.findAllDepartments(department);
//    }
}
