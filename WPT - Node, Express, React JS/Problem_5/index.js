const printTable = (e) =>{
    e.preventDefault()
    const num = parseInt(document.getElementById("num").value)
    if (isNaN(num)) {
        document.getElementsByClassName("result")[0].innerHTML="Enter Number in Number field"
        return
    }
    document.getElementsByClassName("result")[0].innerHTML=""
    for (let i = 1; i <= 10; i++) {
        document.getElementsByClassName("result")[0].innerHTML += `${num} * ${i} = ${num*i} <br>`
        
    }
}