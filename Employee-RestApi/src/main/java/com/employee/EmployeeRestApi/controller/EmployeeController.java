package com.employee.EmployeeRestApi.controller;

import com.employee.EmployeeRestApi.Model.EmployeeModel;
import com.employee.EmployeeRestApi.Model.EmployeeModel1;
import com.employee.EmployeeRestApi.Model.EmployeeModel2;
import com.employee.EmployeeRestApi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @PostMapping("/add")
    public List<EmployeeModel> getStr(@RequestBody EmployeeModel employeeModel){
        return employeeService.add(employeeModel);
    }
    @DeleteMapping("/deleteById/{id}")
    public List<EmployeeModel> deleteById(@PathVariable Integer id){

        return employeeService.deleteById(id);
    }
    @GetMapping("/getAll")
    public List<EmployeeModel> getAll(){
        return employeeService.getAll();
    }

    @GetMapping("/getById/{id}")
    public List<EmployeeModel> getById(@PathVariable Integer id){

        return employeeService.getById(id);
    }


    @GetMapping("/getEmployeesByCountry/{countryName}")
    public List<EmployeeModel> getEmployeesByCountry(@PathVariable String countryName){
        return employeeService.getEmployeesByCountry(countryName);
    }

@GetMapping("/getEmployeesFromVariousCity/{city1}/{city2}")
    public List<EmployeeModel> getEmployeesFromVariousCity(@PathVariable String city1,@PathVariable String city2){
return employeeService.getEmployeesFromVariousCity(city1,city2);
                }

                @GetMapping("/employeeBenefitDetails")
    public List<EmployeeModel1> employeeBenefitDetails(){
return employeeService.employeeBenefitDetails();
                }

    @GetMapping("/getEmployeedetails")
    public List<EmployeeModel> getEmployeedetails(){
        return employeeService.getAll();
    }

    @GetMapping("/getEmployeeByCountryAndCity/{countryName}/{cityName}")
    public List<EmployeeModel2> getEmployeeByCountryAndCity(@PathVariable String countryName, @PathVariable String cityName){
        return employeeService.getEmployeeByCountryAndCity(countryName,cityName);
    }






}
