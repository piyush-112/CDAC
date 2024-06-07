const printMessage=(e) =>{
    e.preventDefault()
    const num = parseInt(document.getElementById("num").value)
    console.log(num)
    if (isNaN(num)) {
        document.getElementsByClassName("result")[0].innerHTML="Enter Integer in Number field"
        return
    }
    const msg = document.getElementById("msg").value
    document.getElementsByClassName("result")[0].innerHTML=""
    for (let i = 0; i < num; i++) {
        document.getElementsByClassName("result")[0].innerHTML+=`<br> ${msg}`
        
    }
}