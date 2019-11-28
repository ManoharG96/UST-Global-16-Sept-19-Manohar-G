const message = new Promise(function(resolve,reject){
    if(30>10){
        resolve([{
            name : "Rahitya",
            age : 23
        },{
            name : "Munna",
            age : 26
        }])
    }
    
    else
    reject('failed')
})

message.then(function(data){
    console.log("success message: ",data)
}).catch(function(error){
    console.log("failure message: ",error)
})
console.log("-------------")
function outerFunc(num){
    function innerFunc(){
        let count = num +10;
        return count;
    }
    return innerFunc;
}
let inerFunc = outerFunc(20)
let counter = inerFunc()
console.log("function value: ",counter)

const person={
    name : "munna",
    age : 21
}
const addr={
    state : "Karnataka",
    city : "Bangalore"
}
let personData = {...person, ...addr}
console.log(personData)

let personData1 = {...person}
personData1.age=personData1.age+30

console.log(personData1)

