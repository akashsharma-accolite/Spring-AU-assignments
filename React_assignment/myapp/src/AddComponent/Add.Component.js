import React, { Component } from "react";

class AddComponent extends Component {

  AddComponent()
  {
    var age=document.getElementById('age').value;
    var myage=parseInt(age);
    var fname=document.getElementById('name').value;
    var lname=document.getElementById('lname').value;
    var fullname=fname+lname;
    var namelength=fullname.length;
  }
  
  data = {};
  state = {
    shown: false,
    agevalidation:false,
    namevalidation:false
  };
  onClick = () => {
    this.setState({ shown: true });
  };
  onCancel = e => {
    e.preventDefault();
    this.setState({ shown: false });
  };

  handleChange = event => {
      console.log(event);
      this.data[event.target.id] = event.target.value;
    
  };


  add = e => {
    e.preventDefault();
    //this.setState({shown:false});
    console.log("data", this.data);
    this.props.onEmpAdd(this.data);
  };

  render() {
    return (
      <div>
        <button onClick={this.onClick}>Add Employee</button>
        {this.state.shown && (
          <div>
            <form>
              <div>
                <span>Name: </span>
                <input id="name" type="text" id="name" onChange={this.handleChange} required/>
              </div>

              <div>
                <span>Last Name: </span>
                <input id="lname" type="text" id="lname" onChange={this.handleChange} required/>
              </div>

              <div>
                <span>Age: </span>
                <input type="number" id="age" onChange={this.handleChange} required/>
              </div>

              <div>
                <span>Designation: </span>
                <input
                  type="text"
                  id="designation"
                  onChange={this.handleChange}
                />
              </div>

              <div>
                <span>Location: </span>
                <input type="text" id="location" onChange={this.handleChange} />
              </div>

              <div>
                <span>Department: </span> 
                <select id="dept">
                {this.props.departments && this.props.departments.map((departments,i) => {
                    return(
                        <option>{departments.dname}</option>
                    );
                })
                }
              </select>
              </div>

              <button id="addbtn" onClick={this.add}>Add</button>
              <button onClick={this.onCancel}>Cancel</button>
            </form>

            <span id="errormsg"></span>
          </div>
        )}
      </div>
    );

    //return <div>AddComponent</div>;
  }
}

export default AddComponent;
