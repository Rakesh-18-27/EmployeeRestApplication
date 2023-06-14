package com.employee.EmployeeRestApi.service;


import com.employee.EmployeeRestApi.Model.EmployeeModel;
import com.employee.EmployeeRestApi.Model.EmployeeModel1;
import com.employee.EmployeeRestApi.Model.EmployeeModel2;
import org.springframework.validation.BindingResult;

import java.util.List;

public interface EmployeeService {

  List<EmployeeModel> add(EmployeeModel employee, BindingResult bindingResult);
  List<EmployeeModel> deleteById(Integer id);

  List<EmployeeModel> getById(Integer id);

  List<EmployeeModel> getAll();

  List<EmployeeModel> getEmployeesByCountry(String name);
  List<EmployeeModel> getEmployeesFromVariousCity(String city1,String city2);

  List<EmployeeModel1> employeeBenefitDetails();

  List<EmployeeModel2> getEmployeeByCountryAndCity(String countryName,String cityName);
}
