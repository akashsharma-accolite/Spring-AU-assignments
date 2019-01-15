import React, { Component } from 'react';


class AddDepartmentComponent extends Component
{
    data={};
    state={
        shown: false
    };

    onClick=() =>
    {
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
        this.props.onDeptAdd(this.data);
      };

    render()
    {
        return(
            <div>
        <button onClick={this.onClick}>Add Department</button>
        {this.state.shown && (
          <div>
            <form id="myform">
              <div>
                <span>Department Name: </span>
                <input type="text" id="dname" onChange={this.handleChange} />
              </div>

              <div>
                <span>Description: </span>
                <input type="text" id="description" onChange={this.handleChange} />
              </div>

              <button onClick={this.add}>Add</button>
              <button onClick={this.onCancel}>Cancel</button>
            </form>

          </div>
        )}
      </div>
        );
    }
}

export default AddDepartmentComponent;
