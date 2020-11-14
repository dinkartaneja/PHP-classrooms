<!DOCTYPE html>

<html>
	<head>
		<title>OOP</title>
	</head>
	<body>
		<?php
            class Point {
                public $x = 0;
                public $y = 0;
                
                function distance($p) {
                    $deltaX = abs($this->x - $p->x);
                    $deltaY = abs($this->y - $p->y);
                    return sqrt(pow($deltaX, 2) + pow($deltaY, 2));
                }
            }
            class Line {
                // Composition
                public function __construct() {
                    $this->start = new Point();
                    $this->end = new Point();
                }
                
                function length() {
                    $deltaX = abs($this->start->x - $this->end->x);
                    $deltaY = abs($this->start->y - $this->end->y);
                    return sqrt(pow($deltaX, 2) + pow($deltaY, 2));
                }
            }
            $p1 = new Point();
            $p2 = new Point();
            $p2->x = 3;
            $p2->y = 4;
            echo "Distance is: " . $p1->distance($p2);
            echo "</br>";
            //////////////////////////////////////////////
            $myLine = new Line();
            $myLine->start->x = 3;
            $myLine->start->y = 4;
            echo "Length of my line is: " . $myLine->length();
            echo "</br>";
            //////////////////////////////////////////////
			class Demo {
				// field variables
				public $name = 'Mir';
				public $age = 25;
				// functions
				function printName() {
					echo "Name is: " . $this->name;
				}
			}
			$person = new Demo();
			$person->printName();
			echo "<br/>";
			echo "Age is: " . $person->age;
            echo "<br/>";
            var_dump($person);
            ///////////////////////////////////////////////
            class Animal {
                // Constructor
                public function __construct($name) {
                    $this->name = $name;
                }
                function printName() {
                    echo "<p>" . $this->name . "</p>";
                }
            }
            $lion = new Animal("Lion");
            $lion->printName();
		?>
	</body>
</html>
