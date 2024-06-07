class Rectangle {
    constructor(length, breadth){
        this.length = length;
        this.breadth = breadth;
    }
    displayRectangleDetails(){
        console.log("Length of Rectangle: "+this.length);
        console.log("Breadth of Rectangle: "+this.breadth);
        console.log("Area of Rectangle: "+(this.length*this.breadth));
        console.log("Perimeter of Rectangle: "+2*(this.length+this.breadth));
    }
}

class Circle {
    constructor(radius){
        this.radius = radius;
    }
        displayCircleDetails(){
        console.log("Radius of Circle: "+ this.radius);
        console.log("Area of Circle: "+ Math.PI * this.radius * this.radius);
        console.log("Circumference of Circle: "+ 2 * Math.PI * this.radius);
    }
}

function acceptData(){
    const length = parseFloat(prompt("Enter Length of Rectangle: "));
    const breadth = parseFloat(prompt("Enter Breadth of Rectangle: "));
    const radius = parseFloat(prompt("Enter Radius of Circle: "));
    
    const rectangleObject = new Rectangle(length, breadth);
    const circleObject = new Circle (radius);
    
    rectangleObject.displayRectangleDetails();
    circleObject.displayCircleDetails();
}

acceptData();
