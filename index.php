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
                <li class="active"><a href="#">Home</a></li>
                <li ><a href="aboutus.html">About us</a></li>
                <li ><a href="wheel.htm">Watch Videos</a></li>
                <li><a href="contact.php">Contact</a></li>
              </ul>
            </div>
          </div>
        </div><!-- /.navbar -->
      </div>

      <!-- Jumbotron -->
      

      

      <!-- Example row of columns -->
      <div class="row-fluid">
        <div class="span8">
          
        <iframe src="swf.htm" width="595px" height="323px "></iframe>
          
          
          
        </div>
        <div class="span4">
        <div id="preview">
        <h5>User Login</h5>
<div class="well">
              
              <div id="myTabContent" class="tab-content">
                <div class="tab-pane active in" id="login">
                  <form action="user_login.php" id="track" method="POST">
                    <fieldset>
                      <div class="control-group">
                        <!-- Username -->
                        <label class="control-label"  for="username">Username</label>
                        <div class="controls">
                          <input type="text" id="username" name="username" data-content='Whats your Name?' data-original-title='Ref Id'" >
                        </div>
                      </div>
                      <div class="control-group">
                        <!-- Username -->
                        <label class="control-label"  for="password">password</label>
                        <div class="controls">
                          <input type="password" id="password" name="password" data-content='Whats your Password?' data-original-title='Ref Id'" >
                        </div>
                      </div>
 
                       
 
                      <div class="control-group">
                        <!-- Button -->
                        <div class="controls">
                          <button class="btn btn-success">Login</button>
                        </div>
                      </div>
                    </fieldset>
                  </form>                
                </div>
               
  
    <!-- Placed at the end of the document so the pages load faster -->
	<script src="bootstrap/js/jquery.js"></script>
<script language=JavaScript>
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
	  $(document).ready(function(){
			$('#track input').hover(function()
			{
			$(this).popover('hide')
		});
			$("#track").validate({
				rules:{
					username:"required",
			    	password:{
						required:true,
						minlength: 4
					},
                    	},
				messages:{
					username:"Enter your Name",
					password:{
						required:"Enter your password",
						minlength:"Password must be minimum 4 characters"
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
