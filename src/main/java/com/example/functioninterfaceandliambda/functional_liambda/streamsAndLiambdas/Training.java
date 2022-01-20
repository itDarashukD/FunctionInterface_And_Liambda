package com.example.functioninterfaceandliambda.functional_liambda.streamsAndLiambdas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Training {

    public static class Employee{
        private String name ;
        private Integer age;
        private String jobTitle;
        private Integer salary;

        public Employee(String name, Integer age, String jobTitle, Integer salary) {
            this.name = name;
            this.age = age;
            this.jobTitle = jobTitle;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public String getJobTitle() {
            return jobTitle;
        }

        public void setJobTitle(String jobTitle) {
            this.jobTitle = jobTitle;
        }

        public Integer getSalary() {
            return salary;
        }

        public void setSalary(Integer salary) {
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", jobTitle='" + jobTitle + '\'' +
                    ", salary=" + salary +
                    '}';
        }
    }

    public static void main(String[] args) {

        Employee []employees = {
                new Employee("Dima",23," jun",500),
                new Employee("qqq",25," middle",1000),
                new Employee("www",54," sen",3000),
                new Employee("eee",44,"arch",5000),
                new Employee("ewee",434,"arch",5000),
        };

        List<Employee>employeeList = Arrays.asList(employees);
        Integer reduce = employeeList.stream()
                .map(employee -> employee.getSalary())
                .reduce(0, Integer::sum);

        Integer reduce1 = employeeList.stream()
                .map(employee -> employee.getSalary())
                .reduce(0, (acc, x) -> acc + x);

        int sum = employeeList.stream()
                .map(employee -> employee.getSalary())
                .mapToInt(x -> x).sum();

        List<Employee> collect = employeeList.stream()
                .filter(employee -> employee.getJobTitle() == "arch")
                .collect(Collectors.toList());

        List<String> collect1 = employeeList.stream()
                .map(employee -> employee.getName())
                .collect(Collectors.toList());

        System.out.println(reduce1);
    }
}
