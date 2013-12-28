<?php
include("db.php");
session_start();
$date = new DateTime();
echo "\n";
echo "insert into forum values(".$_SESSION['video'].",'".$_SESSION['username']."','".$_SESSION["question"]."','".$_POST["add"]."','2013-12-04 16:54:02')";
$r = mysql_query("insert into forum values(".$_SESSION['video'].",'".$_SESSION['username']."','".$_SESSION["question"]."','".$_POST["add"]."','2013-12-04 16:54:02');");
header("location:./test.php?id=".$_SESSION['id']."&video_name=".$_SESSION['video_name']."&number=".$_SESSION['video']."");

?>