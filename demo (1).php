<!DOCTYPE html>

<html>
	<head>
		<title>PHP Demo</title>
	</head>
	<body>
		<center>
			<h1>
			<?php
				echo "Hello, World!";
			?>
			</h1>
		</center>
		<!-- Variables -->
		<?php
			$number = 10;		// integer variable
			$name = "Mir";		// string
			$pi = 3.14;			// floating point variable
			$holiday = False;	// boolean variable
			echo "Name is $name <br/>";
			echo "Number is " . $number . "<br/>";
			// adding two numbers
			$a = 2000;
			$b = 19;
			echo "Result of $a + $b is " . ($a + $b) . "<br/>";
			// Operators
			// Arithmetic
			// +, -, *, /, %
			// Logical
			// &&, ||, !
			// Conditional Statements
			$c = $a + $b;
			if($c > 2020) {
				echo "We're getting old!<br/>";
			} else {
				echo "Still young!<br/>";
			}
			// Comparison operators
			// >, <, >=, <=, !=, ==, ===, !==
			// Loops
			// while loop
			$num = 5;
			while($num >= 0) {
				if($num != 0) {
					echo $num . ", ";
				} else {
					echo $num;
				}
				$num = $num - 1;
			}
			echo "<br/>";
			// for loop
			for($row = 0; $row < 10; $row++) {
				echo $row . ", ";
			}
			echo "<br/>";
			// Arrays
			$names = array("Jack", "Lily", "Peter", "Alex");
			for($i = 0; $i < 4; $i++) {
				echo $names[$i] . ", ";
			}
			echo "<br/>";
			// add, append, push*
			array_push($names, "Mir");
			foreach ($names as $name) {
				echo $name . ", ";
			}
			echo "<br/>";
			// Print even numbers
			for($i = 0; $i < 10; $i++) {
				if($i % 2 == 0) {
					echo "<span style=\"color:red;\">$i</span>, ";
				} else {
					echo "<span style=\"color:green;\">$i</span>, ";
				}
			}
			echo "<br/>";
			// Second approach
			for($i = 0; $i < 10; $i = $i + 2) {
				echo $i . ", ";
			}
			echo "<br/>";
			// Search in an array of numbers an find the index to a value
			$numbers = array(1, 5, 2, 3, 6, 4, 7, 9, 0, 8);
			$search = 0;
			for($i = 0; $i < 10; $i++) {
				if($numbers[$i] == $search) {
					echo "$search was found in numbers with the index of $i";
				}
			}
			echo "<br/>";
			// Search for a person and find their city
			$cities = array("LA", "Milan", "Berlin", "Montreal", "Tehran");
			$person = "Alex";
			for($i = 0; $i < 5; $i++) {
				if($names[$i] == $person) {
					echo "$person lives in " . $cities[$i];
				}
			}
			echo "<br/>";
			// Sorting arrays
			sort($names);
			for($i = 0; $i < 5; $i++) {
				echo $names[$i] . ", ";
			}
			echo "<br/>";
			// Arrays with keys (Dictionary)
			$people = array("Alex" => "Montreal", "Lily" => "Milan", "Jack" => "LA", "Peter" => "Berlin", "Mir" => "Tehran");
			foreach ($people as $name => $city) {
				echo "$name lives in $city <br/>";
			}
			// Review
			// conditional statements
			echo "<br/>";
			$price = 149.99;
			if($price > 250.0) {
				echo "Too expensive!";
			} elseif($price > 150.0) {
				echo "Expensive!";
			} elseif($price > 50.0) {
				echo "Ok!";
			} elseif($price > 0.0 && $price < 25.0) {
				echo "Really cheap!";
			} elseif($price > 25.0 && $price <= 50.0) {
				echo "Cheap!";
			} else {
				echo "Price is negative!";
			}
			echo "<br/>";
			// ?
			$number = -1;
			// (condition) ? (value if true) : (value if false);
			echo "$number is " . ($number >= 0 ? "Positive" : "Negative");
		?>
	</body>
</html>
