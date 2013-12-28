<?php

class Comment
{
	private $data = array();
	
	public function __construct($row)
	{
		/*
		/	The constructor
		*/
		
		$this->data = $row;
	}
	public function mrkup()
	{
		$d = &$this->data;
		$d['dt'] = strtotime($d['dt']);
		return '
			<div class="comment">'.				
			'	<div class="name">'.$link_open.$d['name'].$link_close.'</div></P>
				<div class="date" title="Added at '.date('H:i \o\n d M Y',$d['dt']).'">On:'.date('d M Y',$d['dt']).'</div></p>
				`Answer:'.$d['answer'].'</p>
				
		  </div>
		  </div>
		';
	}
	
	
}

?>