function calculateAreaCircumference(e){
    e.preventDefault();
    const radius = parseFloat(document.getElementById("radius").value);
    const area = Math.PI * radius * radius;
    const circumference = 2 * Math.PI * radius;
    document.getElementsByClassName("my-div")[0].innerHTML=`Area: ${area} <br> Circumference: ${circumference}`;
    document.getElementById("radius").value=""
}