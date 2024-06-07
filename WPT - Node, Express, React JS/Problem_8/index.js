const calculatePower = (e) => {
    e.preventDefault()
    let num = parseFloat(document.getElementById("num").value)
    const exponent = parseFloat(document.getElementById("exponent").value)
    if (isNaN(num) || isNaN(exponent)) {
        document.getElementsByClassName("result")[0].innerHTML = "Enter Integer in Number field"
        return
    }
    let result = 1;
    if (exponent === 0)
        result = 1;
    else
        for (let i = 1; i <= exponent; i++) {
            result = num*result;
        }
    document.getElementsByClassName("result")[0].innerHTML = `${num}<sup>${exponent}</sup> = ${result}`
}