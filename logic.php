<!DOCTYPE html>
<html>
<head>
	<title>Logic in PHP</title>
</head>
<body>
<?php
	// case-insensitive
	$day = True;
	$night = false;
	// logical operators
	// and, or, xor, not
	if($day == true) {
		echo "It's day!</br>";
	}
	if($day) {
		echo "It's still day!</br>";
	}
	//////////////////////////////
	// other data types in conditional statements
	$num = 10;
	if($num) {
		echo "The number is not zero!</br>";
	}
	if($num != 0) {
		echo "The number is still not zero!</br>";
	}
	// cast integers to boolean
	var_dump((bool) 0);
	var_dump((bool) 1);
	echo "</br>";
	////////////////////////////
	// Strings to boolean
	$sentence = "Hello!";
	if($sentence) {
		echo 'Anything but "0"</br>';
	}
	////////////////////////////
	// Arrays to boolean
	var_dump((bool) array());
	var_dump((bool) array(0));
	echo "</br>";
	////////////////////////////
	$records = array("SN123123", "SN613851");
	if($records) {
		echo "Finalize purchase!</br>";
	}
	/////////////////////////////
	if("false") {
		echo "false!</br>";
	} else {
		echo "not false!</br>";
	}
	//////////////////////////////
	// logical operators
	// AND operator
	// "and" and &&
	if(true and false) {
		echo "Wow!</br>";
	}
	if(true && true) {
		echo "Ok!</br>";
	}
	// OR operator
	// "or" and ||
	if(true or false) {
		echo "true or false!</br>";
	}
	if(false || false) {
		echo "Wow!</br>";
	}
	// operator precedence
	$x = true;
	$y = false;
	$z = $y or $x;
	if($z) {
		echo "Ok!</br>";
	} else {
		echo "Wow!</br>";
	}
	// either use () to give "or" higher priority or use ||
	if(0 == 'something') { // case explicitly using (bool)'something'
		echo "0 is almost something!</br>";
	}
	if(0 == 0.0) {
		echo "0 is 0.0</br>";
	}
	////////////////////////////////////////////////////////
	// example on removing an element from an array
	// find the bug!
	function remove($element, $array) {
		$index = array_search($element, $array);
		unset($array[$index]);
		return $array;
	}
	$array = ["Mir", "Alex", "Lily"];
	$array = remove("Sara", $array);
	var_dump($array);
	echo "</br>";
	/////////////////////////////////////////////////////
	// not operator
	if(!false) {
		echo "not false!</br>";
	}
	/////////////////////////////////////////////////////
	var_dump(!'Hi!');
	echo "</br>";
	//////////////////////////////////////////////////////
?>
</body>
</html>
