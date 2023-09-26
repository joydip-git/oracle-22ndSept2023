
public abstract class DataReader {
	protected String data;
	
	public DataReader() {}
	
	public String getData() {
		return data;
	}
	
	public abstract void readData();
	public abstract void writeData(String dataToWrite);	
}
