import React, { Component } from 'react';


export const ChildComponent = props =>
{
    let localFn=() =>
    {
        props.onUpdate("hello");
    };

    return(
        <div>
            <button
            onClick={localFn}> Send Data Back</button>
        </div>
    );
    
  //return (React.createElement("div",null,React.createElement("div",null,props.name)));
};


//export default ChildComponent;