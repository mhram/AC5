
public class Server implements DataCenter { //we can't create an object from an abstract class so server is a none-abstract class 

	public String type;
	public String location;


@Override
public int numberofrack() {
	return 3;
}

@Override
public boolean havesecurity() {
	return true;
}	
}
 
