//circumference of circle
// function name
function circumference(r){
    var c =2*3.14*r;
    return c;
}
var b= circumference(5);
console.log("circumference of circle (function name)="+b);
//circumference of circle
//function expression
var circumference = function (r){
    var c =2*3.14*r;
    return c;
}
var b= circumference(5);
console.log("circumference of circle (function expression)="+b);

//circumference of circle
//anonymous function
(function (r){
    var c =2*3.14*r;
    console.log("circumference of circle (anonymous function)="+c);
}(5));
//circumference of circle
//lambda function
var circumference=(r)=>{
    var c=2*3.14*r;
    return c;
}
var b =circumference(5);
console.log("circumference of circle (lambada function)="+b);

