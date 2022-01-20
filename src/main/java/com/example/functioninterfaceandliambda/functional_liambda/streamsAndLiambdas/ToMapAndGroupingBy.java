package com.example.functioninterfaceandliambda.functional_liambda.streamsAndLiambdas;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ToMapAndGroupingBy {

    public static class Employee {

        private String name;
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
        Employee[] employees = {
                new Employee("Dima", 23, " jun", 500),
                new Employee("qqq", 25, " middle", 1000),
                new Employee("www", 54, " sen", 3000),
                new Employee("eee", 44, "arch", 5000),
                new Employee("ewee", 434, "arch", 5000),
        };

        List<Employee> employeeList = Arrays.asList(employees);

        //собрать по ключу jobTitle и значению равному сумме зарплаты для ключа
        Map<String, Integer> collect = employeeList.stream()
                .collect(Collectors.groupingBy(employee -> employee.getJobTitle()))
                .entrySet() //мапу в сет мап
                .stream()
                .collect(Collectors.toMap( // из сета в мапу и манипулируем ключом и значением
                        entry -> entry.getKey(),
                        entry -> entry.getValue().stream()
                                .map(employee -> employee.salary)
                                .reduce(0, (acc, x) -> acc + x)
                ));
        System.out.println(collect);


    }


}
