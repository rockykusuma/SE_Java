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
<?php

// Error reporting:
error_reporting(E_ALL^E_NOTICE);
session_start();

include "db.php";
include "comment.class.php";

$x=1;
$_SESSION['video']=$x;
/*
/	Select all the comments and populate the $comments array with objects
*/

$comments = array();
$result = mysql_query("SELECT * FROM comments where video=".$x." ORDER BY id ASC");

while($row = mysql_fetch_assoc($result))
{
	$comments[] = new Comment($row);
}

?>
            	<script src="http://code.jquery.com/jquery-latest.js"></script>
    <script>

    // This is the first thing we add ------------------------------------------
    $(document).ready(function() {
        
        $('.rate_widget').each(function(i) {
            var widget = this;
            var out_data = {
                widget_id : $(widget).attr('id'),
                fetch: 1
            };
            $.post(
                'ratings.php',
                out_data,
                function(INFO) {
                    $(widget).data( 'fsr', INFO );
                    set_votes(widget);
                },
                'json'
            );
        });
    

        $('.ratings_stars').hover(
            // Handles the mouseover
            function() {
                $(this).prevAll().andSelf().addClass('ratings_over');
                $(this).nextAll().removeClass('ratings_vote'); 
            },
            // Handles the mouseout
            function() {
                $(this).prevAll().andSelf().removeClass('ratings_over');
                // can't use 'this' because it wont contain the updated data
                set_votes($(this).parent());
            }
        );
        
        
        // This actually records the vote
        $('.ratings_stars').bind('click', function() {
            var star = this;
            var widget = $(this).parent();
            
            var clicked_data = {
                clicked_on : $(star).attr('class'),
                widget_id : $(star).parent().attr('id')
            };
            $.post(
                'ratings.php',
                clicked_data,
                function(INFO) {
                    widget.data( 'fsr', INFO );
                    set_votes(widget);
                },
                'json'
            ); 
        });
        
        
        
    });

    function set_votes(widget) {

        var avg = $(widget).data('fsr').whole_avg;
        var votes = $(widget).data('fsr').number_votes;
        var exact = $(widget).data('fsr').dec_avg;
    
        window.console && console.log('and now in set_votes, it thinks the fsr is ' + $(widget).data('fsr').number_votes);
        
        $(widget).find('.star_' + avg).prevAll().andSelf().addClass('ratings_vote');
        $(widget).find('.star_' + avg).nextAll().removeClass('ratings_vote'); 
        $(widget).find('.total_votes').text( votes + ' votes recorded (' + exact + ' rating)' );
    }
    // END FIRST THING
    



    
    
    
    
    </script>
     <style>
        .rate_widget {
            border:     1px solid #CCC;
            overflow:   visible;
            padding:    10px;
            position:   relative;
            width:      180px;
            height:     32px;
        }
        .ratings_stars {
            background: url('star_empty.png') no-repeat;
            float:      left;
            height:     28px;
            padding:    2px;
            width:      32px;
        }
        .ratings_vote {
            background: url('star_full.png') no-repeat;
        }
        .ratings_over {
            background: url('star_highlight.png') no-repeat;
        }
        .total_votes {
            background: #eaeaea;
            top: 58px;
            left: 0;
            padding: 5px;
            position:   absolute;  
        } 
        .movie_choice {
            font: 10px verdana, sans-serif;
            margin: 0 auto 40px auto;
            
        }
        </style>
</head>

	
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
                <li  class="active" ><a href="#">Watch Videos</a></li>
                <li><a href="contact.php">Contact</a></li>
              </ul>
            </div>
          </div>
        </div><!-- /.navbar -->
      </div>
      <!-- Jumbotron -->
      

      

  <div>
         <div class="span10">
    <div class="well">
              

            <video width=75% height=55% controls>
              <source src="videos/1.mp4" type="video/mp4">
              <source src="movie.ogg" type="video/ogg">
            </video>
 <div>

<div class='movie_choice'>
<h1> Basic Tutorial </h1>
    Rate: Basic Tutorial
    <div id="r1" class="rate_widget">
        <div class="star_1 ratings_stars"></div>
        <div class="star_2 ratings_stars"></div>
        <div class="star_3 ratings_stars"></div>
        <div class="star_4 ratings_stars"></div>
        <div class="star_5 ratings_stars"></div>
        <div class="total_votes">vote data</div>
    </div>
</div></div>

<?php

/*
/	Output the comments one by one:
*/

foreach($comments as $c){
	echo "<div class='well'>";
	echo $c->markup();
	echo"</div>";
}

?>
    </div>
<form id="addCommentForm" method="post" action="submit.php">
 <div class="control-group">
	      <label class="control-label" for="input01">Comment</label>
	      <div class="controls">
	        <textarea type="text" class="input-xxlarge" id="msg" name="msg" rel="popover"></textarea>     
	      </div>
	</div>
	   <div class="control-group">
		<label class="control-label" for="input01"></label>
	      <div class="controls">
	       <button type="submit" class="btn btn-success" rel="tooltip" title="first tooltip">submit</button>
	       </form>
	      </div>
	
	</div>
	
	
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

<?php
}
?>


                  </form>
                </div>
            </div>
          </div>
    </div></div>

  </div>
</div>
</body>
</html>

        
