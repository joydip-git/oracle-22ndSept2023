var a = 10
var b = 20

if (a > b) {
    console.log(a)
}
else
    console.log(b)

while (a > 5) {
    console.log(a)
    a--
}
do {
    console.log(a)
    a--
} while (a > 0)

var choice = 3
switch (choice) {
    case 1:
        console.log('first case')
        break;

    case 2:
        console.log('second case')
        break;

    default:
        console.log('default case')
        break;
}