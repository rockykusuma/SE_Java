<?php
session_start();
if (!(isset($_SESSION['username']) && $_SESSION['username'] != '')) 
{
echo "<script>
alert('Please Login');
window.location.href='index.php';
</script>";
}
else
{
?>	
<link href="bootstrap/css/bootstrap.css" rel="stylesheet">
<?php

// Error reporting:
error_reporting(E_ALL^E_NOTICE);
include "db.php";
include "discuss.class.php";

$id= $_GET['id'];
$video= $_GET['video_name'];
$x= $_GET['number'];

//echo $id;
//echo $video;
//echo $x;

$_SESSION['video']=$x;
$_SESSION['id']=$id;
$_SESSION['video_name']=$video;

$back= "test.php?id=".$id."&video_name=".$video."&number=".$x;

//echo $_SESSION['id'];
//echo $_SESSION['video_name'];
//echo $_SESSION['video'];

/*
/	Select all the comments and populate the $comments array with objects
*/



?>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>PCS Forum</title>
<link href="bootstrap/css/bootstrap-responsive.css" rel="stylesheet">
<link href="bootstrap/css/bootstrap.css" rel="stylesheet">
   	
</head>


<body>

<a href="<?php echo $back; ?>"> Go back to the video </a>

<?php

/*
/	Output the comments one by one:
*/
$comments = array();
$result = mysql_query("SELECT name,question FROM forum where video=".$x."");
while($row2=mysql_fetch_assoc($result))
{

		echo"<div class='well'>";
		echo "<legend><Strong>".$row2['question']."</Strong></legend>";
		$_SESSION["question"]=$row2['question'];
		
	$ss = mysql_query("SELECT * FROM forum where question='".$row2['question']."';");
	while($row = mysql_fetch_assoc($ss))
	{
		echo "posted by:" .$row['name'];
						echo "<div class='well'>";
						echo "answer:".$row["answer"];
						echo "</div>";
		
	}

?>
<form action="save.php"  method="POST">
<div class="control-group">
                        <!-- Username -->
                        <label class="control-label"  for="Add an Answer:">Add an Answer:</label>
                        <div class="controls">
				<input type="text" id="add" name="add" >
							<div class="control-group">
                        <!-- Button -->
                        <div class="controls">
                          <button class="btn btn-success">Submit Comment</button>
                        </div>
                      </div>
                    </fieldset>
                  </form>       
</div>

<?php 
}
}
?>

	
    
</body>
</html>