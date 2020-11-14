<!DOCTYPE html>

<html>
	<head>
		<title>PHP Demo</title>
	</head>
	<body>
		<?php
			$usernames = array("root");
			if(strlen($_POST['password']) < 6) {
				echo "<p style=\"color:red;\">Password is too short!</p>";
			} else {
				array_push($usernames, $_POST['username']);
				echo "<p style=\"color:green;\">" . $_POST['username'] . " is now registered!</p>";
			}
			echo "<br/>";
			foreach ($usernames as $uname) {
				echo $uname . ", ";
			}
		?>
	</body>
</html>
