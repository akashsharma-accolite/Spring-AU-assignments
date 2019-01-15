import React, { Component } from 'react';


class SearchComponent extends Component
{
    

    constructor(props){
        super(props);
    }

    onSearch = e =>{
        console.log(employees);
        var index = document.getElementById('dept').value;
        var employees = this.props.employees;
        var departments = this.props.departments;
        var res="<table>";
        for(var i=0; i<employees.length; i++){
            if(index==employees[i].department)
                res+="<tr><td>"+employees[i].name+"</td><td>"+employees[i].lname+"</td><td>"+employees[i].age+"</td><td>"+employees[i].designation+"</td><td>"+employees[i].location+"</td><td>"+employees[i].department+"</td></tr>";
        }
        res+="</table>"
        document.getElementById('tableDept').innerHTML=res;
        //console.log(res);
        //console.log(emp, dept);
    }


    render()
    {
        console.log(this.props.employees);
        return (
            <div>
                 Select Department ?<br></br>
                 <button onClick={ this.onSearch }>Search By Dept</button>
                 <select id="dept">
                    {this.props.departments && this.props.departments.map((departments,i) => {
                    return(
                        <option>{departments.dname}</option>
                    );
                })
                }
              </select> 
                <div id="tableDept">
                </div>
            </div>
        );
    }
}

export default SearchComponent;