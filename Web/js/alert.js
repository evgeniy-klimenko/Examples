function fibonachi(n) {
  var a = 1,
    b = 1;
  for (var i = 3; i <= n; i++) {
    var c = a + b;
    a = b;
    b = c;
  }
  return b;
}

alert( fibonachi(5) );
alert( fibonachi(10) );
alert( fibonachi(100) );