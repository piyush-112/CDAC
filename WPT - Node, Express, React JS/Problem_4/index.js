const calculate = (e) => {
    e.preventDefault()
    const num1 = parseFloat(document.getElementById("num1").value)
    const num2 = parseFloat(document.getElementById("num2").value)
    if (isNaN(num1) || isNaN(num2)) {
        document.getElementsByClassName("result")[0].innerHTML="Enter Integer in Number field"
        return
    }
    console.log(e.submitter.value)
    const key = e.submitter.value
    switch (key) {
        case '+':
            document.getElementsByClassName("result")[0].innerHTML = `Addition: ${num1 + num2}`
            break;

        case '-':
            document.getElementsByClassName("result")[0].innerHTML = `Subtraction: ${num1 - num2}`
            break;

        case '*':
            document.getElementsByClassName("result")[0].innerHTML = `Multiplication: ${num1 * num2}`
            break;

        case '/':
            document.getElementsByClassName("result")[0].innerHTML = `Division: ${num1 / num2}`
            break;

        default:
            document.getElementsByClassName("result")[0].innerHTML = "Invalid Input"
            break;
    }
}