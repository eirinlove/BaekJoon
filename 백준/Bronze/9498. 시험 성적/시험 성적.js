var fs = require('fs');
var input = fs.readFileSync("/dev/stdin").toString().trim();
var score = "";
var a = parseInt(input);

function cal(data){
if ( 90 <= data ){ score = "A"}
else if ( 80 <= data && data < 90){ score = "B" }
else if ( 70 <= data && data < 80){ score = "C"}
else if ( 60 <= data && data< 70){ score = "D" }
else { score = "F" }
    return score;
                           
                       }

console.log(cal(a));