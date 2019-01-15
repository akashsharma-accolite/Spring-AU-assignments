import React, { Component } from 'react';
import { ChildComponent } from './Child.component';


class ParentComponent extends Component
{
    state={
        name: "Akash"
    };

    constructor()
    {
        super();
        this.handleClick=this.handleClick.bind(this);
    }

    onUpdate = data =>
    {
        console.log("Yeah we got data from Child",data);
    };

    handleClick()
    {
        setTimeout(() =>{
        
            this.setState({
                name: "Akash Sharma"
            });
        },2000);
    }

    render(){
        return (
            <div>
                <button onClick={this.handleClick}>Change Name</button>
                 <span>Hello</span>
                <ChildComponent name={this.state.name} onUpdate={this.onUpdate}/>
            </div>
        );
    }
}

export default ParentComponent;