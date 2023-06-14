package com.employee.EmployeeRestApi.service;

import com.employee.EmployeeRestApi.Model.EmployeeModel;
import com.employee.EmployeeRestApi.Model.EmployeeModel1;
import com.employee.EmployeeRestApi.Model.EmployeeModel2;
import com.employee.EmployeeRestApi.exception.NotValidException;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class EmployeeServiceImpl implements EmployeeService{

    List<EmployeeModel> employees=new ArrayList<EmployeeModel>();
    @Override
    public List<EmployeeModel> add(EmployeeModel employee, BindingResult bindingResult) throws NotValidException {
        if (bindingResult.hasErrors()) {
            FieldError error = bindingResult.getFieldErrors().get(0);
            throw new NotValidException(error.getDefaultMessage());
        }else{
            employees.add(employee);
        }

       return employees;
    }

    @Override
    public List<EmployeeModel> deleteById(Integer id, BindingResult bindingResult) {
        if(bindingResult.hasErrors()){
            throw  new NotValidException(bindingResult.getFieldErrors().get(0).getDefaultMessage());
        }
        List<EmployeeModel> deletedEmployees=employees.stream().filter(employee->employee.getEmployeeId()==id).collect(Collectors.toList());
        if(deletedEmployees.get(0)!=null){
            employees.remove(deletedEmployees.get(0));
        }
        return employees;
    }

    @Override
    public List<EmployeeModel> getById(Integer id) {

           List<EmployeeModel> model= employees.stream().filter(employee->employee.getEmployeeId()==id).collect(Collectors.toList());
        System.out.println(model);
        return model;
    }

    @Override
    public List<EmployeeModel> getAll() {
        return employees;
    }

    @Override
    public List<EmployeeModel> getEmployeesByCountry(String name) {
        return employees.stream().filter(employee->employee.getLocation().getLocationCountry().toLowerCase().contains(name)).collect(Collectors.toList());
    }

    @Override
    public List<EmployeeModel> getEmployeesFromVariousCity(String city1, String city2) {
        return employees.stream()
                .filter(employee->employee.getLocation().getLocationName().equalsIgnoreCase(city1)||
                        employee.getLocation().getLocationName().equalsIgnoreCase(city2))
                .collect(Collectors.toList());
    }

    @Override
    public List<EmployeeModel1> employeeBenefitDetails() {
      return   employees.stream()
              .map(employeeModel ->new EmployeeModel1(employeeModel.getEmployeeName(),employeeModel.getBenefits()) )
              .collect(Collectors.toList());

    }

    @Override
    public List<EmployeeModel2> getEmployeeByCountryAndCity(String countryName, String cityName) {
        return employees.stream()
                .filter(employee->employee.getLocation().getLocationCountry().equalsIgnoreCase(countryName)&&
                        employee.getLocation().getLocationName().equalsIgnoreCase(cityName))
                .map(employeeModel ->new EmployeeModel2(employeeModel.getEmployeeName(),employeeModel.getLocation()) )
                .collect(Collectors.toList());
    }


}
