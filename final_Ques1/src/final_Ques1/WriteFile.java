package final_Ques1;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
public class WriteFile {
	private String path;
	private boolean append_to_file = false;
	//public overloading constructors
	public WriteFile(String file_path)
	{ path = file_path; }
	public WriteFile( String file_path , boolean append_value )
	{ path = file_path; append_to_file = append_value; }
	//public method to write a text file
	public void writeToFile( String textLine ) throws IOException {
	//create the text file object
	FileWriter objwrite = new FileWriter( path , append_to_file);
	//create the object to be printed
	PrintWriter print_line = new PrintWriter( objwrite );
	print_line.printf("%s"+"%n",textLine);
	print_line.close();
	}
	}