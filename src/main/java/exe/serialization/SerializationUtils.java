package exe.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationUtils {
	
	public static void serializeValue(String fileName,Object obj) throws IOException,FileNotFoundException{
		FileOutputStream outputValue = new FileOutputStream(fileName);
		ObjectOutputStream outputStream = new ObjectOutputStream(outputValue);
		outputStream.writeObject(obj);
		outputStream.close();
	}

}
