package come.dailycodebuffer.department.repository;

import come.dailycodebuffer.department.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Long> {
    Department findByDepartmentId(Long departmentId);
}
