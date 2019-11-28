const person = {
                name : "sundare",
                age : 23,
                color : "brown",
                address : {
                    city : "bangalore",
                    state : "karnataka",
                    pinCode : 583115
                },
            hobbies : ['coding', 'bird watching', 'singing']
}
console.log(person)
const jsonObject = JSON.stringify(person)
console.log(jsonObject)
const javaScriptPersonObject = JSON.parse(jsonObject)
console.log(javaScriptPersonObject)

localStorage.setItem('email','person')
let value = localStorage.getItem('email')
console.log(value)
localStorage.clear();