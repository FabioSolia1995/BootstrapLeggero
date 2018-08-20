/*   BootstrapLeggero (Alpha 0.1) : Light Bootstrap Generator
 * 
 * 	 Copyright (C) 2018 Fabio Solia <solia.fabio@hotmail.it>
 * 	
 *	 This file is part of BootstrapLeggero.
 *
 *   BootstrapLeggero is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   BootstrapLeggero is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with BootstrapLeggero.  If not, see <http://www.gnu.org/licenses/>.
 */

import java.io.File;
import java.util.Scanner;

public class ReadHTMLFile {

	//Declaration Variable and Object
	int cont;
	String[][] value;
	String line = "";
	int i = 0;

	public String mainFile(String txtHTML) throws Exception{

		//Takes the file as input
		java.io.File file = new File(txtHTML);

		//Scan the file
		@SuppressWarnings("resource")
		Scanner input = new Scanner(file);
		
		//Read the file on text
		while(input.hasNext()){
			line = line + input.nextLine() + "\n";
		}

		return line;
	}
}
