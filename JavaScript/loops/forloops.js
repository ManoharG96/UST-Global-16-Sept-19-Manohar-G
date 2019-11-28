var people=["rahitya", "nithin", "adi"]
console.log("for of loop")
console.log("Names of the people: ")
for (var elements of people){
    console.log(elements)
}
console.log("----------------")
console.log("for in loop")
for (var index in people){
    console.log("Names of the people: ",index)
    // console.log()
}
var personname={
    name:"rai",
    age:65,
    color:"white"
}
console.log("person details:")
for (var key in personname){
    console.log(""+[key]+" "+personname[key])
}
console.log("----------------")
console.log("forEach method")
var movies=["akhil","evaru","maya","thouba"]
movies.forEach(function(name,index){
    console.log("Movie name is: ",name," index value: ",index)
})
console.log("----------------")
console.log("forEach in objects")
var fItems=[{
    item:"bangle",
    id:1,
    price:200
},{
    item:"eyeliner",
    id:2,
    price:200
},{
    item:"bike",
    id:3,
    price:1000
}
]
fItems.forEach(function(items,index){
    console.log("Items: "+items)
    console.log("index value: "+index)
})
