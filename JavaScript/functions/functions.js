
function add (num1,num2){
console.log("adding two number: ",num1+num2)
}
add (30,40)
console.log("-----------------")
var mul = function(a,b){
    var res=a*b;
    return res;
}
var res1 = mul(20,30)
console.log("multiply of two numbers is "+res1)

console.log("-----------------")
//no function overloading
function add(a,b,c){
console.log("sum is ",a+b+c)

}

function add(x,y){
    console.log("sum is ",a+b)
    
    }
add (2,3,6)

//self invoked functions or IIFE (immediate invoke function expression)
(function (a,b){
    console.log("sum is ",a+b)
}) (2,3)

console.log("-----------------")
//var div=()