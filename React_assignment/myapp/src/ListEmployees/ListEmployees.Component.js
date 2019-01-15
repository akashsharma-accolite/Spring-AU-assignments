import React, { Component } from 'react';
import "./ListEmployees.Component.css";

class ListComponent extends Component
{
    render()
    {
        console.log("Employees",this.props.employees);
        let newEmployee=this.props.employees.map((employee,i) =>
        {
            return i;
        });

        return (<div>
            <h1>Employees</h1>
            <table>
                <caption>List of Employees</caption>
                <tr>
                    <th>Name</th>
                    <th>Age</th>
                    <th>Location</th>
                    <th>Department</th>
                </tr>
            {
                this.props.employees && this.props.employees.map((employee,i) =>
                {
                    return (
                        <tr key={employee.name}>
                          <td>{employee.name + " " + employee.lname}</td>
                          <td>{employee.age}</td>
                          <td>{employee.location}</td>
                          <td>{employee.department}</td>
                        </tr>
                      );
                })
            }
            </table>
        </div>);
    }
}


export default ListComponent;