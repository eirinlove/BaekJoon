var fs = require('fs');
var input =  fs.readFileSync('/dev/stdin').toString().split(" ");
var A = parseInt(input[0]);
var B = parseInt(input[1]);


console.log(A+B);
console.log(A-B);
console.log(A*B);
console.log(parseInt(A/B));
console.log(A%B);