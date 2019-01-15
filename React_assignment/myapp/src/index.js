import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import ComponentName, { FunctionComponent } from "./App";
import App from './App';
import * as serviceWorker from './serviceWorker';
import { ChildComponent } from './Child.component';
import ParentComponent from './Parent.component';
import EmployeeComponent from './EmployeeComponent/Employee.Component'
import DepartmentComponent from './DepartmentComponent/Department.Component'

ReactDOM.render(<EmployeeComponent/>, document.getElementById('root'));


// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: http://bit.ly/CRA-PWA
serviceWorker.unregister();
