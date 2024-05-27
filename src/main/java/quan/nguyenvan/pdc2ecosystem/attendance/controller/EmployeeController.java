package quan.nguyenvan.pdc2ecosystem.attendance.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import quan.nguyenvan.pdc2ecosystem.attendance.model.Employee;
import quan.nguyenvan.pdc2ecosystem.attendance.service.EmployeeService;
import quan.nguyenvan.pdc2ecosystem.common.pagehandle.PageResponse;
import quan.nguyenvan.pdc2ecosystem.common.pagehandle.impl.PageResponseImpl;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService empService;

    @GetMapping("/")
    public String getHome() {
        return "index";
    }
    @GetMapping("/employees")
    public String getAllProducts(Model model,
                                 @RequestParam(required = false, defaultValue = "1") int page,
                                 @RequestParam(required = false, defaultValue = "50") int pageSize) {
        PageResponse<Employee> pageData = new PageResponseImpl<>(empService.getAllEmployees(), page, pageSize);
        model.addAttribute("pageData", pageData);
        return "/attendance/employee-list";
    }

    @GetMapping("/products/{id}")
    public String getProductById(Model model, @PathVariable int id) {
        Employee product = empService.getProductById(id);
        model.addAttribute("product", product);
        return "product-detail";
    }

    @GetMapping("/products/name-starts/{prefix}")
    public String getProductsByNamePrefix(Model model, @PathVariable String prefix) {
        List<Employee> products = empService.getProductsByNamePrefix(prefix);
        model.addAttribute("products", products);
        return "product-list";
    }


}
