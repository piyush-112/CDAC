const employeesDetailsArray = []

class Employee {
    constructor(employeeId, employeeName, salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }
}

function addEmployeeDetails() {
    const employeeId = document.getElementById("empid").value;
    const employeeName = document.getElementById("empname").value;
    const salary = document.getElementById("salary").value;

    const employee = new Employee(employeeId, employeeName, salary);

    employeesDetailsArray.push(employee);
}

function displayEmployeeDetails() {
    console.log(employeesDetailsArray)

    let str = `<table><thead><tr><th>Employee Id</th><th>Employee Name</th><th>Salary</th></tr></thead>`
    for (var iterator of employeesDetailsArray) {
        str += `<tr><td>${iterator.employeeId}</td><td>${iterator.employeeName}</td><td>${iterator.salary}</td></tr>`
    }
    str += `</table>`
    document.getElementById("details").innerHTML = str;
}







