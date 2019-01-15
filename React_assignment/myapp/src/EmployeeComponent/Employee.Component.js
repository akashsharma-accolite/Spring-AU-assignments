import React, { Component } from 'react';
import "./Employee.Component.css";
import AddComponent from "../AddComponent/Add.Component";
import ListComponent from "../ListEmployees/ListEmployees.Component"
import DepartmentComponent from '../DepartmentComponent/Department.Component';
import SearchComponent from '../SearchComponent/Search.Component'
class EmployeeComponent extends Component
{
    state=
    {
        employees: [
            {
              name: "raviteja",
              lname: "V",
              age: 21,
              designation: "intern",
              location: "Mangalore, Karnataka,India, Asia, World, Earth",
              department: "IT"
            },
            {
              name: "Devraj",
              lname: "M",
              age: 21,
              designation: "intern",
              location: "Bangalore,Karnataka,India, Asia, World, Earth",
              department: "HR"
            },
            {
                name: "Akash",
                lname: "Sharma",
                age:21,
                designation: "Intern",
                location: "Bengaluru,Karnataka,India",
                department: "Finance"
            },
            {
                
                name: "kumar",
                lname: "santanu",
                age: 26,
                designation: "intern",
                location: "Patna, Bihar,India, Asia, World, Earth",
                department: "Web Dev"
            }
        ],
        departments:[
            {
                dname: "HR",
                description: "This is HR"
              },
              {
                  dname: "Finance",
                  description: "This is Finance"
              },
              {
                  dname: "IT",
                  description: "This is IT"
              },
              {
                  dname: "Web Dev",
                  description: "This is Web Dev"
              }
        ]

    }

    onEmployeeAdded = newEmployeeData =>
    {
        console.log("new Data", newEmployeeData);
        let employees=[... this.state.employees];
        employees.push(newEmployeeData);

        this.setState({employees: employees});
    }

    onDepartmentAdded = newDepartmentData =>
    {
        console.log("new Data", newDepartmentData);
        let departments=[... this.state.departments];
        //let newData=[...newDepartmentData];
        departments.push(newDepartmentData);
        this.setState({departments: departments});
    }

    render()
    {
        return (
            <React.Fragment>
                <AddComponent onEmpAdd={this.onEmployeeAdded} departments={this.state.departments}/>
                <ListComponent employees={this.state.employees}/>
                <DepartmentComponent departments={this.state.departments} onDepartmentAdded={this.onDepartmentAdded}/>
                <SearchComponent departments={this.state.departments} employees={this.state.employees}/>
                
            </React.Fragment>
        );
    }
}


export default EmployeeComponent;