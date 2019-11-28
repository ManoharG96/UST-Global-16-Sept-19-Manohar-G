console.log("window object: ",window)
console.log("this keyword: ",this)
console.log(this!==window)

// alert("Insecured website")
// window.alert("website is not in private mode")
// let confirmMethod = confirm("are you sure you want to delete the file")
// console.log("confirm method result: ",confirmMethod)
// let promptMethod =prompt("enter the your name", "your name")
// console.log("prompt keyword returing: ",promptMethod)

const person={
    name: "munna",
    age:26,
    grade: "A",
    fullDetails : function(){
        return this
    }
}
let fullDetail=person.fullDetails()
console.log("person full details: ",fullDetail)