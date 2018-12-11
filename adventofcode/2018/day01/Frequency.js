const fs = require('fs');

var stdinBuffer = fs.readFileSync(0);
var stdinString = stdinBuffer.toString();
var input_list = stdinString.split("\n");

var frequency = 0;
input_list.forEach(function(entry){
  if(entry.length != 0) frequency = parseInt(frequency) + parseInt(entry);
});

console.log(frequency);
