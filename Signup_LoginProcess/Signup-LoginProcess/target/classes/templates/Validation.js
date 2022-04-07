function validate(){
let x1= document.getElementById("firstname");
if (x1.value == ""){
document.getElementById("p1").innerHTML="Firstname Should not be Empty";
    return false;
}

let x2= document.getElementById("lastname");
if (x2.value == ""){
document.getElementById("p2").innerHTML="Lastname Should not be Empty";
    return false;
}
let x2= document.getElementById("Email");
var regEx=/^[A-Z0-9][A-Z0-9._%+-]{0,63}@(?:[A-Z0-9-]{1,63}\.){1,125}[A-Z]{2,63}$/;
var validEmail = regEx.text(email);
if (x3.value==""){
    document.getElementById("p3").innerHTML="Enter a Valid Mail"
    return false;
}
if (x3.value !=validEmail){
    document.getElementById("p3").innerHTML="This is Enter not Valid";
    return false;
}else {
    return true;
}
let x4= document.getElementById("password1");
if (x4.value==""){
        document.getElementById("p4").innerHTML="Create Your password";
        return false;
}
let x5= document.getElementById("password2");
if (x5.value==""){
        document.getElementById("p5").innerHTML="Re-type Your password";
        return false;
}
if (x4.value !=x5.value){}
        document.getElementById("p5").innerHTML="Re-type Your password";
        return false;
}else{
alert("You have successfully registered")

}
}
