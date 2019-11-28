//self invoked functions or IIFC (immediate invoked function expression)
console.log("hello");
(function (a,b){
    console.log("sum:",a+b)
}) (13,20)

//fat arrow
var div=(a,b)=>{
    console.log("diving of two numbers"+a/b)
}
div(10,20)

var c = num => {
    console.log(""+num)
}
c(10)
//defining the function before declearing the function

greeting ("chandan")
function greeting (mes){
    console.log("hello ",mes)
}
greet ("dinga");
var greet = function(mess){
console.log("hi ", mess);
}
