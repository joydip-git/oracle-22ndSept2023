//var numbers = [1, 2, 3, 4]
//var numbers = new Array(1, 2, 3, 4)
var numbers = []
for (var j = 0; j < 3; j++) {
    var strValue = window.prompt("enter a value", "0")
    var numValue = Number(strValue)
    numbers.push(numValue)
}

for (var i = 0; i < numbers.length; i++) {
    console.log(numbers[i])
}

//numbers.splice(0, 1)
numbers.splice(0, 1, 40)
console.log(numbers)

numbers.unshift(10)
console.log(numbers)