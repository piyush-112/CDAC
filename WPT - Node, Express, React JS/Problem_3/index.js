const printEven = (e) => {
    e.preventDefault()
    const num = parseInt(document.getElementById("num").value)
    if (isNaN(num)) {
        document.getElementsByClassName("result")[0].innerHTML="Enter Integer in Number field"
        return
    }
    let i = 0
    while (i<=num) {
        if (i%2==0) {
            document.getElementsByClassName("result")[0].innerHTML+=i+" "
        }
        i++;
    }
}