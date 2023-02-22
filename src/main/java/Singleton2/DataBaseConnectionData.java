package Singleton2;

public class DataBaseConnectionData {

    private String pass;
    private String username;
    private String source;

    private static DataBaseConnectionData dataBaseConnectionData = null;


    private DataBaseConnectionData(String pass, String username, String source){

        this.pass = pass;
        this.username = username;
        this.source = source;

    }

    public static DataBaseConnectionData getInstance(String pass, String username, String source){
        if(dataBaseConnectionData == null){
            dataBaseConnectionData = new DataBaseConnectionData(pass, username, source);
        }

        return dataBaseConnectionData;
    }

    @Override
    public String toString() {
        return "DataBaseConnectionData{" +
                "pass='" + pass + '\'' +
                ", username='" + username + '\'' +
                ", source='" + source + '\'' +
                '}';
    }
}
