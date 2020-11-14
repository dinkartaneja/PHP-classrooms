<!DOCTYPE html>
<html>
<head>
	<title>Functions in PHP</title>
</head>
<body>
<?php
	function sum($a, $b) {
		return $a + $b;
	}
	$result = sum(10, 20);
	echo "10 + 20 = $result </br>";
	////////////////////////////////
	// inner-function
	function foo() {
		echo "Inside foo!</br>";
		function goo() {
			echo "Inside goo!</br>";
		}
	}
	// goo();
	// first need to call foo then goo is visible
	foo();
	goo();
	//////////////////////////////////
	// recursive function
	function my_array_sum($array) {
		$sum = 0;
		foreach($array as $num) {
			$sum = $sum + $num;
		}
		return $sum;
	}
	echo my_array_sum(array(1, 2, 3, 4, 5)) . "</br>";
	// default values
	function array_sum_recursive($array, $index = 0) {
		if($index < count($array)) {
			return $array[$index] + array_sum_recursive($array, $index + 1);
		}
	}
	echo array_sum_recursive(array(1, 2, 3, 4, 5)) . "</br>";
	///////////////////////////////////////////////////////////
	// recursive array print
	function array_print_recursive($array, $index = 0) {
		if($index < count($array)) {
			echo $array[$index++] . ", ";
			array_print_recursive($array, $index);
		}
	}
	function array_print_recursive_reverse($array, $index = 0) {
		if($index < count($array)) {
			array_print_recursive_reverse($array, ++$index);
			echo $array[$index - 1] . ", ";
		}
	}
	array_print_recursive(array("a", "b", "c"));
	echo "</br>";
	array_print_recursive_reverse(array("a", "b", "c"));
	echo "</br>";
	//////////////////////////////////////////////
	// define functions inside conditional statements
	if(true) {
		function hoo() {
			echo "Hi!</br>";
		}
	}
	hoo();
	/////////////////////////////////////////////////
	// Calling parameters by references
	$balance = 100;
	function deduct(&$balance, $value) {
		$balance = $balance - $value;
	}
	deduct($balance, 20);
	echo "your balance is : $balance </br>";
	/////////////////////////////////////////////
	// default value parameters always come at the right most position
	function show_balance($account, $balance = 0) {
		echo "Your current balance is : $balance in $account </br>";
	}
	show_balance("chequeing");
	////////////////////////////////////////////
	// variable functions
	function iwanttogohome() {
		echo "Please let us go! </br>";
	}
	$never = 'iwanttogohome';
	$never();
	///////////////////////////////////////////
	function button_pushed($callback) {
		// bla bla bla
		echo "Internal button_pushed functions! </br>";
		$callback();
	}
	// function myFunction() {}
	button_pushed(function(){
		echo "The code that I injected into button_pushed! </br>";
	});
	button_pushed(function(){
		echo "Another code that I injected into button_pushed! </br>";
	});
?>
</body>
</html>






