const items =[{
    name : 'ear rings', id : 1, price : 5000},
    {name : 'kajal', id :2, price : 1000},
    {name : 'trimmer', id :3, price : 3000},
    {name : 'beardo', id : 4, price : 170
}]

const item=items.map(function(item,index){
    item.price=item.price+300;
    return item;
})
console.log(item)

const item1=items.map(value=>{
    value.price+300
    return value;
})
console.log(item1)

const obj = items.filter(items=>items.price>2000)
console.log(obj);