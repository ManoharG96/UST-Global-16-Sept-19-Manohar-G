var names=['kavya','ruchika','rashmi','choto']
console.log('For each Loop')
names.forEach(function(value,index){
    console.log("names=",value)
    console.log("names Index=",index)
})
console.log('================');

var brands=['lakme','dazler','maybeline','popup']
console.log('For each Loop')
brands.forEach(function(value,index){
    console.log("brand=",value)
    console.log("brands index=",index)
})
console.log('================');

var color =['red','green','black','pnk']
console.log('For each Loop')
color.forEach(function(value,index){
    console.log("color=",value)
    console.log("color Index=",index)
})
console.log('================');

var item=['kajal','lipbalm','coldcream','nailpolish']
console.log('For each Loop')
item.forEach(function(value,index){
    console.log("item=",value)
    console.log("item Index=",index)
})
console.log('================');

var dress=['kurti','jeans','shorts','leggings']
console.log('For each Loop')
dress.forEach(function(value,index){
    console.log("dress=",value)
    console.log("dress Index=",index)
})
console.log('================');

var items=[{
        item:'ring',
        id:1,
        price:100
},{
        item:'bracelight',
        id :2,
        price:180
},{
        item:'slipper',
        id:3,
        price:2000
},{
        item:'makeup kit',
        id:4,
        price:208
}]
    items.forEach(function(item,index){
    console.log('Item=',item)
    console.log('Index of items=',index)
})
console.log('================');

var brands=[{
        brand:'kf',
        id:1,
        price:100
},{
        brand:'white and black',
        id :2,
        price:180
},{
        brand:'vodka',
        id:3,
        price:2000
},{
        brand:'breezer',
        id:4,
        price:208
}]
    brands.forEach(function(brand,index){
    console.log('brand=',brand)
    console.log('Index of brand=',index)
})
console.log('================');

var color=[{
        color:'red',
        id:1,
        price:100
},{
        color:'blue',
        id :2,
        price:180
},{
        color:'pink',
        id:3,
        price:2000
},{
        color:'green',
        id:4,
        price:208
}]
    color.forEach(function(color,index){
    console.log('color=',color)
    console.log('color of items=',index)
})