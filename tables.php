<!DOCTYPE html>

<html>
	<head>
		<title>Table Example</title>
	</head>
	<body>
		<?php
			$records = array(
				array(
					'Student ID' => 1001,
					'Student Name' => 'Mir',
					'Department' => 'Computer Science'
				),
				array(
					'Student ID' => 1002,
					'Student Name' => 'Alex',
					'Department' => 'Fasion Design'
				)
			);
			foreach (array_column($records, 'Student ID') as $id) {
				echo $id . '<br/>';
			}
			/////////////////////////////////////////////////////////
			$table = array(
					'Student ID' => array(1001, 1002),
					'Student Name' => array('Mir', 'Alex'),
					'Department' => array('Computer Science', 'Fasion Design')
			);
			echo '<table style="width: 100%">';
			echo '<tr>';
			foreach (array_keys($table) as $header) {
				echo '<th>' . $header . '</th>';
			}
			echo '</tr>';
			for($row = 0; $row < count($table[array_keys($table)[0]]); $row++) {
				echo '<tr>';
				foreach (array_column($table, $row) as $entry) {
					echo '<td>' . $entry . '</td>';
				}
				echo '</tr>';
			}
			//////////////////////////////////////////////////////////////
			$headers = array('Student ID', 'Student Name', 'Department');
			$students = array(
				array(1001, 'Mir', 'Computer Science'),
				array(1002, 'Alex', 'Fasion Design')
			);
			echo '<table style="width: 100%">';
			echo '<tr>';
			foreach ($headers as $header) {
				echo '<th>' . $header . '</th>';
			}
			echo '</tr>';
			for($row = 0; $row < count($students); $row++) {
				echo '<tr>';
				for($col = 0; $col < count($students[$row]); $col++) {
					echo '<td>' . $students[$row][$col] . '</td>';
				}
				echo '</tr>';
			}
			echo '</table>';
		?>
	</body>
</html>
