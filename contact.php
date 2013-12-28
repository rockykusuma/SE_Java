

<?php
session_start();
if (!(isset($_SESSION['username']) && $_SESSION['username'] != ''))
{
	$id3="Unknown";
}
else
{
	$id3=$_SESSION['username'];
}
?>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <title>PCS</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <script language=JavaScript>
			function clickIE4()
				{
					if (event.button==2){
							return false;
				}
			}
			
			function clickNS4(e)
			{
				if (document.layers||document.getElementById&&!document.all){
					if (e.which==2||e.which==3){
						return false;
									}
					}
			}
			
			if (document.layers){
			document.captureEvents(Event.MOUSEDOWN);
			document.onmousedown=clickNS4;
			}
			else if (document.all&&!document.getElementById){
			document.onmousedown=clickIE4;
			}
			
			document.oncontextmenu=new Function("return false")
			
			// --> 
</script>

    <!-- Le styles -->
    <link href="bootstrap/css/bootstrap.css" rel="stylesheet">
    <style type="text/css">
      body {
        padding-top: 20px;
        padding-bottom: 60px;
      }
	  iframe{
    overflow:hidden;
}

      /* Custom container */
      .container {
        margin: 0 auto;
        max-width: 1000px;
      }
      .container > hr {
        margin: 60px 0;
      }

      /* Main marketing message and sign up button */
      .jumbotron {
        margin: 80px 0;
        text-align: center;
      }
      .jumbotron h1 {
        font-size: 100px;
        line-height: 1;
      }
      .jumbotron .lead {
        font-size: 24px;
        line-height: 1.25;
      }
      .jumbotron .btn {
        font-size: 21px;
        padding: 14px 24px;
      }

      /* Supporting marketing content */
      .marketing {
        margin: 60px 0;
      }
      .marketing p + h4 {
        margin-top: 28px;
      }


      /* Customize the navbar links to be fill the entire space of the .navbar */
      .navbar .navbar-inner {
        padding: 0;
      }
      .navbar .nav {
        margin: 0;
        display: table;
        width: 100%;
      }
      .navbar .nav li {
        display: table-cell;
        width: 1%;
        float: none;
      }
      .navbar .nav li a {
        font-weight: bold;
        text-align: center;
        border-left: 1px solid rgba(255,255,255,.75);
        border-right: 1px solid rgba(0,0,0,.1);
      }
      .navbar .nav li:first-child a {
        border-left: 0;
        border-radius: 3px 0 0 3px;
      }
      .navbar .nav li:last-child a {
        border-right: 0;
        border-radius: 0 3px 3px 0;
      }
    </style>
	
    <link href="bootstrap/css/bootstrap-responsive.css" rel="stylesheet">
   	<script src="bootstrap/js/jquery.js"></script>
	<script src="bootstrap/js/bootstrap.min.js"></script>
    <script src="http://bootsnipp.com/js/prettify.js"></script>
    <script src="http://bootsnipp.com/js/codemirror.js"></script>
    <script src="http://bootsnipp.com/js/humane.min.js"></script>

    <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
      <script src="../assets/js/html5shiv.js"></script>
    <![endif]-->

    <!-- Fav and touch icons -->
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="../assets/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="../assets/ico/apple-touch-icon-114-precomposed.png">
      <link rel="apple-touch-icon-precomposed" sizes="72x72" href="../assets/ico/apple-touch-icon-72-precomposed.png">
                    <link rel="apple-touch-icon-precomposed" href="../assets/ico/apple-touch-icon-57-precomposed.png">
                                   <link rel="shortcut icon" href="../assets/ico/favicon.png">
  </head>

  <body>


  <div class="container">

      <div class="masthead">
        <table><tr><td><h3 class="muted">Predictable Convergent Solutions</h3></td> <!-- <td width=700px" align="right"><h6><u><a href="employeelogin.php">Employee login</a></u></h6> -->
          <!-- <h4 class="muted"><a href="loginpage.php">Have an Account?</a></h4> --></td></tr></table>
        
         
        <div class="navbar">
          <div class="navbar-inner">
            <div class="container">
              <ul class="nav">
                <li><a href="index.php">Home</a></li>
                <li  ><a href="aboutus.html">About us</a></li>
                <li ><a href="wheel.htm">Watch Videos</a></li>
                <li class="active"><a href="#">Contact</a></li>
              </ul>
            </div>
          </div>
        </div><!-- /.navbar -->
      </div>
      <!-- Jumbotron -->
      

      

  <div>
         <div class="span10">
  <div id="preview">
        <div class="" id="loginModal">
         <div class="#">
            <div class="well">
              <ul class="nav nav-tabs">
              
                <li class="tab-pane active in"  ><a href="#create" data-toggle="tab">Contact us</a></li>
              </ul>
              <div id="myTabContent" class="tab-content">
                         <div class="tab-pane active in" id="create">



 

      <!-- Jumbotron -->
     <div class="span8">
		<form class="form-horizontal" id="contact" method='post'  action="updateunkownuser.php">
	  <fieldset>
	    <legend>Please feel free to contact us...</legend>
	    <div class="control-group">
	      <label class="control-label" for="input01">Name</label>
	      <div class="controls">
	        <input type="text" class="input-large" id="name" name="name" rel="popover" data-content="Enter your first and last name." data-original-title="Full Name">
	        
	      </div>
	</div>
    <div class="control-group">
	      <label class="control-label" for="input01">Email</label>
	      <div class="controls">
	        <input type="text" class="input-large" id="email" name="email" rel="popover" data-content="What is your mail id?" data-original-title="email">
	        
	      </div>
	</div>
    <div class="control-group">
	      <label class="control-label" for="input01">Message</label>
	      <div class="controls">
	        <input type="text" class="input-xxlarge" id="msg" name="msg" rel="popover" data-content="Enter your first and last name." data-original-title="Full Name">
	        
	      </div>
	</div>
	
	 
		
	
	<div class="control-group">
		<label class="control-label" for="input01"></label>
	      <div class="controls">
	       <button type="submit" class="btn btn-success" rel="tooltip" title="first tooltip">submit</button>
	       
	      </div>
	
	</div>
	
	
	   
	  </fieldset>
	</form>
	</div>
	
		</div>
        
        
          </div><!--/row-->
        </div><!--/span-->
      </div><!--/row-->

      <hr>

      
	  <script language=JavaScript>


//Disable right mouse click Script
//By Maximus (maximus@nsimail.com) w/ mods by DynamicDrive
//For full source code, visit http://www.dynamicdrive.com

//////////////////////////////////
function clickIE4(){
if (event.button==2){
return false;
}
}

function clickNS4(e){
if (document.layers||document.getElementById&&!document.all){
if (e.which==2||e.which==3){
return false;
}
}
}

if (document.layers){
document.captureEvents(Event.MOUSEDOWN);
document.onmousedown=clickNS4;
}
else if (document.all&&!document.getElementById){
document.onmousedown=clickIE4;
}

document.oncontextmenu=new Function("return false")

// --> 
</script>
      <script src="bootstrap/js/jquery.js"></script>
    <script src="bootstrap/js/bootstrap-transition.js"></script>
    <script src="bootstrap/js/bootstrap-alert.js"></script>
    <script src="bootstrap/js/bootstrap-modal.js"></script>
    <script src="bootstrap/js/bootstrap-dropdown.js"></script>
    <script src="bootstrap/js/bootstrap-scrollspy.js"></script>
    <script src="bootstrap/js/bootstrap-tab.js"></script>
    <script src="bootstrap/js/bootstrap-tooltip.js"></script>
    <script src="bootstrap/js/bootstrap-popover.js"></script>
	<script type="text/javascript" src="bootstrap/js/jquery.validate.js"></script>
	  <script type="text/javascript">
	 function remove_whitespaces(str){
     var str=str.replace(/^\s+|\s+$/,'');
     return str;
	}
	  $(document).ready(function(){
			$('#contact input').hover(function()
			{
			$(this).popover('hide')
		});
			$("#contact").validate({
				rules:{
					name:"required",msg:"required",
					email:{
							required:true,
							email: true
						}
						
				
				},
				
				messages:{
					name:"Enter your first and last name",
					msg:"Enter your Feedback",
					email:{
						required:"Enter your email address",
						email:"Enter valid email address"
					}
				},
				
				
				errorClass: "help-inline",
				errorElement: "span",
				highlight:function(element, errorClass, validClass) {
					$(element).parents('.control-group').addClass('error');
				},
				unhighlight: function(element, errorClass, validClass) {
					$(element).parents('.control-group').removeClass('error');
					$(element).parents('.control-group').addClass('success');
				}
			});
		});


</script>

  

  </body>
</html>




                  </form>
                </div>
            </div>
          </div>
    </div></div>

  </div>
</div>
</body>
</html>

        
