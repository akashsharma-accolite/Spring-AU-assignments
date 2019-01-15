import React, { Component } from "react";
import "./Department.Component.css";
import AddDepartmentComponent from "../AddDepartment/AddDepartment.Component";
import ListDepartmentComponent from "../ListDepartment/ListDepartment.Component";
class DepartmentComponent extends Component {
  render() {
    return (
      <React.Fragment>
        <AddDepartmentComponent onDeptAdd={this.props.onDepartmentAdded} />
        <ListDepartmentComponent departments={this.props.departments} />
      </React.Fragment>
    );
  }
}

export default DepartmentComponent;
