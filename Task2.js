var num = +prompt('������� �����'); 
var count=0;
for (var i=0;i<=num;i++){
if(num%i==0)
count++;
}
alert(count);