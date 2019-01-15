import React, { Component } from 'react';



class ListDepartmentComponent extends Component
{
    render()
    {
        console.log("Departments",this.props.departments);
        let newDepartment=this.props.departments.map((department,i) =>
        {
            return i;
        });

        return (<div>
            <h1>Departments</h1>
            <table>
                <caption>List of Departments</caption>
                <tr>
                    <th>Name of Department</th>
                    <th>Description</th>
                </tr>
            {
                this.props.departments && this.props.departments.map((department,i) =>
                {
                    return (
                        <tr key={department.dname}>
                          <td>{department.dname}</td>
                          <td>{department.description}</td>
                        </tr>
                      );
                })
            }
            </table>
        </div>);   
    }
}

export default ListDepartmentComponent;