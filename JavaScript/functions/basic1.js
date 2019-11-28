function first(callback){
    setTimeout(function(){
        console.log("First Function Executed")
        console.log("Executed in First")
        callback
        ()
    },0)
    console.log("Executed")
}

function second(){
    console.log("second Function Executed")
}
first(second)
// second()
