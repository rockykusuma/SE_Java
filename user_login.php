
<?php
include("db.php");
session_start();
$_SESSION['username']=$_POST["username"];
$_SESSION['password']=$_POST["password"];
if (!(isset($_SESSION['username']) && $_SESSION['username'] != '')&&!(isset($_SESSION['password']) && $_SESSION['password'] != '')) {
header ("Location: index.php");
}
else
{
$r = mysql_query("SELECT uname,password FROM user where uname='".$_SESSION['username']."' and password='".$_SESSION['password']."' Limit 1");

if (mysql_num_rows($r)==1)
{
echo "<script>
window.location.href='wheel.htm';
</script>";	
}
else
{
echo "<script>
alert('Invalid username or password');
window.location.href='index.php';
</script>";
}
}

?>