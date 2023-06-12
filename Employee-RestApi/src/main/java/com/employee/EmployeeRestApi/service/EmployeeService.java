package com.employee.EmployeeRestApi.service;


import com.employee.EmployeeRestApi.Model.EmployeeModel;
import com.employee.EmployeeRestApi.Model.EmployeeModel1;
import com.employee.EmployeeRestApi.Model.EmployeeModel2;

import java.util.List;

public interface EmployeeService {

  List<EmployeeModel> add(EmployeeModel employee);
  List<EmployeeModel> deleteById(Integer deletedId);

  List<EmployeeModel> getById(Integer id);

  List<EmployeeModel> getAll();

  List<EmployeeModel> getEmployeesByCountry(String name);
  List<EmployeeModel> getEmployeesFromVariousCity(String city1,String city2);

  List<EmployeeModel1> employeeBenefitDetails();

  List<EmployeeModel2> getEmployeeByCountryAndCity(String countryName,String cityName);
}
