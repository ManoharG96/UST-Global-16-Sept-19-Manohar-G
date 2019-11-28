const hobb=["sleeping", "cricket", "moew", "bow"]
console.log(typeof hobb)
console.log("hobbies are "+hobb)

hobb.forEach(function(ele,ind){
    console.log("hobbies are ",ele,"its index value"+ind)
}
)
const isArrayOrNot = Array.isArray(hobb)
console.log("checking the array "+isArrayOrNot)
const hasCricket = hobb.includes("cricket")
console.log("checking the cricket object is there or not ",hasCricket)
hobb.push("volleyball","guiter")
console.log("hobb array after pushing more hobbies ",hobb)
hobb.pop()
console.log("hobb array after pop one hobbies ",hobb)
hobb.unshift("numista", "singing")
console.log("hobb array after adding at one index ",hobb)
hobb.shift()
console.log("hobb array after removing hobbie at one index ",hobb)

console.log("-----------------------")
const hobb1 = ["sleeping","eating","dancing","breathing"]
console.log("hobb array after using slice method ",hobb1)
hobb1.splice(1,2,"bird watching","guiter")
console.log("hobb array after using splice method ",hobb1)
const sliceKey = hobb1.slice(1,2)
console.log("hobb array after using slice method ",sliceKey)
const indexOfKey = hobb1.indexOf("breathing", 1)
console.log("hobb array after using indexOf method ",indexOfKey)
const joinKey = hobb1.join("//")
console.log("hobb array after using join keyword ",joinKey)

const numbers=[100,200,300,400]
const num2=numbers.map(function(val,index){
    let newValue=val+50;
    return newValue;
})
console.log(num2)
console.log("-------------------------")
const num1=numbers.map(value=>value+50);
console.log(num1)
console.log("---------------------------")
for( let i=0;i<numbers.length; i++){
    num1[i]=numbers[i]+50
}
console.log(num1)

console.log("---------------------------")
const num3=numbers.filter(function(val,index){
    if (val>200)
    return true;
    else
    return false;
})
console.log(num3)
console.log("---------------------------")
const num4=numbers.filter(val=>val>200)
console.log(num4)

const fItems=[{
    name:"Earrings",
    id:1,
    price:5000
},{
    name:"kajal",
    id:2,
    price:1000 
},{
    name:"trimmers",
    id:3,
    price:3000
},{
    name:"beardo",
    id:4,
    price:170
}]

console.log("Items in the cart: ",fItems)
console.log("-----------")

const updateFitems = fItems.map(function(item,index){
    item.price=item.price+300;
    return item;
})
console.log(updateFitems)

const filterItems = fItems.filter((item)=>item.price>1000)
console.log("items Price above 1000 ",filterItems)