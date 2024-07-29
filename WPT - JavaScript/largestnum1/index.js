const LargetAmong3 = (e) => {
    e.preventDefault()
    const num1 = parseInt(document.getElementById("num1").value)
    const num2 = parseInt(document.getElementById("num2").value)
    const num3 = parseInt(document.getElementById("num2").value)
    const largestNum = (num1 > num2 && num1 > num3) ? num1 : (num2 > num3) ? num2 : num3
    console.log(largestNum)
    document.getElementsByClassName("result")[0].innerHTML = `The largest number is ${largestNum}`
}