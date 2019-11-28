let h1Ele = document.getElementById("head1")
console.log("returing the message of id ",h1Ele)

h1Ele.textContent="cat sounds again and again meow... meow.."
// let createElement = document.createElement("button")
// createElement.textContent="click here!!!"
// console.log("Result of Creating the element: ",createElement)
// document.body.appendChild(createElement)

let ulElement = document.createElement("ul")
let l1Element = document.createElement("li")
let l2Element = document.createElement("li")
let l3Element = document.createElement("li")

l1Element.textContent="Java "
l2Element.textContent="JS "
l3Element.textContent="C# "

ulElement.appendChild(l1Element)
ulElement.appendChild(l2Element)
ulElement.appendChild(l3Element)

document.body.appendChild(ulElement)

h1Ele.style.color= "red";
ulElement.style.fontSize= "25px";
ulElement.style.color="green";
ulElement.style.fontStyle="italic"
ulElement.style.fontFamily="cursive"

function showMessage(){
    document.write("you have enter the wrong web site")
}
function changecolor(){
    let ele2 = document.getElementById("Para")
    ele2.style.color="red"
}
function changecolor1(){
    let ele2 = document.getElementById("Para")
    ele2.style.color="black"
}

function printHello(){
    // console.log("hello");
    let userName = document.getElementById("username").value
    document.getElementById("showusername").textContent = userName;
}

let name="chubby"
let age=23
let phoneNo= 9916452165
console.log(`name is ${name} age is ${age} phone no is ${phoneNo}`)
console.log(`2+2 = ${2+2}`)