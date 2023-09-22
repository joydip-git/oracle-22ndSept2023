//data types
//string, number, boolean, object

//undefined, NaN, Infinity etc.

//how variables are declared to store some value?
//ans: we declare variable name using a keyword 'var'
//var is not a data type. it is justa keyword
var intValue = 100
var floatValue = 12.34
var charData = "a" //'a'<--string
var stringData = "joydip" //'joydip' <--string
var isTrue = false

console.log(typeof intValue)
console.log(typeof floatValue)
console.log(typeof charData)
console.log(typeof stringData)
console.log(typeof isTrue)

var x
console.log(x)
console.log(typeof x)

var res = x + 12
console.log(res)
console.log(typeof res)

var a = 10
var b = 0
var divRes = a / b
console.log(divRes)
console.log(typeof divRes)

//parseX => used to convert a strint to number (int -> parseInt or float -> parseFloat)
var numberString = "12"
var intNumber = parseInt(numberString)
console.log(intNumber)

var floatString = "12.34"
var floatNumber = parseFloat(floatString)
console.log(floatNumber)

var intValue = parseInt(floatString)
console.log(intValue)

//Number method is used to convert any type of value to number data type, if possible
var boolNum = Number(false)
console.log(boolNum)

var intNum = Number(numberString)
console.log(intNum)

var floatNum = Number(floatString)
console.log(floatNum)


