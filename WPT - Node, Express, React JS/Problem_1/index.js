const getLargestNum=(e)=>{
    e.preventDefault()
    const num1 = parseFloat(document.getElementById("num1").value)
    const num2 = parseFloat(document.getElementById("num2").value)
    const num3 = parseFloat(document.getElementById("num3").value)
    const largestNum = (num1>num2 && num1>num3)?num1:(num2>num3)?num2:num3
    console.log(largestNum)
    document.getElementsByClassName("result")[0].innerHTML = `The largest number is ${largestNum}`
}