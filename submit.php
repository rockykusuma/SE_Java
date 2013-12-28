<?php

// Error reporting:
error_reporting(E_ALL^E_NOTICE);
session_start();

include "db.php";
	mysql_query("INSERT INTO comments(name,body,video) VALUES ('".$_SESSION['username']."','".$_POST["msg"]."','".$_SESSION['video']."')");

	//header("location: watch.php");
	
	header("location: test.php?id=".$_SESSION['id']."&video_name=".$_SESSION['video_name']."&number=".$_SESSION['video']."");



?>