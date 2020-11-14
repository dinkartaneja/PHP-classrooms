<!DOCTYPE html>

<html>
	<head>
		<title>Functions, and Data Types</title>
	</head>
	<body>
		<?php
			$number = 20;
			function test() {
				$number = 10;  // local variable (visible inside test() function)
				echo "<p>The numbers is $number</p>";
			}
			test();

			echo "<p>The number outside of the function is $number</p>";

			function increment() {
				// static variables are only defined and initialized once
				static $counter = 0;
				echo "<p>Counter is: $counter</p>";
				$counter++;
			}
			// increment three times
			increment();
			increment();
			increment();

			// global variables
			$num1 = 5;
			$num2 = 10;
			function sum() {
				// global makes variables from outer scope visible to the function
				global $num1, $num2;
				$num1 = $num1 + $num2;
			}
			function sub() {
				$GLOBALS['num1'] = $GLOBALS['num1'] - $GLOBALS['num2'];
			}
			sum();
			echo "<p>Result of sum: $num1</p>";
			sub();
			echo "<p>Result of sub: $num1</p>";
			// data types var_dump
			$numbers = array(1, 2, 3, 4, "Hi!");
			var_dump($num1);
			echo "<br/>";
			var_dump($numbers);

			//////////////////////////////////// String functions
			$hello = "Hello, World!";

			echo "<p>The length of the string hello is: " . strlen($hello) . "</p>";
			echo "<p>There are " . str_word_count($hello) . " words in string hello</p>";
			echo "<p>Reverse of string hello is: " . strrev($hello) . "</p>";

			// finding characters and words in strings
			echo strpos($hello, "o");  // only the first one
			function strposall($haystack, $needle) {
				$offset = 0;
				$positions = array();
				while(($pos = strpos($haystack, $needle, $offset)) !== FALSE) {
					array_push($positions, $pos);
					$offset = $pos + 1;  // try with |$offset = $pos + strlen($needle);| to check the difference
				}
				return $positions;
			}
			$testString = "hello, hello, hello, hello, hello, hello, hello";
			var_dump(strposall($hello, "o"));
			echo "<br/>";
			var_dump(strposall("aa aaaa aa aaaa", "aa"));
			echo "<br/>";
			////////////////////////////////////////////////
			echo str_replace("hello", "hi", $testString);
			echo "<br/>";
			echo str_replace("aa", "xx", "aa aaa aa aaa");
			echo "<br/>";
			/////////////////////////////////////////////////
			echo str_shuffle($hello);
			echo "<br/>";
			echo str_repeat("Hi!", 10);
		?>
	</body>
</html>










