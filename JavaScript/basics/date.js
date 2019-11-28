var todayDate=new Date();
console.log('Todays Date',todayDate);

console.log("today day",todayDate.getDay())
console.log("month ",todayDate.getMonth())
console.log("year",todayDate.getFullYear())
console.log("today date",todayDate.getDate())

console.log("-------------------")
var constMilli = new Date(0)
console.log("Date "+constMilli)
var constString = new Date("nov 10")
console.log("Date string constructor "+constString)
var constYear = new Date(2017,10)
console.log("Date year constructor "+constYear)

var a = Math.random()
console.log("randow b/w 1-100: "+a*100)

var a = Math.random()
console.log("randow b/w 1-100: "+a*100)

var a=new Date("jan 10");
console.log(""+a)