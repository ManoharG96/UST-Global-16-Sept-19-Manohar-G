let myName : string = "Rahitya";
console.log(myName, typeof myName);

let age : number;
age : 26;
console.log(age, typeof age);

let mobileNo = 99164105;
console.log(mobileNo, typeof mobileNo);

let address;
address = "kajsdsyigaf";
address = 654;
console.log(address, typeof address);

let calAge = function() : void {
    console.log("age is 26")
}
calAge();

let calAge1 = function() : string {
    console.log("age is 45")
    return;
}
calAge1();

class person {
    constructor (public name:string, public age: number){}
}

let person1 = new person("Munna", 24)
console.log(person1)

class student extends person{
    constructor (name:string, age: number, public mobileNum : number){
        super(name, age);
    }
}
let student1 = new student("Munna", 78, 958744)
console.log(student1)