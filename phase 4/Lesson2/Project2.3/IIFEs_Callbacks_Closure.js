//IIFE and Closure
const empid = (function () {
  let count = 0;
  return function () {
    ++count;
    return `emp${count}`;
  };
})();

console.log("New Employee IDs are listed here");
console.log("Alex:" + empid());
console.log("Dexter:" + empid());
console.log("Annie:" + empid());

//Callbacks
console.log("\n"); //to start the output from the next line
function fullName(firstName, lastName, callback) {
  console.log("My name is" + firstName + "" + lastName);
  callback(lastName);
}

var greeting = function (In) {
  console.log("Welcome" + In);
};

fullName("Alex", "Wilson", greeting);
console.log("\n");
fullName("Dexter", "Johnson", greeting);
console.log("\n");
fullName("Annie", "Butler", greeting);
