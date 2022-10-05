var map1 = new Map();
map1.set("first name", "Robb");
map1.set("lastname", "stark");
map1.set("friend1", "Bran").set("friend2", "Arya");
console.log(map1);
console.log("map1 has friend3?" + map1.has("friend3"));
console.log("get value for key = friend3-" + map1.get("friend3"));
console.log("delete element with key=friend2-" + map1.delete("friend2"));
map1.clear();
console.log(map1);
class Employee {
  constructor(id, name) {
    this.id = id;
    this.name = name;
  }
  detail() {
    document.writeln(this.id + "" + this.name + "<br>");
  }
}

//passing object to a variable
var e1 = new Employee(101, "Michael");
var e2 = new Employee(102, "Bob");
e1.detail();
e2.detail();
