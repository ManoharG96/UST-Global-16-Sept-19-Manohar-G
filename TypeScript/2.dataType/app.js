var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var myName = "Rahitya";
console.log(myName, typeof myName);
var age;
age: 26;
console.log(age, typeof age);
var mobileNo = 99164105;
console.log(mobileNo, typeof mobileNo);
var address;
address = "kajsdsyigaf";
address = 654;
console.log(address, typeof address);
var calAge = function () {
    console.log("age is 26");
};
calAge();
var calAge1 = function () {
    console.log("age is 45");
    return;
};
calAge1();
var person = /** @class */ (function () {
    function person(name, age) {
        this.name = name;
        this.age = age;
    }
    return person;
}());
var person1 = new person("Munna", 24);
console.log(person1);
var student = /** @class */ (function (_super) {
    __extends(student, _super);
    function student(name, age, mobileNum) {
        var _this = _super.call(this, name, age, mobileNum) || this;
        _this.mobileNum = mobileNum;
        return _this;
    }
    return student;
}(person));
var student1 = new student("Munna", 78, 958744);
console.log(student1);
