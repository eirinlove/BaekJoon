const fs = require('fs'); 
const input = fs.readFileSync("/dev/stdin").toString().trim();

var a = parseInt(input);
console.log(parseInt(a)-543)