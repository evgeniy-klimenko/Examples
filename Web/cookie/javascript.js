var loggin = prompt('Enter your loggin');
var password = prompt('Enter your password');


var old = document.cookie;
document.cookie = "Loggin=" + loggin + "; Password=" + password + ";";
setCookie("MyCookie", document.cookie, new Date(), "index.html", loggin, password);
var nev = getCookie("MyCookie");
alert(nev);

function setCookie(name, value, expires, path, domain, secure, loggin, password) {
    var curCookie = name + "=" + escape(value) + "; expires=" + expires.toGMTString() + "; path=" + path + "; domain=" + domain + "; secure" + "Loggin=" + loggin + "; Password=" + password + ";";

}




function getCookie(name) {
    var mas =  document.cookie.match(name);
    if (mas) {var cook = mas[0].split(/=/); 
    return decodeURIComponent(cook[1])};

    return document.cookie;
}


