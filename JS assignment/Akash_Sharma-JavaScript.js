//Function to create different employee objects
function createEmployee(firstname,lastname,empid,designation,gender)
{
        this.first_name=firstname;
        this.last_name=lastname;
        this.empid=empid;
        this.designation=designation;
        this.gender=gender;
}
//creation of different employees
var emp1=new createEmployee("Jim","Halpert",1,"Salesman","M");
var emp2=new createEmployee("Michael","Scott",2,"Manager","M");
var emp3=new createEmployee("Dwight","Schrute",3,"Assistant to the Regional Manager","M");

//Adding a new function using prototype
createEmployee.prototype.displayFn=function()
{
        console.log("The name of the employee is "+this.first_name+" "+this.last_name+" ");
        console.log("The ID of the employee is "+this.empid);
        console.log("The designation of the employee is "+this.designation);
        console.log("The gender of the employee is "+this.gender);
}

emp1.displayFn();
//Adding new properties to objects using dunder proto
emp2.__proto__.experience="5 years";
console.log(emp2.experience);

//Adding new properties to functions and objects using prototype and dunder proto respectively
createEmployee.prototype.salary=function()
{
        var sal=prompt("Enter salary of employee");
        return sal;
}

emp1.__proto__.sal=emp1.salary();
console.log(emp1.sal);

//Demonstrating the use of call and bind functions

let HR = {name:"Toby Flenderson", department:"HR"};

var greeting = function(a,b,c){
    return "Everybody hates "+this.name+" from "+this.department+" ";
};

console.log("Printing using call");
console.log(greeting.call(HR));

console.log("Now using bind");
var bound=greeting.bind(HR);

console.log(bound());

