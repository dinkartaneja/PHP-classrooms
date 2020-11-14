<!DOCTYPE html>
<html>
<head>
	<title>Constants in PHP</title>
</head>
<body>
<?php
	define("pi", 3.14);
	echo pi;
	echo "</br>";
	////////////////////
	define("e", 2.7, true);
	echo E;
	echo "</br>";
	///////////////////
	define("name", "Mir");
	echo name;
	echo "</br>";
	////////////////////
	define("records", ["A", "B", "C"]);
	var_dump(records);
	echo "</br>";
	///////////////////
	$money = 2500;
	switch($money) {
		case 2500:
			echo "You can buy a MacBook!</br>";
			// if you don't have break you're gonna fall through
		case 1500:
			echo "You can buy an iPhone!</br>";
			
		case 500:
			echo "You can buy a used phone!</br>";
			
		case 50:
			echo "You can buy anything from Microsoft!</br>";
		
		default:  // else
			echo "We can't help you!</br>";
	}
	
?>
</body>
</html>









