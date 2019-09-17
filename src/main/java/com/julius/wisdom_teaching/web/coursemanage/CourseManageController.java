package com.julius.wisdom_teaching.web.coursemanage;

import com.julius.wisdom_teaching.domain.entity.Course;
import com.julius.wisdom_teaching.service.CourseService;
import com.julius.wisdom_teaching.util.CommonResult;
import com.julius.wisdom_teaching.util.GlobalUrlMapping;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * author julius.zhu
 * date   2019/9/17
 * time   8:43
 * describe:
 * 课程管理Controller
 */
@CrossOrigin(origins = "*")
@RestController
public class CourseManageController {
    private final CourseService courseService;

    @Autowired
    public CourseManageController(CourseService courseService) {
        this.courseService = courseService;
    }


}
