
function callServer(){
    var xmlHttp = new XMLHttpRequest();
    var username = document.getElementsByName("user.username")[0].value;
    
    var url = "http://localhost:8080/bbs/checkusername.do?username=" + username;
    
    xmlHttp.onreadystatechange = function(){
    
        if (xmlHttp.readyState == 4) {
            var data = xmlHttp.responseText;
            document.getElementById("existornot").innerText = data;
        }
    };
    xmlHttp.open("GET", url, true);
    xmlHttp.send(null);
    
    
}
