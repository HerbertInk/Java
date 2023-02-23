package simple_client_server_with_serializable;

import java.io.File;
import java.io.Serializable;


public class serializableClass implements Serializable{
    public String regno;
    public String surname;
    public File myfile;
    public serializableClass(){
        regno="";
        surname = "";
        myfile = null;
    }
}
