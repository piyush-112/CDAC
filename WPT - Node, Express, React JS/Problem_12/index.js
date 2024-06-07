const employees = [];

function acceptEmployeesName(){
    for(let i=0; i<6;i++){
        let employee = prompt("Enter name of Employee: ");
        employees.push(employee);
    }
    employees.sort();
    console.log("Sorted Employees: ");
    for(const e of employees){
        console.log(e);
    }
}

acceptEmployeesName();

